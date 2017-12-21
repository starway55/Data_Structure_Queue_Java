public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.push(1);
        queue.push(2);
        queue.push(5);
        queue.push(8);
        queue.push(7);

        queue.printQueue();

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.printQueue();

        queue.push(10);
        queue.push(11);

        queue.printQueue();

    }
}
