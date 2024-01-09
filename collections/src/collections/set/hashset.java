package collections.set;
import java.util.*;
class emp
{
int id;
String name;
int number;
String add;
emp(int id,String name,int num,String add)
{
	this.id=id;
	this.name=name;
	this.add=add;
	number=num;
	}
}
public class hashset {
public static void main(String[] args) {
//	Set<emp> s= new HashSet();
	Set<emp> s=new LinkedHashSet();
//	Set <emp>s=new TreeSet();
	s.add(new emp(1,"mira",9878,"cle"));
	s.add(new emp(2,"sys",7845,"tem"));
	s.add(new emp(3,"soft",1245,"ware"));
	
//	for(emp e:s)
//	{
//		System.out.println(e.id+" "+e.name+" "+e.number+" "+e.add);
//	}
	
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		emp e=(emp)i.next();
		System.out.println(e.id+" "+e.name+" "+e.number+" "+e.add);
	}

}
}
