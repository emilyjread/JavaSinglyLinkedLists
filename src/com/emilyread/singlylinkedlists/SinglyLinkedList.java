package com.emilyread.singlylinkedlists;

public class SinglyLinkedList {
	public Node head;
	
	public SinglyLinkedList() {
		this.head=null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		
		if (this.head==null) {
			this.head= newNode;
		}
		else {
			Node runner=this.head;
			while (runner.next!=null){
				runner=runner.next;
			}
			runner.next=newNode;		
		}
			
	}
	
	public void remove() {
		Node runner= this.head;
		if(runner.next==null) {
			this.head=null;
		}
		if (runner.next.next==null) {
			runner.next=null;
		}
		
		while (runner.next.next!=null){
			runner=runner.next;
		}
		runner.next=null;
		
		
	}
	
	public void printValues() {
		
		Node runner=this.head;
		while (runner!=null){
			System.out.println(runner.value);
			runner=runner.next;
		}	
		
	}
	
	public Node findInt(int value) {
		Node runner=this.head;
		while (runner!=null){
			if(runner.value==value) {
				System.out.println("found: " + runner.value);
				return runner;
			}
			runner=runner.next;
		}
		System.out.println("value not found");
		return null;
		
	}
	
	public void removeAt(int value) {
		Node runner=this.head;
		if (runner.value==value) {
			this.head= this.head.next;
		}
		
		while (runner.next!=null){
			if(runner.next.value==value) {
				if (runner.next.next==null) {
					runner.next=null;
				}
				runner.next= runner.next.next;
			}
			runner= runner.next;
		}

		
	}

}
