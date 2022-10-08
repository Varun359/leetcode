class LRUCache {
    
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
    }
    final Node head = new Node();;
    final Node tail= new Node();;
    int capacity;
    Map<Integer, Node> hm;
    public LRUCache(int capacity) {
        hm  = new HashMap(capacity);
        this.capacity = capacity;
       
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int val = -1;
        Node temp = hm.get(key);
        if(temp!=null)
        {
            val = temp.val;
            remove(temp);
            add(temp);
        }
         
        return val;
    }
    
    public void put(int key, int value) {
        
        Node node = hm.get(key);
        if(node!=null)
        {
            remove(node);
            node.val = value;
            add(node);
        }
        else
        {
           
            if(hm.size() == capacity)
            {
               
                hm.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            add(new_node);
            hm.put(key, new_node);
            
        }
    }
    
    public void add(Node node)
    {
        Node head_next = head.next;
         node.next = head_next;
        head.next.prev = node;
        head.next = node;
         node.prev = head;
       
       
        
    }
    
    public void remove(Node node)
    {
        Node node_next = node.next;
        Node node_prev = node.prev;
        
        node_next.prev = node_prev;
        node_prev.next = node_next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */