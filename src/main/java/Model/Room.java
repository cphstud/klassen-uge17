package Model;

import java.util.ArrayList;

public class Room {
    int roomId;
    String roomName;
    String roomDescription;
    ArrayList<Player> players;

    public Room() {
        players = new ArrayList<>();
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public boolean removePlayer(Player player) {
        boolean retVal = true;
        if (this.players.contains(player)) {
            this.players.remove(player);
            return retVal;
        } else {
            return false;
        }
    }
}
