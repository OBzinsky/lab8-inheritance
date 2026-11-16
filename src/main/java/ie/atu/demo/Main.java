package ie.atu.demo;

public class Main
{
    public static void main(String[] args)
    {
        Ticket standardTicket = new Ticket("Summer Concert", "Alice", 80.00);
        StudentTicket studentTicket = new StudentTicket("Summer Concert", "Bob", 80.00, "ATU123");
        VIPTicket VIPTicket = new VIPTicket("Summer Concert", "Charlie", 80.00);

        // Alice
        System.out.println("Event: " + standardTicket.getEventName());
        System.out.println("Standard Ticket - " + standardTicket.getHolderName());
        System.out.println("Price: €" + standardTicket.calculatePrice());

        System.out.println("Student Ticket - " + studentTicket.getHolderName());
        System.out.printf("Price: €%.2f%n%n", studentTicket.calculatePrice());

        System.out.println("VIP Ticket - " + VIPTicket.getHolderName());
        System.out.printf("Price: €%.2f%n", VIPTicket.calculatePrice());
        System.out.println("Student ID: " + studentTicket.getStudentId());
        System.out.println("VIP Benefits: " + VIPTicket.getBenefits());

    }
}
