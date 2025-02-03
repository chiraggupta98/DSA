public class day1{
    public class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    //O(1)
    public void AddFirst(int item){
        Node nn = new Node();
        nn.data = item;

        if(size == 0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void AddLast(int item){
        Node nn = new Node();
        nn.data= item;
        if(size==0){
            //AddFirst(item);
            head =nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    // O(N)
    public void AddAtIndex(int item,int k)throws Exception{
        if(k==0){
            AddFirst(item);
        }
        else if(k==size){
            AddLast(item);
        }
        else{
            Node nn = new Node();
            nn.data = item;
            Node k_1th = GetNode(k-1);
            nn.next = k_1th.next;
            k_1th.next =nn;
            size++;
        }
    }
    
    private Node GetNode(int k)throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Bklol index out of range");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    public int getAtIndex(int k)throws Exception{
        return GetNode(k).data;
    }
    public int size(){
        return size;
    }

    // O(1)
    public int removeFirst(){
        int rv = head.data;
        if(size==0){
            head=null;
            tail=null;
        }
        else{
            Node temp = head;
            head=head.next;
            temp.next = null;
        }
        size--;
        return rv;

    }

    // O(n)
    public int removeLast()throws Exception{
        if(size==1){
            return removeFirst();
        }
        else{
            int rv = tail.data;
            Node temp = GetNode(size-2);
            temp.next = null;
            tail=temp;
            size--;
            return rv;
        }
    }

    public int removeAtIndex(int k)throws Exception{
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node k_1th = GetNode(k);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next=null;
            size--;
            return kth.data;
        }
    }




    public void Display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(".");
    }
}