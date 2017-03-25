public class LinkedSum {
	static ListNode head1,head2;
	static class ListNode{

	ListNode next;
	int val;

	ListNode(int data){
	val=data;
	}
}
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res=null;
        ListNode temp=null;
        ListNode prev=null;
        int carry=0,sum;

        while( l1.next!=null || l2.next!=null){
            sum=carry+(l1.next!=null?l1.val:0)+(l2.next!=null?l2.val:0);
            carry=(sum>=10)?1:0;
            sum%=10;
            temp=new ListNode(sum);
            if(res==null){
                res=temp;
            }
            else{
                prev.next=temp;
            }
            prev=temp;
            if(l1.next!=null){
                l1=l1.next;

            }
            if(l2.next!=null){
                l2=l2.next;
            }


        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
     return res;

     public static void main(String args[]){
		 LinkedNode list = new LinkedNode();

		         // creating first list
		         list.head1 = new ListNode(7);
		         list.head1.next = new ListNode(5);
		         list.head1.next.next = new ListNode(9);
		         list.head1.next.next.next = new ListNode(4);
		         list.head1.next.next.next.next = new ListNode(6);
		         System.out.print("First List is ");
		         list.printList(head1);

		         // creating seconnd list
		         list.head2 = new ListNode(8);
		         list.head2.next = new ListNode(4);
		         System.out.print("Second List is ");
		         list.printList(head2);

		         // add the two lists and see the result
		         ListNode res = list.addTwoLists(head1, head2);


 }
}