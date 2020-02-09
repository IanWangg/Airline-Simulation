public class BnBReservation extends HotelReservation {

    public BnBReservation(String nameOfReservation, Hotel hotel, String type, int numberOfNights) {
        super(nameOfReservation, hotel, type, numberOfNights);
    }

    @Override
    public int getCost() {
        return (super.getCost() + 10 * 100 * super.getNumberOfNights());
    }
}
