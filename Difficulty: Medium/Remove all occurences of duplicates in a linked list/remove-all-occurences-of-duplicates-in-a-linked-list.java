//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
          Node ans=new Node(-1);
        Node ref=ans;
        Node curr=head;
        Node nel=head.next;
        
        while(curr!=null){
            if(nel!=null && curr.data==nel.data){
                while(nel!=null && curr.data==nel.data){
                    nel=nel.next;
                }
                if(nel==null){
                    break;
                }
                curr=nel;
                nel=nel.next;
            }else{
                ans.next=curr;
                ans=ans.next;
                
                if(curr.next==null) break;
                
                curr=curr.next;
                nel=curr.next;
                
                ans.next=null;
            }
        }
        return ref.next;
    }
}