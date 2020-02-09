public class BnBReservation extends HotelReservation {

    public BnBReservation(String nameOfReservation, Hotel hotel, String type, int numberOfNights, int pricePerNight) {
        super(nameOfReservation, hotel, type, numberOfNights, pricePerNight);
    }

    @Override
    public int getCost() {
        return (super.getCost() + 10 * 100 * super.getNumberOfNights());
    }
}
