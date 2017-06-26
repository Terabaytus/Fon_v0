package ru.cod;

import com4j.EventCookie;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Main {
    
	/*********************���� ����������� ������*****************/
   
	// private static String libVersion;
  //---------------������� ����� ��� ��������-----------------------
  	static String wayToCreateFolderCalldate    = "C://Fon_v0/calldate/";
  	static String wayToCreateFolderNumberPhone = "C://Fon_v0/numberPhone/";
  	//---------------�����-----------------------
  	
  	//---------------���� �������� CALLDATE-----------------------
  	static String wayToResourceCalldate 	 = "resources/calldate/calldate.txt";
  	static String wayToResourcelibmySQL 	 = "resources/calldate/libmySQL.txt";
  	static String wayToResourceDBxmys   	 = "resources/calldate/dbxmys.txt";
  	static String wayToResourceConfig   	 = "resources/calldate/config.txt";
  	static String wayToResourceCalldateBat   = "resources/calldate/calldateBat.txt";
  	
  	static String resourceDeliveryPathCalldate 		= "C://Fon_v0/calldate/calldate.exe//";
  	static String resourceDeliveryPathLibmySQL 		= "C://Fon_v0/calldate/libmySQL.dll//";
  	static String resourceDeliveryPathDBxmys   		= "C://Fon_v0/calldate/dbxmys.dll//";
  	static String resourceDeliveryPathConfig   		= "C://Fon_v0/calldate/config.ini//";
  	static String resourceDeliveryPathCalldateBat   = "C://Fon_v0/calldate/calldateBat.bat//";
  	//---------------�����-----------------------
  	
  	//---------------���� �������� NABERPHONE-----------------------
  	static String wayToResourceNumberPhone         = "resources/numberPhone/numberPhone.txt";
  	static String wayToResourcelibmySQLNumberPhone = "resources/numberPhone/libmySQL.txt";
  	static String wayToResourceDBxmysNumberPhone   = "resources/numberPhone/dbxmys.txt";
  	
  	static String resourceDeliveryPathForNumberPhone         = "C://Fon_v0/numberPhone/numberPhone.exe//";
  	static String resourceDeliveryPathForLibmySQLNumberPhone = "C://Fon_v0/numberPhone/libmySQL.dll//";
  	static String resourceDeliveryPathForDBxmysNumberPhone   = "C://Fon_v0/numberPhone/dbxmys.dll//";
  	//---------------�����-----------------------
  	
  	//---------------���� �������� �����-----------------------
  	static String wayOpenFolderCalldate    = "C://Fon_v0/calldate";
  	static String wayOpenFolderNumberPhone = "C://Fon_v0/numberPhone";
  	//---------------�����-----------------------
  	
  	//---------------���� ������� �����������-----------------------
  	static String wayTostartNumberPhone = "C://Fon_v0/numberPhone/numberPhone.exe";
  	static String wayTostartCalldateBat = "C://Fon_v0/calldate/calldateBat.bat";
  	//---------------�����-----------------------
  	
  	private static boolean controlOpen;
  	private static boolean controlClose;
  	private static boolean controlClose1;
  	static int s;
  	
  	//���� � ����� ������������
  	public static final String CREATE_TO_PROPERTIES_FOLDER = "C://FonConfigFiles";
  	public static final String CREATE_TO_PROPERTIES 	   = "C://FonConfigFiles/fonConfig.properties";
    public static final String PATH_TO_PROPERTIES 		   = "C://FonConfigFiles/fonConfig.properties";
  
    //���� � ������� ��� ������������
    static String wayToResourceFon = "resources/Fon_v0.txt";
    
    //���� � �������� ��������� � ������������
    static String loadFilesInAutostart = "C://Users/Admin/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/Fon_v0.jar";
  	/**************************�����* @return ***************************/
    /**************************�����***************************/

    @SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, IOException {
 
    	
    	TrehaedControl�all trehaedControl�all = new TrehaedControl�all();//������ ������ �� ����� TrehaedControl�all
    	
    	TrehadSearchUpdatings trehadSearchUpdatings = new TrehadSearchUpdatings();//������ ������ �� ����� TrehadSearchUpdatings
    	 
    	 //---------------��������� ���� � ������������-----------------------
    	File file = new File(loadFilesInAutostart);

           if(file.exists()){//��������� �� ������������� ���� � �����
               
               System.out.println("���� Fon ��� ���� � �������������.");//������ ���� ����
           } else {
    	
    	InputStream in7 = Main.class.getResourceAsStream(wayToResourceFon); 
    	System.out.println(in7);
    	DataInputStream din7 = new DataInputStream(in7);
    	FileOutputStream outF7 = new FileOutputStream(loadFilesInAutostart);

    	byte[] buffer7 = new byte[1024];
    	int count7 = 0;

    	while ((count7=din7.read(buffer7)) != -1){ 
    	    outF7.write(buffer7,0,count7);
    	}
    	outF7.flush();
    	outF7.close();	
           }
    	//---------------�����-----------------------
    	
        //---------------CALLDATE-----------------------
        //---------------������� ����� ��� ��������-----------------------
        File directory = new File(wayToCreateFolderCalldate);
        if (!directory.exists()){
       	 directory.mkdirs();
         
    	InputStream in = Main.class.getResourceAsStream(wayToResourceCalldate); 
    	System.out.println(in);
    	DataInputStream din = new DataInputStream(in);
    	FileOutputStream outF = new FileOutputStream(resourceDeliveryPathCalldate);

    	byte[] buffer = new byte[1024];
    	int count = 0;

    	while ((count=din.read(buffer)) != -1){ 
    	    outF.write(buffer,0,count);
    	}
    	outF.flush();
    	outF.close();	
    
    	InputStream in1 = Main.class.getResourceAsStream(wayToResourcelibmySQL); 
    	System.out.println(in1);
    	DataInputStream din1 = new DataInputStream(in1);
    	FileOutputStream outF1 = new FileOutputStream(resourceDeliveryPathLibmySQL);

    	byte[] buffer1 = new byte[1024];
    	int count1 = 0;

    	while ((count1=din1.read(buffer1)) != -1){ 
    	    outF1.write(buffer1,0,count1);
    	}
    	outF1.flush();
    	outF1.close();	
    	
    	InputStream in2 = Main.class.getResourceAsStream(wayToResourceDBxmys); 
    	System.out.println(in2);
    	DataInputStream din2 = new DataInputStream(in2);
    	FileOutputStream outF2 = new FileOutputStream(resourceDeliveryPathDBxmys);

    	byte[] buffer2 = new byte[1024];
    	int count2 = 0;

    	while ((count2=din2.read(buffer2)) != -1){ 
    	    outF2.write(buffer2,0,count2);
    	}
    	outF2.flush();
    	outF2.close();
    	
    	InputStream in3 = Main.class.getResourceAsStream(wayToResourceConfig); 
    	System.out.println(in3);
    	DataInputStream din3 = new DataInputStream(in3);
    	FileOutputStream outF3 = new FileOutputStream(resourceDeliveryPathConfig);

    	byte[] buffer3 = new byte[1024];
    	int count3 = 0;

    	while ((count3=din3.read(buffer3)) != -1){ 
    	    outF3.write(buffer3,0,count3);
    	}
    	outF3.flush();
    	outF3.close();	
    	}
        
        File file1 = new File(resourceDeliveryPathCalldateBat);
        	if(file1.exists()){//��������� �� ������������� ���� � �����
        System.out.println("���� calldateBat ��� ���� � ����������� �����");//������ ���� ����
        } else {
 	
        InputStream in8 = Main.class.getResourceAsStream(wayToResourceCalldateBat); 
    	System.out.println(in8);
    	DataInputStream din8 = new DataInputStream(in8);
    	FileOutputStream outF8 = new FileOutputStream(resourceDeliveryPathCalldateBat);

    	byte[] buffer8 = new byte[1024];
    	int count8 = 0;

    	while ((count8=din8.read(buffer8)) != -1){ 
    	    outF8.write(buffer8,0,count8);
    	}
    	outF8.flush();
    	outF8.close();	
        }/* */
        //---------------�����-----------------------
        
        //---------------NABERPHONE-----------------------
        File directory1 = new File(wayToCreateFolderNumberPhone);
        if (!directory1.exists()){
       	 directory1.mkdirs();
       	
    	InputStream in4 = Main.class.getResourceAsStream(wayToResourceNumberPhone); 
    	System.out.println(in4);
    	DataInputStream din4 = new DataInputStream(in4);
    	FileOutputStream outF4 = new FileOutputStream(resourceDeliveryPathForNumberPhone);

    	byte[] buffer4 = new byte[1024];
    	int count4 = 0;

    	while ((count4=din4.read(buffer4)) != -1){ 
    	    outF4.write(buffer4,0,count4);
    	}
    	outF4.flush();
    	outF4.close();	
    	
    	InputStream in5 = Main.class.getResourceAsStream(wayToResourcelibmySQLNumberPhone); 
    	System.out.println(in5);
    	DataInputStream din5 = new DataInputStream(in5);
    	FileOutputStream outF5 = new FileOutputStream(resourceDeliveryPathForLibmySQLNumberPhone);

    	byte[] buffer5 = new byte[1024];
    	int count5 = 0;

    	while ((count5=din5.read(buffer5)) != -1){ 
    	    outF5.write(buffer5,0,count5);
    	}
    	outF5.flush();
    	outF5.close();	
    	
    	InputStream in6 = Main.class.getResourceAsStream(wayToResourceDBxmysNumberPhone); 
    	System.out.println(in6);
    	DataInputStream din6 = new DataInputStream(in6);
    	FileOutputStream outF6 = new FileOutputStream(resourceDeliveryPathForDBxmysNumberPhone);

    	byte[] buffer6 = new byte[1024];
    	int count6 = 0;

    	while ((count6=din6.read(buffer6)) != -1){ 
    	    outF6.write(buffer6,0,count6);
    	}
    	outF6.flush();
    	outF6.close();	
    		 
        }
        //---------------�����-----------------------
    	
    	
    	//---------------�������� ����� � ������������-----------------------
    /*	
    	Desktop desktop = null;
    	if (Desktop.isDesktopSupported()) {
    	    desktop = Desktop.getDesktop();
    	}
    	try {
    	    desktop.open(new File(wayOpenFolderCalldate));
    	    
    	} catch (IOException ioe) {
    	    ioe.printStackTrace();
    	}
    	*/
    	
    	//---------------�����-----------------------   
  
    	//---------------�������� ���������� �����������-----------------------  
    	String name = "calldate.exe";
        String name1 = "numberPhone.exe";
        
       //JOptionPane.showMessageDialog(null, "��������� ��������� calldate");
      
        Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "start", wayTostartCalldateBat});//��������� bat
        
       // Desktop.getDesktop().open(new File(wayTostartCalldateBat));
        
        while(true){
        for(int i = 0; i<5000; i++){//����������� 5 ������
    	s++;
     }
        if(s == 5000){//�������� ��
        	
        	controlOpen  = checkPPOpen(name);//����� ��������� ������� ����� ������������� ���� �� ������� � �������
        	checkPPOpen(name1);
        	 
        	 s=0;
        	
        	 if(controlOpen == true){//���� �� ���� �� �������� ������
        	    
        	        //������ ����������
        	        Runtime r2 = Runtime. getRuntime();
        	        Process p2 = null;
        	        String cmd2[] = {wayTostartNumberPhone};
        	        try {p2 = r2.exec(cmd2);}
        	        catch (Exception ee2) {}
        		//����� 
        	        �ontrol�all();
        	     // trehaedControl�all.run();//������ ����� �������� ������
        	      metodClose(); //��������� ����� ������� �������� �����������
        		
		}else{//����� ���������� ������
        	
			Thread.sleep( 1000);
			
			}
         }
      }	
        //---------------�����-----------------------  
  
 }  
    
   
	public static void metodClose() throws IOException, InterruptedException{
    	
    	//---------------�������� ���������� �����������-----------------------  
        String name = "calldate.exe";
        String name1 = "numberPhone.exe";
       
        while(true){//� ������ �����
        for(int i = 0; i<5000; i++){//����������� 5 ������
    	s++;
     }
        if(s == 5000){//�������� ��
        	
        	 controlClose  = checkPPOpen(name);//����� ��������� ������� ����� ������������� ���� �� ������� � �������
        	 controlClose1 = checkPPOpen(name1);
        	 
        	 s=0;
        	 
        	 if(controlClose == false){//���� ��� ��� �� �������� ���
        	
        		 System.exit(0);//� �� ��������� ��������
        		
		}else{//����� ���������� ������
        	
        		Thread.sleep( 5000);
			}
        }
        
        if(controlClose1 == false){//���� �� ��� ��� �� �������� ���
        
   		 System.exit(0);//� �� ��������� ��������
   		
	}else{//����� ���������� ������
   	
   		Thread.sleep( 5000);
		}
     }
         //---------------�����-----------------------  
    
}

	//---------------����� �������� ������-----------------------  
	@SuppressWarnings("unused")
	public static void �ontrol�all() throws InterruptedException {//����� �������� ������
		// TODO Auto-generated method stub
		
        ISpRecordClientW clientW = ru.cod.ClassFactory.createSpRecordClientW();// ������� ���������� �����������
        System.out.println("Connected " + clientW.connect(0, null, null));
        System.out.println("Connected " + clientW.connected());
        EventCookie eventCookie = clientW.advise(ISpRecordClientWEventsImpl.class, new ISpRecordClientWEventsImpl());//���������� ��� �������� �� ������� ����� ��������� �������
       /* while (true) {
            Thread.sleep(10 * 60 * 1000);
        }*/

	}
	 //---------------�����-----------------------  

	//---------------������ ������ ����� ��������� �������-----------------------  
  public static boolean checkPPOpen(String name) throws IOException {

  	String line;
  	final Process process = Runtime.getRuntime().exec("tasklist.exe");
  	final BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
  	while ((line = reader.readLine()) != null) {
  	    if (!line.contains(name)) {
  	       continue;
  	    
  	    }
  	    reader.close();
  	    return true; 
  	    
  	} 
  	reader.close();
  	return false;

  	}
  
  public static boolean checkPPOpen1(String name1) throws IOException {

  	String line;
  	final Process process = Runtime.getRuntime().exec("tasklist.exe");
  	final BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
  	while ((line = reader.readLine()) != null) {
  	    if (!line.contains(name1)) {
  	       continue;
  	    
  	    }
  	    reader.close();
  	    return true; 
  	    
  	} 
  	reader.close();
  	return false;

  	}
  //---------------�����-----------------------
  

}


// ������� ��� ����������� �� �����.
			/*	
				System.out.println(clientObj.connect(0, null, null));//����� ������������� ���������� � ���������� ������.
				System.out.println(clientObj.disconnect());//����� ��������� ���������� � ���������� ������ � ����������� ���������� �������.
				System.out.println(clientObj.getLibVersion());//����� ���������� ����� ������ � ��������� ����������.
				//System.out.println(clientObj.getSpRecordVersion(version));//����� ���������� ����� ������ � ��������� ��������� SpRecord, � ������� ����������� ����������.
				System.out.println(clientObj.waitMessage(0));//����� ������� ����������� ��������� � �������.
				System.out.println(clientObj.peekMessage(null));//����� ������ ��������� �� ������� � ������� ��� �� ���.
				//System.out.println(clientObj.getDeviceNames(names));//����� ���������� ���������� ���������, � �������� � ��������� ����� �������� ��������� ������.
				//System.out.println(clientObj.getDeviceSupport(deviceName, deviceSupport));//����� ���������� �������������� ����������� ���������� ���������� ������.
				//System.out.println(clientObj.getDeviceChannelNames(deviceName, channelFlags, names1));//����� ���������� �������� ������� ��� ���������� ���������� ������.
				
				//System.out.println(clientObj.getChannelNamesEx(channelFlags, channelSupport, readyToCall, names2));//����� ���������� ������ � ���������� �������, � �������� � ��������� ����� �������� ��������� ������ � ��������������� �������� ��������.
				
				//System.out.println(clientObj.getChannelSupport(null, channelFlags, channelSupport));//����� ���������� �������������� ����������� ���������� ������ ������.
				System.out.println(clientObj.connected());//�������� ���������� ��������� ����������� � ��������� ������.
		*/

        
        
        
        
			/*	// ������� ��� ����������� �� �����.
				System.out.println(channelclientObj.connect(libVersion, 0, null, null));//����� ������������� ���������� � ��������� ������� ������.
				System.out.println(channelclientObj.disconnect());//����� ��������� ���������� � ������� ������ � ����������� ���������� �������.
				System.out.println(channelclientObj.getLibVersion());//����� ���������� ����� ������ � ��������� ����������.
				System.out.println(channelclientObj.getSpRecordVersion(null));//����� ���������� ����� ������ � ��������� ��������� SpRecord, � ������� ����������� ����������.
				System.out.println(channelclientObj.waitMessage(0));//����� ������� ����������� ��������� � �������.
				System.out.println(channelclientObj.peekMessage(channelclientObj));//����� ������ ��������� �� ������� � ������� ��� �� ���.
				System.out.println(channelclientObj.startRecord());//����� �������� ������ �� ������.
				System.out.println(channelclientObj.stopRecord());//����� ������������� ������ ���������� �������.
				System.out.println(channelclientObj.dialNumber(libVersion, 0));//����� ���������� ������� ��������� ������� ���������� �����.
				System.out.println(channelclientObj.dialingCancel());//����� �������� ����� ������ ������� ������� DialNumber.
				System.out.println(channelclientObj.sendAudioData(libVersion, 0));//����� �������� � ����� ���� �������� ������ � �������� ����� �����.
				System.out.println(channelclientObj.clearAudioData());//����� ������� ����� � ������������� ����� ����� �� ������.
				System.out.println(channelclientObj.handsetTake());//����� �������� ����� ���������� �����, ��� ������������ ������ ������ �� ���������� ��������. ����� ������������� �������� ����� ������.
				System.out.println(channelclientObj.handsetPut());//����� ��������� ����� ���������� �����, ��� ������������, ����� ������ ������ �� ���������� ��������. ����� ������������� ��������� ����� ������.
				System.out.println(channelclientObj.getWriting(null));//����� ���������� ������� �� ������ �� ������.
				System.out.println(channelclientObj.getHandsetState(null));//����� ���������� ��������� ������ ���������� �����.
				System.out.println(channelclientObj.getLineState(null));//����� ���������� ���������� �� ���������� ����� � ������ ���������� ������.
				System.out.println(channelclientObj.getChannelHandsetState(null));//����� ���������� ������������� �� ��������� ������ ���������� ����� ������� ���������� ������. 
				System.out.println(channelclientObj.getDialing(null));//����� ���������� ������������ �� ����� ������ � ��������� ������.
				System.out.println(channelclientObj.getFileName(null));//����� ���������� ��� �����, � ������� ������������ ������ ���������.
				System.out.println(channelclientObj.getDTMFDetect(null));//����� ���������� ������� �� ����� ����������� �������� � ����� ����� ��� ������� DTMF, ������ � ������, ����� ��������� ������� �������� ���������� ������. 
				System.out.println(channelclientObj.setDTMFDetect(true));//����� �������� ��� ��������� ����� ����������� �������� � ����� ����� ��� ������� DTMF, ������ ������, ������ �������� ������� ������ � ������, ����� ��������� ������� �������� ���������� ������.
				System.out.println(channelclientObj.getAudioDataSubscribe(null));//����� ���������� ������� �� ����� ������������ �������������.
				System.out.println(channelclientObj.setAudioDataSubscribe(true));//����� �������� ��� ��������� ����� ������������ �������������. 
				System.out.println(channelclientObj.getAudioDataBufferState(null));//����� ���������� ���������� ����������� ���������� � ������ ������ �����.
				System.out.println(channelclientObj.getOutputMode(null));//����� ���������� ������� �� ����� ������.
				System.out.println(channelclientObj.setOutputMode(false));//����� �������� � ��������� ����� ������.
				System.out.println(channelclientObj.getAudioVolume(null));//����� ���������� ��������� ��������� �����������.
				System.out.println(channelclientObj.setAudioVolume(0));//����� ������������� ���������, � ������� ����������� ����� ���������� � �����.
				System.out.println(channelclientObj.getComment(null));//����� ������ ����������� ������������ � ������ ���������� ������� SetComment.
				System.out.println(channelclientObj.setComment(libVersion));//����� ������������� ����������� � ������������ �����������.
				System.out.println(channelclientObj.getChannelSupport(null));//����� ���������� �������������� ����������� ���������� ������ ������.
				System.out.println(channelclientObj.getDeviceName(null));//����� ���������� �������� ���������� ������ � ������, � ������� ������� ������.
				System.out.println(channelclientObj.getOutputSpRecordWF(null));//����� ���������� ������ �����������, � ������� ��� ���������� ���������� ������.
				System.out.println(channelclientObj.getInputSpRecordWF(null));//����� ���������� ������ �����������, � ������� ��� ��������� � ������ ������ � ���������.
				System.out.println(channelclientObj.getOutputWF(null));//����� ���������� ������ �����������, � ������� ��� ������ ������������ ������� SendAudioData.
				System.out.println(channelclientObj.getInputWF(channelclientObj));//����� ���������� ������ �����������, � ������� ��� ��������� � ������� ��������� ��� ��������� ������ ������������ �������������.
				System.out.println(channelclientObj.getReadyToCall(null));//����� ���������� �������� �� ����� ��� ���������� ���������� ������ � ��������� ������ �������.
				System.out.println(channelclientObj.getInfo(0, libVersion));//����� ���������� ����������� ���������� � ��������� ������.
				System.out.println(channelclientObj.connected());//�������� ���������� ��������� ����������� � ������ ������.

*/
	


