package ru.cod;

import java.awt.Desktop;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SearchUpdatings {

	private static Socket client;
	
	private static String ipUpdatesServer = "78.36.168.82";
	private static int portUpdatesServer = 57000;
	
	private static String wayOpenFolderCalldate = "C://";

	private static double versionNumber;
	private static String versionName1;

	private static File directory1;
	

	/*****************************МЕТОДЫ ПРОВЕРКИ НАЛИЧИЯ ОБНОВЛЕНИЙ*******************************/
    @SuppressWarnings("unused")
	public static synchronized void searchUpdatings(){//проверяем наличие обновлений
    	
    	//---------------создаём папку для загрузок-----------------------
    	File file = new File("C:/UpdatingsFon/");
        if (!directory1.exists())
            directory1.mkdirs();
        //---------------конец-----------------------
        
        File file1 = new File("C:/UpdatingsFon/"+ versionName1 +".exe");//пророверяем наличие в паке файла обновления если есть не загружаем
        if (file1.exists()) {

            System.out.println("Файл обновления уже загружен.");

          } else {

            try {
                //----------------------------------------------
                client = new Socket(ipUpdatesServer, portUpdatesServer);
                //----------------------------------------------

                DataOutputStream outData = new DataOutputStream(client.getOutputStream());//подключаемся к socket
                double requestOnUpdating = versionNumber;
                outData.writeDouble(requestOnUpdating);//отправляется запрос клиента серверу

                InputStream in = client.getInputStream();
                DataInputStream din = new DataInputStream(in);

                int pong = din.readInt();// получаем ответ на наличие обновлений
                if( pong == 1){
                    client.close();
                } else {
                    if( pong == 0) {
                        downloadUpdatings();
                    }
                }
            } catch (IOException e) {
               // e.printStackTrace();
                System.out.println("Нет связи с сервером обновлений.");
            }
           }
    }

    @SuppressWarnings("resource")
	public static void downloadUpdatings(){//загружаем обновления

        //---------------загружаем-----------------------
        try {
            InputStream in = client.getInputStream();
            DataInputStream din = new DataInputStream(in);

            long fileSize = din.readLong(); // получаем размер файла
            String fileName = din.readUTF(); //приём имени файла
            System.out.println("fileSize."+ fileSize);

            byte[] buffer = new byte[64 * 1024];
            FileOutputStream outF = new FileOutputStream("C:/UpdatingsFon/" + fileName);
            System.out.println("Загружаем обновления.");

            int count, total = 0;

            while ((count = din.read(buffer, 0, (int) Math.min(buffer.length, fileSize - total))) != -1) {
                total += count;
                outF.write(buffer, 0, count);

                if (total == fileSize) {
                    break;
                }
            }
            client.close();
            JOptionPane.showMessageDialog(null, "Обновления загружены");
            //---------------ОТКРЫТИЕ ПАПОК С КОМПОНЕНТАМИ-----------------------
        	Desktop desktop = null;
        	if (Desktop.isDesktopSupported()) {
        	    desktop = Desktop.getDesktop();
        	}
        	try {
        	    desktop.open(new File("C:/UpdatingsFon/"));
        	    
        	} catch (IOException ioe) {
        	    ioe.printStackTrace();
        	}
        	//---------------КОНЕЦ-----------------------   
            JOptionPane.showMessageDialog(null, "Закройте старую версию Fon и запустите .exe");
        	 
        	checkTheFilesVersion();
           
        }catch(Exception e){
           // e.printStackTrace();
            System.out.println("Связь с сервером обновлений прекращена.");
        }
        //---------------конец-----------------------
    }

	
    @SuppressWarnings("unused")
	public static void checkTheFilesVersion(){//проверяем на наличие старых версий

    	File file = new File("C://Fon_v0.0/");
        if (directory1.exists()){
        	
        	//---------------ОТКРЫТИЕ ПАПОК С КОМПОНЕНТАМИ-----------------------
        	
        	Desktop desktop = null;
        	if (Desktop.isDesktopSupported()) {
        	    desktop = Desktop.getDesktop();
        	}
        	try {
        	    desktop.open(new File(wayOpenFolderCalldate));
        	    
        	} catch (IOException ioe) {
        	    ioe.printStackTrace();
        	}
        	//---------------КОНЕЦ-----------------------   
        	 JOptionPane.showMessageDialog(null, "Удалите папку Fon_v0");
        }
            

    }
    /*********************************КОНЕЦ*********************************/

}
