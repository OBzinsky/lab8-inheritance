package ie.atu.demo;

public class StudentTicket extends Ticket
{
    private String studentId;

    public StudentTicket(String studentId) {
        this.studentId = studentId;
    }

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * 0.80;
    }
}
