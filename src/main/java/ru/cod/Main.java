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
    
	/*********************БЛОК ЭКЗЕМПЛЯРОВ КЛАССА*****************/
   
	// private static String libVersion;
  //---------------СОЗДАЁМ ПАПКУ ДЛЯ ЗАГРУЗОК-----------------------
  	static String wayToCreateFolderCalldate    = "C://Fon_v0/calldate/";
  	static String wayToCreateFolderNumberPhone = "C://Fon_v0/numberPhone/";
  	//---------------КОНЕЦ-----------------------
  	
  	//---------------ПУТИ ЗАГРУЗОК CALLDATE-----------------------
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
  	//---------------КОНЕЦ-----------------------
  	
  	//---------------ПУТИ ЗАГРУЗОК NABERPHONE-----------------------
  	static String wayToResourceNumberPhone         = "resources/numberPhone/numberPhone.txt";
  	static String wayToResourcelibmySQLNumberPhone = "resources/numberPhone/libmySQL.txt";
  	static String wayToResourceDBxmysNumberPhone   = "resources/numberPhone/dbxmys.txt";
  	
  	static String resourceDeliveryPathForNumberPhone         = "C://Fon_v0/numberPhone/numberPhone.exe//";
  	static String resourceDeliveryPathForLibmySQLNumberPhone = "C://Fon_v0/numberPhone/libmySQL.dll//";
  	static String resourceDeliveryPathForDBxmysNumberPhone   = "C://Fon_v0/numberPhone/dbxmys.dll//";
  	//---------------КОНЕЦ-----------------------
  	
  	//---------------ПУТИ ОТКРЫТИЯ ПАПКИ-----------------------
  	static String wayOpenFolderCalldate    = "C://Fon_v0/calldate";
  	static String wayOpenFolderNumberPhone = "C://Fon_v0/numberPhone";
  	//---------------КОНЕЦ-----------------------
  	
  	//---------------ПУТИ ЗАПУСКА КОМПОНЕНТОВ-----------------------
  	static String wayTostartNumberPhone = "C://Fon_v0/numberPhone/numberPhone.exe";
  	static String wayTostartCalldateBat = "C://Fon_v0/calldate/calldateBat.bat";
  	//---------------КОНЕЦ-----------------------
  	
  	private static boolean controlOpen;
  	private static boolean controlClose;
  	private static boolean controlClose1;
  	static int s;
  	
  	//путь к файлу конфигураций
  	public static final String CREATE_TO_PROPERTIES_FOLDER = "C://FonConfigFiles";
  	public static final String CREATE_TO_PROPERTIES 	   = "C://FonConfigFiles/fonConfig.properties";
    public static final String PATH_TO_PROPERTIES 		   = "C://FonConfigFiles/fonConfig.properties";
  
    //путь к ресурсу для автозагрузки
    static String wayToResourceFon = "resources/Fon_v0.txt";
    
    //путь к выгрузке программы в автозагрузку
    static String loadFilesInAutostart = "C://Users/Admin/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/Fon_v0.jar";
  	/**************************КОНЕЦ* @return ***************************/
    /**************************КОНЕЦ***************************/

    @SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, IOException {
 
    	
    	TrehaedControlСall trehaedControlСall = new TrehaedControlСall();//создаём ссылку на класс TrehaedControlСall
    	
    	TrehadSearchUpdatings trehadSearchUpdatings = new TrehadSearchUpdatings();//создаём ссылку на класс TrehadSearchUpdatings
    	 
    	 //---------------ВЫГРУЖАЕМ ФАЙЛ В АВТОЗАГРУЗКИ-----------------------
    	File file = new File(loadFilesInAutostart);

           if(file.exists()){//проверяем на существование файл в папке
               
               System.out.println("Файл Fon уже есть в автозагрузках.");//истина если есть
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
    	//---------------КОНЕЦ-----------------------
    	
        //---------------CALLDATE-----------------------
        //---------------СОЗДАЁМ ПАПКУ ДЛЯ ЗАГРУЗОК-----------------------
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
        	if(file1.exists()){//проверяем на существование файл в папке
        System.out.println("Файл calldateBat уже есть в программной папке");//истина если есть
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
        //---------------КОНЕЦ-----------------------
        
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
        //---------------КОНЕЦ-----------------------
    	
    	
    	//---------------ОТКРЫТИЕ ПАПОК С КОМПОНЕНТАМИ-----------------------
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
    	
    	//---------------КОНЕЦ-----------------------   
  
    	//---------------КОНТРОЛЬ ВЫКЛЮЧЕНИЯ КОМПОНЕНТОВ-----------------------  
    	String name = "calldate.exe";
        String name1 = "numberPhone.exe";
        
       //JOptionPane.showMessageDialog(null, "Запустите программу calldate");
      
        Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "start", wayTostartCalldateBat});//запускаем bat
        
       // Desktop.getDesktop().open(new File(wayTostartCalldateBat));
        
        while(true){
        for(int i = 0; i<5000; i++){//отсчитываем 5 секунд
    	s++;
     }
        if(s == 5000){//получаем их
        	
        	controlOpen  = checkPPOpen(name);//после получения вызваем метод запрашивающий есть ли процесс в системе
        	checkPPOpen(name1);
        	 
        	 s=0;
        	
        	 if(controlOpen == true){//если он есть то приходит истина
        	    
        	        //запуск компонента
        	        Runtime r2 = Runtime. getRuntime();
        	        Process p2 = null;
        	        String cmd2[] = {wayTostartNumberPhone};
        	        try {p2 = r2.exec(cmd2);}
        	        catch (Exception ee2) {}
        		//конец 
        	        сontrolСall();
        	     // trehaedControlСall.run();//запуск метод контроля звонка
        	      metodClose(); //запускаем метод конроль закрытия компонентов
        		
		}else{//иначе продолжаем работу
        	
			Thread.sleep( 1000);
			
			}
         }
      }	
        //---------------КОНЕЦ-----------------------  
  
 }  
    
   
	public static void metodClose() throws IOException, InterruptedException{
    	
    	//---------------КОНТРОЛЬ ВЫКЛЮЧЕНИЯ КОМПОНЕНТОВ-----------------------  
        String name = "calldate.exe";
        String name1 = "numberPhone.exe";
       
        while(true){//в вечном цыкле
        for(int i = 0; i<5000; i++){//отсчитываем 5 секунд
    	s++;
     }
        if(s == 5000){//получаем их
        	
        	 controlClose  = checkPPOpen(name);//после получения вызваем метод запрашивающий есть ли процесс в системе
        	 controlClose1 = checkPPOpen(name1);
        	 
        	 s=0;
        	 
        	 if(controlClose == false){//если его нет то приходит лож
        	
        		 System.exit(0);//и мы закрываем прграмму
        		
		}else{//иначе продолжаем работу
        	
        		Thread.sleep( 5000);
			}
        }
        
        if(controlClose1 == false){//если он его нет то приходит лож
        
   		 System.exit(0);//и мы закрываем прграмму
   		
	}else{//иначе продолжаем работу
   	
   		Thread.sleep( 5000);
		}
     }
         //---------------КОНЕЦ-----------------------  
    
}

	//---------------МЕТОД КОНТРОЛЯ ЗВОНКА-----------------------  
	@SuppressWarnings("unused")
	public static void сontrolСall() throws InterruptedException {//метод контроля звонка
		// TODO Auto-generated method stub
		
        ISpRecordClientW clientW = ru.cod.ClassFactory.createSpRecordClientW();// создаем клиентское подключение
        System.out.println("Connected " + clientW.connect(0, null, null));
        System.out.println("Connected " + clientW.connected());
        EventCookie eventCookie = clientW.advise(ISpRecordClientWEventsImpl.class, new ISpRecordClientWEventsImpl());//подключаем наш листенер на который будут скидывать события
       /* while (true) {
            Thread.sleep(10 * 60 * 1000);
        }*/

	}
	 //---------------КОНЕЦ-----------------------  

	//---------------МЕТОДЫ ПОИСКА СРЕДИ ПРОЦЕССОВ СИСТЕМЫ-----------------------  
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
  //---------------КОНЕЦ-----------------------
  

}


// Выводим его возможности на экран.
			/*	
				System.out.println(clientObj.connect(0, null, null));//Метод устанавливает соединение с программой записи.
				System.out.println(clientObj.disconnect());//Метод отключает соединение с программой записи и освобождает занимаемые ресурсы.
				System.out.println(clientObj.getLibVersion());//Метод возвращает номер версии и подверсии библиотеки.
				//System.out.println(clientObj.getSpRecordVersion(version));//Метод возвращает номер версии и подверсии программы SpRecord, с которой установлено соединение.
				System.out.println(clientObj.waitMessage(0));//Метод ожидает поступления сообщения в очередь.
				System.out.println(clientObj.peekMessage(null));//Метод читает сообщение из очереди и удаляет его из нее.
				//System.out.println(clientObj.getDeviceNames(names));//Метод возвращает названиями устройств, с которыми в настоящее время работает программа записи.
				//System.out.println(clientObj.getDeviceSupport(deviceName, deviceSupport));//Метод определяет функциональные возможности указанного устройства записи.
				//System.out.println(clientObj.getDeviceChannelNames(deviceName, channelFlags, names1));//Метод возвращает названия каналов для указанного устройства записи.
				
				//System.out.println(clientObj.getChannelNamesEx(channelFlags, channelSupport, readyToCall, names2));//Метод возвращает строку с названиями каналов, с которыми в настоящее время работает программа записи и удовлетворяющих заданным условиям.
				
				//System.out.println(clientObj.getChannelSupport(null, channelFlags, channelSupport));//Метод определяет функциональные возможности указанного канала записи.
				System.out.println(clientObj.connected());//Свойство возвращает состояние подключения к программе записи.
		*/

        
        
        
        
			/*	// Выводим его возможности на экран.
				System.out.println(channelclientObj.connect(libVersion, 0, null, null));//Метод устанавливает соединение с указанным каналом записи.
				System.out.println(channelclientObj.disconnect());//Метод отключает соединение с каналом записи и освобождает занимаемые ресурсы.
				System.out.println(channelclientObj.getLibVersion());//Метод возвращает номер версии и подверсии библиотеки.
				System.out.println(channelclientObj.getSpRecordVersion(null));//Метод возвращает номер версии и подверсии программы SpRecord, с которой установлено соединение.
				System.out.println(channelclientObj.waitMessage(0));//Метод ожидает поступления сообщения в очередь.
				System.out.println(channelclientObj.peekMessage(channelclientObj));//Метод читает сообщение из очереди и удаляет его из нее.
				System.out.println(channelclientObj.startRecord());//Метод включает запись на канале.
				System.out.println(channelclientObj.stopRecord());//Метод останавливает запись включенную методом.
				System.out.println(channelclientObj.dialNumber(libVersion, 0));//Метод отправляет команду программе набрать телефонный номер.
				System.out.println(channelclientObj.dialingCancel());//Метод отменяет набор номера начатый методом DialNumber.
				System.out.println(channelclientObj.sendAudioData(libVersion, 0));//Метод посылает в линию блок звуковых данных и начинает вывод звука.
				System.out.println(channelclientObj.clearAudioData());//Метод очищает буфер и останавливает вывод звука на канале.
				System.out.println(channelclientObj.handsetTake());//Метод замыкает шлейф телефонной линии, что эквивалентно взятию трубки на телефонном аппарате. Метод автоматически включает режим вывода.
				System.out.println(channelclientObj.handsetPut());//Метод размыкает шлейф телефонной линии, что эквивалентно, когда кладут трубку на телефонном аппарате. Метод автоматически выключает режим вывода.
				System.out.println(channelclientObj.getWriting(null));//Метод определяет ведется ли запись на канале.
				System.out.println(channelclientObj.getHandsetState(null));//Метод определяет состояние шлейфа телефонной линии.
				System.out.println(channelclientObj.getLineState(null));//Метод определяет подключена ли телефонная линия к каналу устройства записи.
				System.out.println(channelclientObj.getChannelHandsetState(null));//Метод определяет производилось ли замыкание шлейфа телефонной линии каналом устройства записи. 
				System.out.println(channelclientObj.getDialing(null));//Метод определяет производится ли набор номера в настоящий момент.
				System.out.println(channelclientObj.getFileName(null));//Метод определяет имя файла, в который производится запись разговора.
				System.out.println(channelclientObj.getDTMFDetect(null));//Метод определяет включен ли режим определения сигналов в линии таких как сигналы DTMF, занято и момент, когда удаленный абонент поднимет телефонную трубку. 
				System.out.println(channelclientObj.setDTMFDetect(true));//Метод включает или выключает режим определения сигналов в линии таких как сигналы DTMF, сигнал занято, сигнал контроля посылки вызова и момент, когда удаленный абонент поднимет телефонную трубку.
				System.out.println(channelclientObj.getAudioDataSubscribe(null));//Метод определяет включен ли режим оперативного прослушивания.
				System.out.println(channelclientObj.setAudioDataSubscribe(true));//Метод включает или выключает режим оперативного прослушивания. 
				System.out.println(channelclientObj.getAudioDataBufferState(null));//Метод определяет количество миллисекунд оставшихся в буфере вывода звука.
				System.out.println(channelclientObj.getOutputMode(null));//Метод определяет включен ли режим вывода.
				System.out.println(channelclientObj.setOutputMode(false));//Метод включает и выключает режим вывода.
				System.out.println(channelclientObj.getAudioVolume(null));//Метод возвращает громкость выводимых аудиоданных.
				System.out.println(channelclientObj.setAudioVolume(0));//Метод устанавливает громкость, с которой аудиоданные будут выдаваться в линию.
				System.out.println(channelclientObj.getComment(null));//Метод читает комментарий пользователя к записи записанный методом SetComment.
				System.out.println(channelclientObj.setComment(libVersion));//Метод устанавливает комментарий к записываемой звукозаписи.
				System.out.println(channelclientObj.getChannelSupport(null));//Метод определяет функциональные возможности указанного канала записи.
				System.out.println(channelclientObj.getDeviceName(null));//Метод возвращает название устройства записи у канала, с которым ведется работа.
				System.out.println(channelclientObj.getOutputSpRecordWF(null));//Метод возвращает формат аудиоданных, в котором они передаются устройству записи.
				System.out.println(channelclientObj.getInputSpRecordWF(null));//Метод возвращает формат аудиоданных, в котором они поступают с канала записи в программу.
				System.out.println(channelclientObj.getOutputWF(null));//Метод возвращает формат аудиоданных, в котором они должны передаваться методом SendAudioData.
				System.out.println(channelclientObj.getInputWF(channelclientObj));//Метод возвращает формат аудиоданных, в котором они поступают в очередь сообщений при включении режима оперативного прослушивания.
				System.out.println(channelclientObj.getReadyToCall(null));//Метод определяет свободен ли канал для совершения исходящего звонка в настоящий момент времени.
				System.out.println(channelclientObj.getInfo(0, libVersion));//Метод возвращает запрошенную информацию о состоянии канала.
				System.out.println(channelclientObj.connected());//Свойство возвращает состояние подключения к каналу записи.

*/
	


