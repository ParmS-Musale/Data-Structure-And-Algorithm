public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;   // counting the size of LL

    // code for add element at first 

    public void addFirst(int data) {
        // step - 1 Create new node
        Node newNode = new Node(data);
            size++ ;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step - 2 newNode next = head
        newNode.next = head;
        // step - 3 head = newnode
        head = newNode;
    }

    // code for add element at last

    public void addLast(int data) {
        // step - 1 Create new node
        Node newNode = new Node(data);
            size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step - 2 tail next = newNode
        tail.next = newNode;
        // step - 3 tail = newnode
        tail = newNode;
    }

    // For Print Linked list

    public static void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println();
    }

    // Adding Element in the middle 

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0 ;

        while(i <idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1 ;temp -> prev
        newNode.next = temp.next;
        temp.next = newNode ;
    }

    // Remove The First element from ll

    public int removeFirst(){
        if (size==0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE ;
        }else if (size==1){
            int val = head.data;
            head = tail = null ;
            size =0 ; 
            return val;
        }
        int val = head.data;
        head = head.next;
        size-- ;
        return val ;
    }

    // Remove The last element from ll

    public int removeLast(){
        if (size==0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE ;
        }else if (size==1){
            int val = head.data;
            head = tail = null ;
            size =0 ; 
            return val;
        }
        Node prev = head;
        for(int i=0 ; i<size-2 ; i++){
            prev= prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev ; 
        size-- ;
        return val ;
    }

    // Search Element in LL using iteration

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp= temp.next; 
            i++ ;
        }
        return -1 ;
    }

    // Search Element in LL using Recursion

    public int helper(Node head, int key){
        if(head == null){
            return -1 ;
        }

        if(head.data == key){
            return 0 ;
        }
        int idx = helper (head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1 ;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // Reverse the LL

    public void reverse () {
        Node prev = null;
        Node curr = tail = head;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = next;
        }
        head = prev;
    }

    // Remove Nth Node form LL

    public void deleteNthfromEnd(int n){
        // calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++ ;
        }
        if (n == size){
            head = head.next; // removeFirst
            return;
        }
        // size-n
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++ ;
        }
        prev.next = prev.next.next;
        return;

    }

    // LL Forming Cycle Or not

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast ){
                return true ;
            }
        }
        return false ;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        // ll.removeFirst();
        // ll.print();
        // System.out.println("The size of LL:-" + ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println("The size of LL:-" + ll.size);
        // System.out.println(ll.itrSearch(5));
        // System.out.print(ll.itrSearch(12));
        // System.out.println(ll.recSearch(1));
        // System.out.print(ll.recSearch(12));
        // ll.reverse();
        // ll.print();
        // // ll.deleteNthfromEnd(3);
        // // ll.print();
        head = new Node (1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());

    }
}
