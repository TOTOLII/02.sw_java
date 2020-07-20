package java28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Both_input_output_5byte {
	
	public static void main(String[] args) {
		
		InputStream is = null;
	    OutputStream os = null;
	    
	    try {
			is = new FileInputStream("C:\\Users\\smartdev100\\Desktop\\jain.txt");
			os = new FileOutputStream("C:\\Users\\smartdev100\\Desktop\\jain_copy2.txt");
			
			byte[] bs = new byte[5]; //5byte씩 한번에 읽는다.
			
			while (true) {
				
				int count  = is.read(bs);
				if (count == -1) {
					break;
				}
				
				os.write(bs, 0, count);  //읽어온 값을 5byte씩 쓴다. 마지막의 경우 0부터 마지막 까지만 써라. 라는 뜻임. 
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
