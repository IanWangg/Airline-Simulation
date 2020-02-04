public class Hotel {
    private String name;
    private Room[] rooms;

    public Hotel(String name, Room[] Rooms) {
        this.name = name;
        this.rooms = new Room[Rooms.length];
        //deep copy of rooms
        for (int i = 0; i < Rooms.length; i++) {
            this.rooms[i] = new Room(Rooms[i]);
        }
    }

    public int reserveRoom(String type) {
        Room room = Room.findAvailableRoom(this.rooms, type);
        if (room == null) {
            throw new IllegalArgumentException();
        } else {
            room.changeAvailability();
            return room.getPrice();
        }
    }

    public boolean cancelRoom(String type) {
        return Room.makeRoomAvailable(this.rooms, type);
    }
}
