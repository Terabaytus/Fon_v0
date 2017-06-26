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
	

	/*****************************������ �������� ������� ����������*******************************/
    @SuppressWarnings("unused")
	public static synchronized void searchUpdatings(){//��������� ������� ����������
    	
    	//---------------������ ����� ��� ��������-----------------------
    	File file = new File("C:/UpdatingsFon/");
        if (!directory1.exists())
            directory1.mkdirs();
        //---------------�����-----------------------
        
        File file1 = new File("C:/UpdatingsFon/"+ versionName1 +".exe");//����������� ������� � ���� ����� ���������� ���� ���� �� ���������
        if (file1.exists()) {

            System.out.println("���� ���������� ��� ��������.");

          } else {

            try {
                //----------------------------------------------
                client = new Socket(ipUpdatesServer, portUpdatesServer);
                //----------------------------------------------

                DataOutputStream outData = new DataOutputStream(client.getOutputStream());//������������ � socket
                double requestOnUpdating = versionNumber;
                outData.writeDouble(requestOnUpdating);//������������ ������ ������� �������

                InputStream in = client.getInputStream();
                DataInputStream din = new DataInputStream(in);

                int pong = din.readInt();// �������� ����� �� ������� ����������
                if( pong == 1){
                    client.close();
                } else {
                    if( pong == 0) {
                        downloadUpdatings();
                    }
                }
            } catch (IOException e) {
               // e.printStackTrace();
                System.out.println("��� ����� � �������� ����������.");
            }
           }
    }

    @SuppressWarnings("resource")
	public static void downloadUpdatings(){//��������� ����������

        //---------------���������-----------------------
        try {
            InputStream in = client.getInputStream();
            DataInputStream din = new DataInputStream(in);

            long fileSize = din.readLong(); // �������� ������ �����
            String fileName = din.readUTF(); //���� ����� �����
            System.out.println("fileSize."+ fileSize);

            byte[] buffer = new byte[64 * 1024];
            FileOutputStream outF = new FileOutputStream("C:/UpdatingsFon/" + fileName);
            System.out.println("��������� ����������.");

            int count, total = 0;

            while ((count = din.read(buffer, 0, (int) Math.min(buffer.length, fileSize - total))) != -1) {
                total += count;
                outF.write(buffer, 0, count);

                if (total == fileSize) {
                    break;
                }
            }
            client.close();
            JOptionPane.showMessageDialog(null, "���������� ���������");
            //---------------�������� ����� � ������������-----------------------
        	Desktop desktop = null;
        	if (Desktop.isDesktopSupported()) {
        	    desktop = Desktop.getDesktop();
        	}
        	try {
        	    desktop.open(new File("C:/UpdatingsFon/"));
        	    
        	} catch (IOException ioe) {
        	    ioe.printStackTrace();
        	}
        	//---------------�����-----------------------   
            JOptionPane.showMessageDialog(null, "�������� ������ ������ Fon � ��������� .exe");
        	 
        	checkTheFilesVersion();
           
        }catch(Exception e){
           // e.printStackTrace();
            System.out.println("����� � �������� ���������� ����������.");
        }
        //---------------�����-----------------------
    }

	
    @SuppressWarnings("unused")
	public static void checkTheFilesVersion(){//��������� �� ������� ������ ������

    	File file = new File("C://Fon_v0.0/");
        if (directory1.exists()){
        	
        	//---------------�������� ����� � ������������-----------------------
        	
        	Desktop desktop = null;
        	if (Desktop.isDesktopSupported()) {
        	    desktop = Desktop.getDesktop();
        	}
        	try {
        	    desktop.open(new File(wayOpenFolderCalldate));
        	    
        	} catch (IOException ioe) {
        	    ioe.printStackTrace();
        	}
        	//---------------�����-----------------------   
        	 JOptionPane.showMessageDialog(null, "������� ����� Fon_v0");
        }
            

    }
    /*********************************�����*********************************/

}
