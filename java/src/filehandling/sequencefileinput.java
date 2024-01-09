package filehandling;
import java.io.*;
public class sequencefileinput {
public static void main(String[] args) throws Exception {
	FileInputStream fi = new FileInputStream("/home/training/filehandling/file1");
	FileInputStream fi1 = new FileInputStream("/home/training/filehandling/file2");
	SequenceInputStream si = new SequenceInputStream(fi,fi1);
	int i;
	while((i=si.read())!=-1)
	{
		
	System.out.print((char)i);
	}
}
}
