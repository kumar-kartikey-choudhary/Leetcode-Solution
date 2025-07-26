package linkedlist;

public class LinkedList {
	
	public static class Node{
		
		int data ;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	//addFirst
	
	public void addFirst(int data)
	{
		//create a new node
		Node newNode = new Node(data);
		size++;
		
		//check if the node is empty of not
		//if empty the head and tail point to same node
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		
		newNode.next = head; //link
		
		head = newNode;
	}
	
	
	public void addLast(int data)
	{
		//create a new node
		Node newNode = new Node(data);
		size++;
		
		//check if the node is empty of not
		//if empty the head and tail point to same node
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode; // link
		
		tail = newNode;
	}
	
	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
	public void addMiddel(int index , int data)
	{
		if(index == 0)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		
		Node temp = head;
		for(int i = 0; i< index-1; i++)
		{
			temp= temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	
	public void removeFirst()
	{
		if(size == 0)
		{
			System.out.println("LinkedList is empty");
		}else if(size == 1)
		{
			head = tail = null;
			size =0 ;
		}
		head = head.next;
		size--;
	}
	
	public void removeLast()
	{
		if(size == 0)
		{
			System.out.println("LinkedList is empty");
		}else if(size == 1)
		{
			head = tail = null;
			size =0 ;
		}
		Node prev = head;
		for(int i = 0 ; i < size -2 ; i++)
		{
			prev = prev.next;
		}
		prev.next = null;
		tail = prev; 
		size--;
	}
	
	
	public void removeMiddle(int idx)
	{
		Node temp = head;
		for(int i =0; i < idx-1;i++ )
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
		
	}
		
	
	public int recSearch(int key)
	{
		return helper(head , key);
	}
	
	
	
	private int helper(Node head, int key) {
		// TODO Auto-generated method stub
		if(head == null)
		{
			return -1;
		}
		if(head.data == key)
			return 0;
		
		int idx = helper(head.next , key);
		if(idx == -1)
		{
			return -1;
		}
		return idx+1;
	}
	
	public void reverseLL()
	{
		Node prev = null;
		Node curr = tail = head;
		Node next;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		head = prev;
		
	}
	
	
	public void deleteNthFromEnd(int n)
	{
		// calculate size
		int sz = 0;
		Node tem = head;
		while(tem != null)
		{
			tem = tem.next;
			sz++;
		}
		
		if(n == sz)
		{
			head = head.next;
			return;
		}
		
		
		int i =1;
		int iToFind = sz-n;
		Node prev = head;
		while(i<iToFind)
		{
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return;
	}

	
	public Node midNode(Node head)
	{
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public boolean checkPalindrome()
	{
		if(head == null || head.next == null)
			return true;
		
		// calculate mid
		Node middVal = midNode(head);
		
		
		// revere after the mid value
		Node prev = null;
		Node curr = head;
		Node  next;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;		
		}
		
		Node right = prev ;
		Node left = head;
		
		//check left half and right half
		while(right != null)
		{
			if(left.data != right.data)
				return false;
			
			left =left.next;
			right = right.next;
		}
		return true;
	}
	
	
	
	
	//to check cycle   FLOYD'S CFA
	
	public boolean isCycle()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast != null || fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if( slow == fast)
				return true; //cycle exists
		}
		return false;//cycle doesn't exist
	}
	
	
	//remove a loop/cycle in a linkedlist
	public void removeLoop()
	{
		//detect cycle
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		
		while(fast != null || fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if( slow == fast)
			{
				cycle = true ;//cycle exists
				break;
			}
		}	
		if(cycle == false)
			return;
		
		//find meeting point 
		slow = head;
		Node prev =null;
		while(slow != fast)
		{
			slow = slow.next;
			prev = fast;
			fast = fast.next;
		}
		
		//remove cycle -> last.next = null;
		prev.next = null;
			
	}

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(3);
		ll.print();
		ll.addLast(4);
		ll.print();
		ll.removeMiddle(1);
		ll.print();
	}

}