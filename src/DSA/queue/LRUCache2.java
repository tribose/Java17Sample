package DSA.queue;

import java.util.Map;

public class LRUCache2 {

    Node head = new Node();
    Node tail = new Node();
    Map<Integer, Node> node_map;
    int cache_capacity;

    public LRUCache2(int cache_capacity) {
        this.cache_capacity = cache_capacity;
        head.next = tail;
        tail.prev = head;
    }

    public void put(int key, int value) {
        Node node = node_map.get(key);
        if (node != null) {
            remove(node);
            node.value = value;
            add(node);
        } else {
            if (node_map.size() == cache_capacity) {
                Node new_node = new Node(value);
                new_node.key = key;
                new_node.value = value;
                node_map.put(key, new_node);
            }
        }
    }

    public int get(int key) {
        if (node_map.size() == 0) {
            return -1;
        }
        Node node = node_map.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    public void add(Node node) {
        Node prev_node = tail.prev;
        node.prev = prev_node;
        node.next = tail;
        prev_node.next = node;
        tail.prev = node;
    }

    public void remove(Node node) {
        Node prev_node = node.prev;
        Node next_node = node.next;

        prev_node.next = next_node;
        next_node.prev = prev_node;
    }

    public static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node() {}
        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCache2 lruCache = new LRUCache2(3);
        Node node_one = new Node(100);
        Node node_two = new Node(200);
        Node node_three = new Node(300);

        lruCache.add(node_one);
        lruCache.add(node_two);
        lruCache.add(node_three);
    }
}
