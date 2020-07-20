//파일 복사
package java28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Both_input_output {
	
	public static void main(String[] args) {
		
		InputStream is =null;
		OutputStream os = null;
		
		
		try {
			
			is = new FileInputStream("C:\\Users\\smartdev100\\Desktop\\jain.txt");
			os = new FileOutputStream("C:\\Users\\smartdev100\\Desktop\\jain_copy.txt");
			
			while (true) {
				int i = is.read();
				if(i==-1) break;
				os.write(i);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			
			if(is != null) {
				
				try {
					is.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			
			if(os != null) {
				
				try {
					os.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
		}
	}
