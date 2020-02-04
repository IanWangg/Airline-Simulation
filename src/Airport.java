public class Airport {
    private int x;
    private int y;
    private int fees;

    public Airport(int x, int y, int fees){
        this.x = x;
        this.y = y;
        this.fees = fees;
    }

    public int getFees() {
        return this.fees;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getDistance(Airport a1, Airport a2) {
        int x1 = a1.getX();
        int x2 = a2.getX();
        int y1 = a1.getY();
        int y2 = a2.getY();
        double horizontal = Math.pow((x1 - x2), 2);
        double vertival = Math.pow((y1 - y2), 2);
        int distance = (int)Math.ceil(Math.pow((horizontal + vertival), 1/2));
        return distance;
    }
}
