class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int k, int v){
        key = k;
        val = v;
    }
}
class LRUCache {
    Map<Integer,Node> mpp = new HashMap<>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node a = mpp.get(key);
        remove(a);
        insert(a);
        return a.val; 
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node a = mpp.get(key);
            a.val = value;
            remove(a);
            insert(a);
        }
        else if(capacity == mpp.size()){
            remove(tail.prev);
            insert(new Node(key,value));
        }
        else{
            insert(new Node(key,value));
        }
        
    }
    public void insert(Node a){
        mpp.put(a.key,a);
        a.next = head.next;
        head.next.prev = a;
        a.prev = head;
        head.next = a;
    }

    public void remove(Node a){
        mpp.remove(a.key);
        a.prev.next = a.next;
        a.next.prev = a.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */