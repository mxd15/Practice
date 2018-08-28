import java.util.*;
import java.util.Scanner;
class mylist{
	int info;
	mylist link;
	mylist(){
		this.link=null;
	}
}
public class LinkedListIteration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		mylist a = new mylist();
		mylist temp= a;
		char choice;
		System.out.println("enter the data for info field");
		a.info=s.nextInt();
		while(true)
		{
			System.out.println("Do you want to enter next node");
			choice=s.next().charAt(0);
			if(choice=='n'|| choice=='N')
			{
				break;
			}
			a.link=new mylist();
			System.out.println("eneter the date for the next node");
			a.link.info=s.nextInt();
			a=a.link;
			
		}
		a=temp;
		while(a!=null)
		{
			System.out.print(a.info + "->");
			a=a.link;
		}
		System.out.print("null");
		}

}
