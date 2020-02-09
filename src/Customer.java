public class Customer {
    private String name;
    private int balance;
    private Basket basket;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.basket = new Basket();
    }

    public String getName() {
        return name;
    }

    public Basket getBasket() {
        return basket;
    }

    public int getBalance() {
        return balance;
    }

    public int addFunds(int fund) {
        if (fund < 0) {
            throw new IllegalArgumentException();
        } else {
            this.balance += fund;
        }

        return this.balance;
    }

    public int addToBasket(Reservation reservation) {
        if (reservation.reservationName().equals(this.name)) {
            this.basket.add(reservation);
        } else {
            throw new IllegalArgumentException();
        }

        return this.basket.getNumOfReservations();
    }

    public int addToBasket(Hotel hotel, String type, int numOfNights, boolean breakfast) {
        HotelReservation hotelReservation = new HotelReservation(this.name, hotel, type, numOfNights);
        return 0;
    }

    public int addToBasket(Airport departure, Airport arrival) {

        return 0;
    }

    public boolean removeFromBasket(Reservation reservation) {
        return this.basket.remove(reservation);
    }

    public int checkOut() {
        if (this.balance < this.basket.getTotalCost()) {
            throw new IllegalStateException();
        }
        this.basket.clear();
        this.balance -= this.basket.getTotalCost();
        return this.balance;
    }

}
