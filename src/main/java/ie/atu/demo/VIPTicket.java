package ie.atu.demo;

public class VIPTicket extends Ticket
{
    public VIPTicket(String eventName, String holderName, double basePrice)
    {
        super(eventName, holderName, basePrice);
    }

    public String getBenefits() {
        return "Priority entry and reserved seating";
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 25;
    }
}
