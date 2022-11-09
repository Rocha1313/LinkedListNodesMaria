public class Main {
    public static void main(String[] args) {
        LL<Integer> ll = new LL<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));
        System.out.println("_________\n");

        ll.add(2, 3);

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
    }
}