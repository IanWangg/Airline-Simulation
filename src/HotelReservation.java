public class HotelReservation extends Reservation {
    private Hotel hotel;
    private String type;
    private int numberOfNights;
    private int pricePerNight; //in cents

    public HotelReservation(String name, Hotel hotel, String type, int numberOfNights, int pricePerNight) {
        super(name);
        this.hotel = hotel;
        this.type = type;
        this.numberOfNights = numberOfNights;
        this.pricePerNight = pricePerNight;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
