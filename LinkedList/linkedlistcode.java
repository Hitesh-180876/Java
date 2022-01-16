
import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class LinkedList {
	public static Node takeInput() {
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();
		
		Node head = null;
		Node tail = null;
		
		while(rootData != -1) {
			Node currNode = new Node(rootData);
			if(head == null) {
				head = currNode;
				tail = currNode;
			}else {
				tail.next = currNode;
				tail = currNode;
			}
			rootData = S.nextInt();
			
		}
		S.close();
		return head;
		
	}
	
	public static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.println("null");
		
	}
	
	public static int numNodes(Node head) {

		int count = 0;
		while(head != null) {
			count+=1;
			head=head.next;
		}
		return count;
	}

	public static Node reverseLL(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node smallHead = reverseLL(head.next);
		Node tail = head.next;
		tail.next = head;
		head.next = null;
		
		return smallHead;
	}
	
	public static Node midPoint(Node head) {
//		if(head == null || head.next ==null) {
//			return head;
//		}
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		
		Node head = takeInput();
//		printLL(head);
//		int ans = numNodes(head);
//		System.out.println(ans);
//		Node Head = reverseLL(head);
//		printLL(Head);
		Node mid = midPoint(head);
		
		System.out.println(mid.data);
	}
}
