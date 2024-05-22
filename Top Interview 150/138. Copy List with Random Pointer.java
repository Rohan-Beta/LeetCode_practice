// 138. Copy List with Random Pointer

//   Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
// Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

// Input: head = [[1,1],[2,1]]
// Output: [[1,1],[2,1]]

// solution

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Map<Node , Node> map = new HashMap<>();
    
    public Node copyRandomList(Node head) {

        if(head == null) {
            return null;
        }
        if(map.containsKey(head)) {
            return map.get(head);
        }
        Node newNode = new Node(head.val);
        map.put(head , newNode);

        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);

        return newNode;
    }
}
