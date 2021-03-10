package collections_practice;

public class linkedList {
	
	Node head;
	//create a linked list
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	//create an insert method
	public static linkedList insert(linkedList list, int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		}else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	
	//print list 
	public static void printList(linkedList list) {
		Node currN = list.head;
		while(currN != null) {
			System.out.print(currN.data + " ");
			currN = currN.next;
		}
	}
	//main method
	public static void main(String[] args) {
		linkedList list = new linkedList();
		
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 5);
		list.insert(list, 8);
		
		list.printList(list);
	} 
}
