package collections.maps;
import java.util.*;
class miracle
{
	String name;
	String domain;
   miracle(String name,String domain)
   {
	   this.name=name;
	   this.domain=domain;
   }
	}
public class hashmap {
public static void main(String[] args) {
 String a= new String("java");
 String b="java";
 System.out.println(a.intern()==b);
}
}
