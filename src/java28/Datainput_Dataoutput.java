package java28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Datainput_Dataoutput {
	
	public static void main(String[] args) {
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("C:\\Users\\smartdev100\\Desktop\\jain.txt");
			dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			os = new FileOutputStream("C:\\Users\\smartdev100\\Desktop\\jain_copy3.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(dos != null) {
				try {
					dos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		if(os != null) {
			try {
				os.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
