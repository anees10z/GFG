/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node head = null;
        Node temp = head;
        for(int i = 0; i< arr.length; ++i){
            Node newNode = new Node(arr[i]);
            if(head == null){
                head = newNode;
                temp = newNode;
                continue;
            }
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
}
