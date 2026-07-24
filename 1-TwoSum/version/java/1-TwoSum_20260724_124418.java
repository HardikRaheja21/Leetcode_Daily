// Last updated: 7/24/2026, 12:44:18 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Node head2 = new Node(101);
19        Node temp2 = head2;
20        Node temp1 = head;
21        //creating deep copy
22        while(temp1 != null){
23            Node t = new    Node(temp1.val);
24            temp2.next = t;
25            temp2 = t;
26            temp1 = temp1.next;
27        }
28        head2 = head2.next;
29        temp2 = head2;
30        temp1 = head;
31
32        //alternate connections
33        Node temp = new Node(-1);
34        while(temp1 != null){
35            temp.next = temp1;
36            temp1 = temp1.next;
37            temp = temp.next;
38
39            temp.next = temp2;
40            temp2 = temp2.next;
41            temp = temp.next;
42        }
43        temp2 = head2;
44        temp1 = head;
45
46        //assigning random pointers
47        while(temp1 != null){
48            if(temp1.random == null) temp2.random = null;
49            else temp2.random = temp1.random.next;
50            temp1 = temp2.next;
51            if(temp1 != null) temp2 = temp1.next;
52        }
53        temp2 = head2;
54        temp1 = head;
55
56        //separating the list
57        while(temp1 != null){
58            temp1.next = temp2.next;
59            temp1 = temp1.next;
60            if(temp1 == null) break;
61            temp2.next = temp1.next;
62            if(temp2.next == null) break;
63            temp2 = temp2.next;
64        }
65        return head2;
66    }
67}