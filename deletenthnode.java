public class deletenthnode {
    Node head,tail;

    public deletenthnode(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delnth_Node(int pos){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=pos;i++){
            fast = fast.next;
        }
        if(fast==null){
            head= head.next;
            return;
        }
        while(fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
        slow.next = slow.next.next;
        if(slow.next == null){
            tail = slow;
        }
        
    }
    public static void main(String[] args) {
        deletenthnode l = new deletenthnode();
        l.create(1);
        l.create(5);
        l.create(3);
        l.create(6);
        l.print(l.head);
        l.delnth_Node(1);
        System.out.println();
        l.print(l.head);
    }
}

