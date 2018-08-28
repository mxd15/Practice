import java.util.*;
import java.util.Scanner;
class mylist{
	int info;
	mylist link;
	mylist(){
		this.link=null;
	}
}
public class LinkedList {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		mylist a = new mylist();
		mylist b= new mylist();
		mylist c = new mylist();
		System.out.println("enter the info field of a node:");
		a.info= s.nextInt();
		System.out.println("enter the info field of b node:");
		b.info= s.nextInt();
		System.out.println("enter the info field of c node:");
		c.info= s.nextInt();
		a.link=b;
		b.link=c;
		while(a!=null)
		{
			System.out.print(a.info + "->");
			a=a.link;
		}
		
		System.out.print("null");
				
	}
	
	
	
	
}
