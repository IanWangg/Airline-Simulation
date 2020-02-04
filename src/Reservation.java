public abstract class Reservation {
    String clientName;

    public Reservation(String name) {
        this.clientName = name;
    }

    public final String reservationName() {
        return this.clientName;
    }

    public abstract int getCost();

    public abstract boolean equals(Object object);
}
