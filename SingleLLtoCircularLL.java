  
import java.util.*;
import java.io.*;
public class SingleLLtoCircularLL{


/*Linked list node */
static class Node
{
	int data;
	Node next;
};


static Node circular(Node head){
	
	Node start = head;
	while (head.next != null)
		head = head.next;
	
	head.next = start;
	return start;
}

static Node push(Node head, int data)
{
	
	Node newNode = new Node();

	
	newNode.data = data;
	newNode.next = (head);
	(head) = newNode;
	
	return head;
}
static void displayList( Node node){
	Node start = node;

	while (node.next != start)
	{
		System.out.print(" "+ node.data);
		node = node.next;
	}
	
	
	System.out.print(" " + node.data);
}


public static void main(String args[])
{
	
	Node head = null;
	head = push(head, 15);
	head = push(head, 14);
	head = push(head, 13);
	head = push(head, 22);
	head = push(head, 17);

	
	circular(head);

	System.out.print("Display list: \n");
	displayList(head);
}


}