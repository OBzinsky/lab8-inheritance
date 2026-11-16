package ie.atu;

public class CustomerTest
{
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Paul","123456", "Gort", 123456, true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhoneNumber("123456");
        secondCustomer.setAddress("Bob Street");
        secondCustomer.setCustomerNumber(123);
        secondCustomer.setMailingList(false);

        System.out.println();
        System.out.println(secondCustomer);
    }
}
