import java.util.*;
import java.util.Scanner;
class Node{
	int value;
	Node left;
	Node right;
	public Node(int value)
	{
		this.value= value;
		right=null;
		left=null;
		
	}
}
public class Binarysearchtree 
{
	static Node root;
public Binarysearchtree()
{
	this.root=null;
}
public boolean find(int datainput)
{
	Node current= root;
	while(current!=null){
		if(current.value==datainput)
		{
			return true;
		}
		else if(current.value>datainput)
		{
			current=current.left;
		}
		else{
			current=current.right;
		}
		
	}
	return false;	
}
public void insert(int datainput)
{
	Node newnode=new Node(datainput);
	if(root==null)
	{
		root=newnode;
		return;
	}
	Node current = root;
	Node parent = null;
	while(true)
	{
		parent = current;
		if(datainput<current.value)
		{				
			current = current.left;
			if(current==null)
			{
				parent.left = newnode;
				return;
			}
		}
		else
		{
			current = current.right;
			if(current==null)
			{
				parent.right = newnode;
				return;
			}
		}
	}
}
public void display(Node root){
	if(root!=null){
		display(root.left);
		System.out.print(" " + root.value);
		display(root.right);
	}
}
public static void main(String[] args){
	Binarysearchtree b = new Binarysearchtree();
	b.insert(10);
	b.insert(20);
	b.insert(5);
	b.insert(40);
	b.insert(50);
	b.display(b.root);
	System.out.println("");
	System.out.println("check whether the note exist or not"+ b.find(30));
	b.display(root);
}
}
