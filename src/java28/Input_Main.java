package java28;

import java.io.FileInputStream;
import java.io.InputStream;

public class Input_Main {
	
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:\\Users\\smartdev100\\Desktop\\jain.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				if (i == -1) break; //더이상 읽을게 없으면 -1로 빠져나오게 만듦
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
