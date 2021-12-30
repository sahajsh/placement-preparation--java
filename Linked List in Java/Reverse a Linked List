Iterative approach      - time complexity -o(n)  space complexity - o(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
      while(curr!=null){
          ListNode temp = curr.next;
          curr.next= prev;
          prev =curr;
          curr = temp;
        
    }
        return prev;
        
        
        
    }
}

Recursive approach       - T.C - o(n),  S.C - o(n)

public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }
    public ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null)return prev;
        ListNode next=curr.next;
        curr.next=prev;
        return reverse(next,curr);
    }
