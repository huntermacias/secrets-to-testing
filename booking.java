public class Booking {
    private String bookingId;
    private String customerName;
    private String destination;
    private double amount;

    public Booking(String bookingId, String customerName, String destination, double amount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.destination = destination;
        this.amount = amount;
    }

    // Getters
    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDestination() {
        return destination;
    }

    public double getAmount() {
        return amount;
    }
}
