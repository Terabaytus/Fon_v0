package ru.cod;

import javax.swing.*;
import java.sql.*;

public class RequestToDB {

	// JDBC URL, username and password of MySQL server

	private final static String URL = "jdbc:mysql://10.0.67.10/smp";

	private final static String USER = "phone";

	private final static String PASSWORD = "12qwQW";

	// JDBC variables for opening and managing connection

	private static Connection con;
	private static Connection con1;
	private static Connection con2;
	private static Connection con3;
	private static Connection con4;

	private static Statement stmt;
	private static Statement stmt1;
	private static Statement stmt2;
	private static Statement stmt3;
	private static Statement stmt4;

	private static ResultSet rs;
	private static ResultSet rs1;
	private static ResultSet rs2;
	private static ResultSet rs3;
	private static int rs4;

	private static String numberChannel;

	private static String numberPhone;

	private static String recordStart;

	private static String recordStop;

	public void requestToDB(){

		//Запрос на выборку канала
	String query = "SELECT channel FROM calldetails_msg ORDER BY `id` DESC limit 1";

	try {
		// opening database connection to MySQL server
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		// getting Statement object to execute query
		stmt = con.createStatement();
		// executing SELECT query
		rs = stmt.executeQuery(query);//выполненяем запрос на выборку
		rs.next();
		numberChannel = rs.getString(1);
		System.out.println("numberChannel" + " " + numberChannel);

	} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();
	} finally {
		//close connection ,stmt and resultset here*/
		try {
			con.close();
		} catch (SQLException se) { /*can't do anything */ }
		try {
			stmt.close();
		} catch (SQLException se) { /*can't do anything */}
		try {
			rs.close();
		} catch (SQLException se) {/* can't do anything*/ }
	  }
		//конец запроса на выборку канала

	  //Запрос на выборку телефона
	  String query1 = "SELECT a.`comment`\n" +
				"FROM calldetails_msg a\n" +
				"WHERE a.msg=\"SPR_MSG_ANI_DETECT\" \n" +
				"ORDER BY a.date_time DESC limit 1";

		if(numberChannel !=null){
			try {
				con1 = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt1 = con1.createStatement();
				rs1 = stmt1.executeQuery(query1);
				rs1.next();
				numberPhone = rs1.getString(1);
				System.out.println("numberPhone" + " " + numberPhone);
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			} finally {
				//close connection ,stmt and resultset here*/
				try {
					con1.close();
				} catch (SQLException se) { /*can't do anything */ }
				try {
					stmt1.close();
				} catch (SQLException se) { /*can't do anything */}
				try {
					rs1.close();
				} catch (SQLException se) {/* can't do anything*/ }
			}
		}
		//конец запроса на выборку телефона

		//Запрос на начало записи
		String query2 = "SELECT a.`comment`\n" +
				"FROM calldetails_msg a\n" +
				"WHERE a.msg=\"RECORD_START\" \n" +
				"ORDER BY a.date_time DESC limit 1";

		if(numberPhone !=null){
			try {
				con2 = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt2 = con2.createStatement();
				rs2 = stmt2.executeQuery(query2);//выполненяем запрос на выборку
				rs2.next();
				recordStart = rs2.getString(1);
				System.out.println("recordStart" + " " + recordStart);
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			} finally {
				//close connection ,stmt and resultset here*/
				try {
					con2.close();
				} catch (SQLException se) { /*can't do anything */ }
				try {
					stmt2.close();
				} catch (SQLException se) { /*can't do anything */}
				try {
					rs2.close();
				} catch (SQLException se) {/* can't do anything*/ }
			}
		}
		//конец запроса на начало записи

		//Запрос на окончание записи
		String query3 = "SELECT a.`comment`\n" +
				"FROM calldetails_msg a\n" +
				"WHERE a.msg=\"RECORD_STOP\" \n" +
				"ORDER BY a.date_time DESC limit 1";

		if(recordStart !=null){
			try {
				con3 = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt3 = con3.createStatement();
				rs3 = stmt3.executeQuery(query3);//выполненяем запрос на выборку
				rs3.next();
				recordStop = rs3.getString(1);
				System.out.println("recordStop" + " " + recordStop);
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			} finally {
				//close connection ,stmt and resultset here*/
				try {
					con3.close();
				} catch (SQLException se) { /*can't do anything */ }
				try {
					stmt3.close();
				} catch (SQLException se) { /*can't do anything */}
				try {
					rs3.close();
				} catch (SQLException se) {/* can't do anything*/ }
			}
		}
		//конец запроса на окончание записи
		}

	//---------------СОЗДАЁМ ТАБЛИЦУ-----------------------
	 	@SuppressWarnings("unused")
		public static void createTable(){

	 	       String query4 = "CREATE TABLE IF NOT EXISTS `callInfo` (id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,"
								+ "`date_time` DATETIME NULL DEFAULT NULL,"
								+ "`channel` VARCHAR(80) NULL DEFAULT NULL COLLATE 'utf8_general_ci',"
								+ "`nuberPhone` VARCHAR(80) NULL DEFAULT NULL COLLATE 'utf8_general_ci',"
								+ "`recordStart` VARCHAR(80) NULL DEFAULT NULL COLLATE 'utf8_general_ci',"
								+ "`recordStop` VARCHAR(80) NULL DEFAULT NULL COLLATE 'latin1_general_ci')";
	 	      
	 			try {
	 				// opening database connection to MySQL server
	 				con4 = DriverManager.getConnection(URL, USER, PASSWORD);
	 				
	 				// getting Statement object to execute query
	 				stmt4 = con4.createStatement();
	 				
	 				// executing SELECT query
	 				rs4 = stmt4.executeUpdate(query4);//выполненяем запрос
	 				
	 				//rs.next();

	 				//nuberInDB = rs.getString(1);
	 				//numberchannel = rs.getString(2);

	 			} catch (SQLException sqlEx) {
	 				sqlEx.printStackTrace();
	 				JOptionPane.showMessageDialog(null, "Ошибка в программе: не верно введены данные подключения к базе данных или нет с ней соеденения.");
	 			} finally {
	 				//close connection ,stmt and resultset here*/
	 				try {
	 					con4.close();
	 				} catch (SQLException se) { /*can't do anything */ }
	 				try {
	 					stmt4.close();
	 				} catch (SQLException se) { /*can't do anything */}
	 				//try {
	 					//rs.close();
	 				//} catch (SQLException se) {/* can't do anything*/ }
	 					}
	 				}
	 	 	 //---------------КОНЕЦ-----------------------
	
	
}
