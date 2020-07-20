package java28;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output_Main {
	
	public static void main(String[] args) {
		
		OutputStream os1 = null;
		
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\smartdev100\\Desktop\\jaout.txt");
			String str = "오늘은 아주 즐겁군요.";
			byte[] bs = str.getBytes();
			os.write(bs);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				if(os1 != null) os1.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
