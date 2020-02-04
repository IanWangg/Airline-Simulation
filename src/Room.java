public class Room {
    private String type;
    private int price;
    private boolean availability;
    //constructor 1
    public Room(String type) {
        if (type.equals("double") || type.equals("queen") || type.equals("king")) {
            this.type = type;
            this.availability = true;
            if (type.equals("double")) {
                this.price = 90 * 100;
            } else if (type.equals("queen")) {
                this.price = 110 * 100;
            } else {
                this.price = 150 * 100;
            }
        } else {
            throw new IllegalArgumentException("Room type must be one of 'double', 'queen' or 'king'. No " + type + " room is provided");
        }
    }

    //constructor 2
    public Room(Room room) {
        this.availability = room.isAvailability();
        this.price = room.getPrice();
        this.type = room.getType();
    }

    //getters
    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isAvailability() {
        return this.availability;
    }

    //other functions
    public void changeAvailability() {
        this.availability = !this.availability;
    }

    // static functions
    public static Room findAvailableRoom(Room[] list, String type){
        for (Room room : list) {
            if (room.getType().equals(type) && room.isAvailability()) {
                return room;
            }
        }

        return null;
    }

    public static boolean makeRoomAvailable(Room[] list, String type) {
        for (Room room : list) {
            if (room.getType().equals(type) && !room.isAvailability()) {
                room.changeAvailability();
                return true;
            }
        }

        return false;
    }
}
