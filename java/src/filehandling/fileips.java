package filehandling;
import java.io.*;
public class fileips {
public static void main(String[] args) throws Throwable {
	FileInputStream fi = new FileInputStream("/home/training/filehandling/file1");
	int i;
	while((i=fi.read())!=-1)
	{
		System.out.print((char)i);
	}
}
}
