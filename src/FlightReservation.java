public class FlightReservation extends Reservation {
    private Airport departure;
    private Airport arrival;

    public FlightReservation(String name, Airport a1, Airport a2) {
        super(name);
        if (a1.equals(a2)) {
            throw new IllegalArgumentException("Departure and arrival places are the same one");
        } else {
            this.departure = a1;
            this.arrival = a2;
        }
    }

    @Override
    public int getCost() {
        int airportsFees = this.arrival.getFees() + this.departure.getFees();
        double fuelsCost = Airport.getDistance(this.departure, this.arrival) / 167.52 * 1.24 * 100;
        double extraCost = 53.75 * 100;

        return (int)Math.ceil(airportsFees + fuelsCost + extraCost);
    }

    @Override
    public boolean equals(Object object) {
        boolean ans = true;
        if (!(object instanceof FlightReservation)) {
            return false;
        }
        //down-casting
        FlightReservation flightReservation = (FlightReservation) object;
        if (!(flightReservation.reservationName().equals(this.reservationName()))) {
            return false;
        }
        if (!(flightReservation.departure.equals(this.departure))){
            return false;
        }
        return flightReservation.arrival.equals(this.arrival);
    }
}
