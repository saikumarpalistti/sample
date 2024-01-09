package filehandling;
import java.io.*;
public class fileops {
public static void main(String[] args) throws Exception{
	FileOutputStream fo = new FileOutputStream("/home/training/filehandling/file1");
	String s="miracle software systems";
	byte []b=s.getBytes();
	fo.write(b);
	System.out.println("sucess");
	fo.flush();
	fo.close();
	
}
}
