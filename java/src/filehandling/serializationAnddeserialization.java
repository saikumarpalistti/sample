package filehandling;

import java.io.Serializable;
import java.io.*;
class studen implements Serializable
{
 int id;
 String name;
 String address;
 transient long number;
 studen(int i,String nam,String add,long num)
 {
	 id=i;
	 name=nam;
	 address=add;
	 number=num;
 }
}
public class serializationAnddeserialization {
public static void main(String[] args) throws Throwable {
	studen s1 = new studen(1001,"saikumar","vizianagaram",7975371698l);
	studen s2 = new studen(1002,"saimukesh","vizag",8508596983l);
	FileOutputStream fop = new FileOutputStream("/home/training/filehandling/file3");
	ObjectOutputStream oo = new ObjectOutputStream(fop);
	oo.writeObject(s1);
	oo.writeObject(s2);
	System.out.println("success");
	oo.flush();
	oo.close();
	fop.close();
	
	FileInputStream fip = new FileInputStream("/home/training/filehandling/file3");
	ObjectInputStream oi = new ObjectInputStream(fip);
	studen i;
	while((i= (studen) oi.readObject())!=null)
//	studen s=(studen)i;
	System.out.println(i.id+" "+i.name+" "+i.address+" "+i.number);
}
}
