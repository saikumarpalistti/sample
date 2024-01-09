package collections.list;
class as extends RuntimeException
{
	as(String s)
	{
	 super(s);	
	}
	}
public class demoprac {
public static void main(String[] args) {
try {
	throw new as("custom exception");
} catch (as e) {
	System.out.println("aaaaaaaa");
System.out.println("exception  occ  "+e);
}
	
}
}
