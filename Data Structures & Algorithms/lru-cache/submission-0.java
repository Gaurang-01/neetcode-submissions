class Node {
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
    HashMap<Integer, Node> map = new HashMap();
    Node head;
    Node tail;
    int capacity;

    public void removeNode(Node curr) {
        Node toRemove = curr;
        Node prev = toRemove.prev;
        Node next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }
    public void addToFront(Node curr) {
        Node oldFirst = head.next;
        curr.next = oldFirst;
        curr.prev = head;

        head.next = curr;
        oldFirst.prev = curr;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node curr = map.get(key);
        removeNode(curr);
        addToFront(curr);
        return curr.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node curr = map.get(key);
            curr.value = value;
            removeNode(curr);
            addToFront(curr);
        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
            if (map.size() > capacity){
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
        }
    }
}
