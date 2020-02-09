public class Basket {
    private Reservation[] reservations;

    public Basket() {
        this.reservations = new Reservation[0];
    }

    public Reservation[] getProducts() {
        Reservation[] products = this.reservations;
        return products;
    }

    public void add(Reservation reservation) {
        //create a longer reservations list
        Reservation[] newReservations = new Reservation[this.reservations.length + 1];
        //firstly, copy the original list
        for (int i  = 0; i < this.reservations.length; i++) {
            newReservations[i] = this.reservations[i];
        }
        //secondly, add the new reservation into the new list
        newReservations[this.reservations.length] = reservation;
        //thirdly, replace the old list with the new one
        this.reservations = newReservations;
    }

    public boolean remove(Reservation reservation) {
        Reservation[] newReservations = new Reservation[this.reservations.length - 1];
        System.out.println("current length is " + newReservations.length);
        boolean c = false;
        for (int i  = 0; i < newReservations.length; i++) {
            if (this.reservations[i].equals(reservation)) {
                c = true;
            }
            if (!c) {
                newReservations[i] = this.reservations[i];
            } else {
                newReservations[i] = this.reservations[i + 1];
            }
        }
        this.reservations = newReservations;
        return c;
    }

    public void clear() {
        int len = this.reservations.length;
        this.reservations = new Reservation[len];
    }

    public int getNumOfReservations() {
        int total = 0;
        for (int i = 0; i < this.reservations.length; i++) {
            if (this.reservations[i] != null) {
                total++;
            }
        }

        return total;
    }


    public int getTotalCost() {
        int totalCost = 0;
        for (int i  = 0; i < this.reservations.length; i++) {
            if (this.reservations[i] != null) {
                totalCost += this.reservations[i].getCost();
            }
        }
        return totalCost;
    }
}
