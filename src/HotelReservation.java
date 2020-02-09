public class HotelReservation extends Reservation {
    private Hotel hotel;
    private String type;
    private int numberOfNights;
    private int pricePerNight; //in cents

    //need to be modified
    public HotelReservation(String nameOfReservation, Hotel hotel, String type, int numberOfNights) {
        super(nameOfReservation);
        this.pricePerNight = hotel.reserveRoom(type);
        this.hotel = hotel;
        this.type = type;
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    @Override
    public int getCost() {
        //in cents
        return this.numberOfNights * this.pricePerNight;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof HotelReservation)) {
            return false;
        }
        HotelReservation hotelReservation = (HotelReservation) object;

        return hotelReservation.reservationName().equals(this.reservationName()) &&
                (hotelReservation.pricePerNight == this.pricePerNight) &&
                (hotelReservation.numberOfNights == this.numberOfNights) && (hotelReservation.getCost() == this.getCost()) && hotelReservation.type.equals(this.type);
    }


}
