package ÜbStream8;

import java.util.List;
import java.util.Optional;

public class RoomService {
    public Optional<Room> findFirstAviableRoom (List<Room> rooms) {
        return rooms.stream()
                .filter(Room::available)
                .findFirst();
    }
}
