package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	//System.out.println(e);
			//return;
			e.printStackTrace();
		} 
		// 파일 스트림 메소드 트라이 캐치 문!
	}
}