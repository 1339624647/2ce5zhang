package cn.edu.qdu.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestByteStream {
	private static Object in;

	public static void main(String[] args) throws IOException {
		// 时间毫秒数
		Long begin = System.currentTimeMillis();
		try {// buffer缓冲流
			File f=new File("E:\\eula3.1028.txt");
			f.createNewFile();
			BufferedInputStream in=new BufferedInputStream(new 
					FileInputStream("C:\\eula.1028.txt"));
			BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(f));
//			FileInputStream in = new FileInputStream("C:\\eula.1028.txt");
//			FileOutputStream out = new FileOutputStream(f);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}