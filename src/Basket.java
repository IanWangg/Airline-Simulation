public class Basket {
    private Reservation[] reservations;

    public Basket() {
        this.reservations = new Reservation[10];
    }

    public Reservation[] getProducts() {
        Reservation[] products = this.reservations;
        return products;
    }

    public void add(Reservation reservation) {
        for (int i  = 0; i < this.reservations.length; i++) {
            if (this.reservations[i] == null) {
                this.reservations[i] = reservation;
                return;
            }
        }
        //create a longer reservations list
        //firstly, copy the original list
        Reservation[] newReservations = new Reservation[this.reservations.length * 2];
        for (int i  = 0; i < this.reservations.length; i++) {
            newReservations[i] = this.reservations[i];
        }
        //secondly, add the new reservation into the new list
        newReservations[this.reservations.length] = reservation;
        //thirdly, replace the old list with the new one
        this.reservations = newReservations;
    }

    public boolean remove(Reservation reservation) {
        for (int i  = 0; i < this.reservations.length; i++) {
            if (this.reservations[i].equals(reservation)) {
                this.reservations[i] = null;
                for (int j = i; j < this.reservations.length - 1; j++) {
                    this.reservations[j] = this.reservations[j + 1];
                }
                return true;
            }
        }

        return false;
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
