package collections.list;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class student
{
int id;
String name;
String address;
student(int id,String name,String address)
{
  this.id=id;
  this.name=name;
  this.address=address;
}
}
public class UsingArrayLiat {
public static void main(String[] args) {
	List<student> l= new ArrayList();
	l.add(new student(1,"mira","vzm"));
	l.add(new student(2,"cle","vizag"));
	Iterator i=l.iterator();
//	while(i.hasNext())
//	{
//		student s=(student)i.next();
//		System.out.println(s.id + s.address+s.name);
//	}
//	for(int j=0;j<l.size();j++)
//	{
//		student s=(student)l.get(j);
//		System.out.println(s.id+s.address+s.name);
//	}
	for(student s:l)
	{
	System.out.println(s.id+s.name+s.address);
	}
}
}
