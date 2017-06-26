package ru.cod;

import com4j.DISPID;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("deprecation")
public class ISpRecordClientWEventsImpl extends ru.cod.events.ISpRecordClientWEvents {

	
	/*********************БЛОК ЭКЗЕМПЛЯРОВ КЛАССА*****************/
	
	// JDBC URL, username and password of MySQL server
	
	private static final String url = "jdbc:mysql://10.0.67.10/smp";
	
	private static final String user = "phone";
	
	private static final String password = "12qwQW";

	// JDBC variables for opening and managing connection
	
	private static Connection con;
	private static Connection con1;
	
	private static Statement stmt;
	private static Statement stmt1;
	
	private static ResultSet rs;
	private static ResultSet rs1;


	String nuberInDB ;
	String numberchannel;
	String callnumber;
	String callnumber1;

	int numberchannel1;
	int numberchannel2;
	int numberchannel3;
	int numberchannel4;
	int numberchannel5;
	int numberchannel6;

	// Флаги инициализации подключения с каналом

    final int SPR_CHANNEL_HARDNAME = 0x00000001;
    final int SPR_CHANNEL_USERNAME = 0x00000002;
    final int SPR_CHANNEL_EXCLUSIVE = 0x00000004;

    // Результаты выполения операций

    final int SPR_E_BASE = 0x80040200;
    final int SPR_S_BASE = 0x00040200;

    final int SPR_S_OK = 0;
    final int SPR_S_FALSE = 1;
	// Размерности данных

	final static int SPR_MAX_MSG_SIZE          = 32768;
	final static int MAX_CHANNEL_NAME_CHARS    = 48;
	final static int MAX_PHONE_NUMBER_CHARS    = 48;
	final static int MAX_SUBPHONE_NUMBER_CHARS = 24;
	final static int MAX_DEVICE_NAME_CHARS     = 64;
	final static int MAX_SEND_AUDIO_DATA_SIZE  = SPR_MAX_MSG_SIZE - 12;
	final static int MAX_COMMENT_CHARS         = 4096;
	/**************************КОНЕЦ***************************/

	@SuppressWarnings("unchecked")
	@DISPID(201)
	public void onMessage(Object msg) throws IOException {
		
		// Заголовок сообщения
		int dwMsgSize = 0;//Размер всего сообщения в байтах, включая данные или текст.
		char dwMsg = 0;// Код сообщения.
		String MsgTime = new SimpleDateFormat("yyyyMMdd  HHmmss ").format(new Date());
		
		if (msg == null) {


					String query = "SELECT id,channel,comment FROM calldetails_msg ORDER BY `id` DESC limit 1";
					
					String query1 = "SELECT a.`comment`\n" +
							"FROM calldetails_msg a\n" +
							"WHERE a.msg=\"SPR_MSG_ANI_DETECT\" \n" +
							"ORDER BY a.date_time DESC limit 1";
					
					try {
						// opening database connection to MySQL server
						con = DriverManager.getConnection(url, user, password);
						con1 = DriverManager.getConnection(url, user, password);
						// getting Statement object to execute query
						stmt = con.createStatement();
						stmt1 = con1.createStatement();
						// executing SELECT query
						rs = stmt.executeQuery(query);//выполненяем запрос на выборку
						rs1 = stmt1.executeQuery(query1);//выполненяем запрос на выборку

						rs.next();

						nuberInDB = rs.getString(1);
						numberchannel = rs.getString(2);

						rs1.next();

						callnumber = rs1.getString(1);

					} catch (SQLException sqlEx) {
						sqlEx.printStackTrace();
					} finally {
						//close connection ,stmt and resultset here*/
						try {
							con.close();
							con1.close();
						} catch (SQLException se) { /*can't do anything */ }
						try {
							stmt.close();
							stmt1.close();
						} catch (SQLException se) { /*can't do anything */}
						try {
							rs.close();
							rs1.close();
						} catch (SQLException se) {/* can't do anything*/ }
					}


			if (numberchannel.equals("T4005181 - 1")) {
				numberchannel1 = 1;
			} else {
				if (numberchannel.equals("T4005181 - 2")) {
					numberchannel1 = 2;
				} else {
					if (numberchannel.equals("T4005181 - 3")) {
						numberchannel1 = 3;
					} else {
						if (numberchannel.equals("T4005181 - 4")) {
							numberchannel1 = 4;
						} else {
							if (numberchannel.equals("T4005181 - 5")) {
								numberchannel1 = 5;
							} else {
								if (numberchannel.equals("T4005181 - 6")) {
									numberchannel1 = 6;
								}
							}
						}
					}
				}
			}

			if(callnumber.equals(callnumber1)){

				//System.out.println("Such a telephone number in the database.");

			}else{

				callnumber1 = callnumber;

				System.out.println("HEADER " + dwMsgSize + dwMsg + MsgTime + "   " + msg);
				System.out.println("SPR_S_OK");

				JSONObject jsonObject = new JSONObject();

				jsonObject.put("type", "add_popup");
				jsonObject.put("unicod", nuberInDB);
				jsonObject.put("chanel", numberchannel1);
				jsonObject.put("phone", callnumber);


				StringWriter out = new StringWriter();
				jsonObject.writeJSONString(out);

				String jsonText = out.toString();
				System.out.println(jsonText);
				String jsonBody = out.toString() ;

				DefaultHttpClient httpclient = new DefaultHttpClient();
				HttpPost http = new HttpPost("http://smp.gcrb.local/json/server.php");
				StringEntity entity = new StringEntity(jsonBody, ContentType.APPLICATION_JSON);
				http.setEntity(entity);
				String response = httpclient.execute(http, new BasicResponseHandler());
				System.out.println(response);

				/*File folder = new File("C:\\Program Files\\SpRecord3\\Records");

				File[] listOfFiles = folder.listFiles();

				Path destDir = Paths.get("//10.0.67.5//zap_files//temp");

				if (listOfFiles != null)
					for (File file : listOfFiles)
						Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);

				for (File f : listOfFiles) {
					f.delete();
				}*/

			}

		}
	}

}