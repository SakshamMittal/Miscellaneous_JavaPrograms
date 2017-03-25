class MergingLists{   // Where the two given lists are already sorted
	static Node head1;
	static Node head2;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	Node mergeLists(Node first, Node second){
		Node temp=null;
		Node res=null;
		Node prev=null;
		while (first!=null && second!=null){
			if(first.data<=second.data){
			temp=new Node(first.data);
			first=first.next;
			}
			else{
			temp=new Node(second.data);
			second=second.next;
			}
			if(res==null)
			res=temp;
			else
			prev.next=temp;
			prev=temp;
		}
		if(first==null){
			while(second!=null){
				temp=new Node(second.data);
				prev.next=temp;
				second=second.next;
			}
		}
		else{
			while(first!=null){
				temp=new Node(first.data);
				prev.next=temp;
				first=first.next;
			}
		}
		return res;
	}
	void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println("");
    }
    public static void main(String args[]){
		MergingLists list=new MergingLists();

		list.head1=new Node(7);
		list.head1.next=new Node(9);
		list.head1.next.next=new Node(22);
		list.head1.next.next.next=new Node(90);
		System.out.println("The first list is");
		list.printList(head1);

		list.head2=new Node(8);
		list.head2.next=new Node(9);
		list.head2.next.next=new Node(15);
		list.head2.next.next.next=new Node(100);
		System.out.println("The second list is");
		list.printList(head2);

		System.out.println("The new merged list is");
		Node rs=list.mergeLists(head1,head2);
		list.printList(rs);
	}
}







