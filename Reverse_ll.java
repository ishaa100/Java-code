import java.io.*;

// A linked list Node
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class Reverse_ll{

// Function to delete the last occurrence
static Node deleteLast(Node head,int x)
{
	Node temp = head;
	Node ptr = null;
	
	while (temp != null)
	{
		
		// If found key, update
		if (temp.data == x)
			ptr = temp;
			
		temp = temp.next;
	}
	
	// If the last occurrence is the last node
	if (ptr != null && ptr.next == null)
	{
		temp = head;
		
		while (temp.next != ptr)
		{
			temp = temp.next;
		}
		temp.next = null;
	}
	
	// If it is not the last node
	if (ptr != null && ptr.next != null)
	{
		ptr.data = ptr.next.data;
		temp = ptr.next;
		ptr.next = ptr.next.next;
	}
	return head;
}

// This function prints contents of linked list
// starting from the given Node
static void display(Node head)
{
	Node temp = head;
	if (head == null)
	{
		System.out.print("NULL\n");
		return;
	}
	while (temp != null)
	{
		System.out.print( temp.data+" --> ");
		temp = temp.next;
	}
	System.out.print("NULL\n");
}

// Driver code
public static void main(String[] args)
{
	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	head.next.next.next.next.next = new Node(4);
	head.next.next.next.next.next.next = new Node(4);
	
	System.out.print("Created Linked list: ");
	display(head);
	
	// Pass the address of the head pointer
	head = deleteLast(head, 4);
	System.out.print("List after deletion of 4: ");
	display(head);
}
}

// This code is contributed by patel2127
