class MyLinkedList {
    
    class ListNode{
        int data;
        ListNode next = null;
        public ListNode(int data){
            this.data = data;
        }
    }
    
    ListNode head;
    ListNode tail;
    int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        
        if(index < 0 || index >= size)
            return -1;
        int i=0;
        ListNode iter = head;
        while(i!=index)
        {    iter = iter.next;
             i++;
        }
        return iter.data;
        
    }
    
    public void addAtHead(int val) {
       
        ListNode temp = new ListNode(val);
        if(head == null)
        {  tail = temp;
           head = temp;
        }
        else
        {
          temp.next = head;
          head = temp;
        }
          size++;
        
    }
    
    public void addAtTail(int val) {
        
        ListNode temp = new ListNode(val);
        if(tail == null)
        {   head = temp;
            tail = temp;
        }
        else
        {
         tail.next = temp;
         tail = tail.next;          
        }
        size++;
      
    }
    
    
    public void addAtIndex(int index, int val) {
    
        if(index < 0 || index > size)
            return;
        if(index == 0)
            addAtHead(val);
        else if(index == size)
            addAtTail(val);
        else
        {
            int i=0;
            ListNode prev = null, curr = head;
            while(i!=index)
            {
                i++;
                prev = curr;
                curr = curr.next;
            }
              ListNode temp = new ListNode(val);
              prev.next = temp;
              // prev = prev.next;
              // prev.next = curr;
              temp.next = curr;
              size++;
            //   tail = temp;
            // ListNode prev.next = new ListNode(val);
            // prev.next = curr;
        }
      
    }
    
     public void deleteFirst(){
        if(size == 0) return;
        else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            ListNode curr = head;
            ListNode forw = curr.next;
            curr.next = null;
            head = forw;
        }
        size--;
    }
     public void deleteLast(){
        if(size == 0) return;
        else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            ListNode secondLast = null;
            ListNode curr = head;
            int i=0;
            while(i!=size - 1)
            {
                i++;
                secondLast = curr;
                curr = curr.next;
            }
            secondLast.next = null;
            tail = secondLast;
        }
        size--;
    }
     public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        
        if(index == 0){
            deleteFirst();
        }
        else if(index == size-1){
            deleteLast();   
        }
        else{
             int i=0;
            ListNode prev = null, curr = head;
            while(i!=index)
            {
                prev = curr;
                curr = curr.next;
                i++;
            }
            ListNode forw = curr.next;
            prev.next = forw;
            curr.next = null;
            size--;
           
        }
    }
//     public void deleteAtIndex(int index) {
    
//          ListNode print = head;
//         System.out.println("Indelete Index "+ index +"size"+size);
        
//         while(print!=null)
//         {
//             System.out.println(print.data);
//             print = print.next;
//         }
        
//         if(index < 0 || index >= size)
//             return;
//         if(index == 0)
//            head = head.next;
//         else 
//         {
//             int i=0;
//             ListNode prev = null, curr = head;
//             while(i!=index)
//             {
//                 prev = curr;
//                 curr = curr.next;
//                 i++;
//             }
//             curr = curr.next;
//             prev.next = curr;
//         }
//         size--;
        
//     }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */