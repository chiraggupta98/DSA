public class callDay1 {
    public static void main(String[] args)throws Exception {
        day1 ll = new day1();
        ll.AddFirst(30);
        ll.AddFirst(20);
        ll.AddFirst(10);
        ll.AddLast(50);
        ll.AddAtIndex(-20,2);
        ll.Display();

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(2));

        System.out.println(ll.removeFirst());
        ll.Display();

        System.out.println(ll.removeLast());
        ll.Display();

        ll.removeAtIndex(2);
        ll.Display();
    }
}