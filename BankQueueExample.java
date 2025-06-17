import java.util.LinkedList;

public class BankQueueExample {
    public static void main(String[] args) {
        // LinkedList to act as the customer queue
        LinkedList<Bank> queue = new LinkedList<>();

        // Add customers to the queue (they arrive at the bank)
        queue.addLast(new Bank(1, "Reena"));
        queue.addLast(new Bank(2, "Teena"));
        queue.addLast(new Bank(3, "meena"));

        // Display the queue
        System.out.println("Customers in queue:");
        for (Bank customer : queue) {
            customer.display();
        }

        // Serve the first customer (remove from front of queue)
        System.out.println("\nServing the first customer:");
        Bank served = queue.removeFirst(); // FIFO
        served.display();

        // Display remaining queue
        System.out.println("\nRemaining customers in queue:");
        for (Bank customer : queue) {
            customer.display();
        }
    }
}

