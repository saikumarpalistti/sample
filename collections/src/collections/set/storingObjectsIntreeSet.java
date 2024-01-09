package collections.set;
import java.util.*;
class worker implements Comparable<worker>
{
int id;
String name;
worker(int id,String name)
{
  this.id=id;
  this.name=name;
}
public int compareTo(worker o) {
 if(id>o.id)
	return -1;
 else if(id<o.id) return 1;
 else  return 0;
}


}
public class storingObjectsIntreeSet {
public static void main(String[] args) {
	Set <worker>s=new TreeSet();
	s.add(new worker(101,"miracle"));
	s.add(new worker(102,"systems"));
	s.add(new worker(105,"miracle"));
	s.add(new worker(103,"systems"));
	for(worker w:s)
	{
		System.out.println(w.id+" "+w.name);
	}
}
}
