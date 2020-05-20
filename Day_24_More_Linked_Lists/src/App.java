import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
public class App
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
      if(head==null)
      return null;
      
      Node tempHead = head;

      while(tempHead.next!=null){
        int data = tempHead.data;
        Node next =  tempHead.next;
        int nextData = next != null ? next.data : null;
        if(data==nextData){
            if(next.next!=null)
                tempHead.next = next.next;
            else 
                tempHead.next = null;
        } else 
            tempHead = next;
      }

      return head;
      

    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                int ele=sc.nextInt();
                head=insert(head,ele);
              }
              sc.close();
              head=removeDuplicates(head);
              display(head);

       }
    }