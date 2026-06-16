class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if(n == length) return head.next;
        temp = head;
        int end = length-n;
        for(int i =1;i<end;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
