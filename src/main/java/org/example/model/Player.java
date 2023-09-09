package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IBoard;
import org.example.model.type.IFleet;
import org.example.util.TakeUserInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Player {
    IBoard board;
    String playerName;

    List<IFleet> fleets;

    boolean firstHalf;

    public Player(IBoard board, String playerName) {
        this.board = board;
        this.playerName = playerName;
        fleets = new ArrayList<>();
    }

    public void addShips() throws IOException {
        System.out.println("Enter location and size x,y,size");
        String str = TakeUserInput.takeUserInput();
        String[] input = str.split(",");
        fleets.add(new Ship(this, new Location(Integer.parseInt(input[0]), Integer.parseInt(input[1])), Integer.parseInt(input[2])));
    }

    public Location fire() {
        return fleets.get((int) (Math.random() * fleets.size())).fire(this);
    }

    public void receiveFire(Location location) {
        for (IFleet fleet : fleets) {
            Location shipLocation = fleet.getLocation();
            int shipSize = fleet.getSize();
            if (location.getX() < shipLocation.getX() + shipSize && location.getX() >= shipLocation.getX()
                    && location.getY() < shipLocation.getY() + shipSize && location.getY() >= shipLocation.getY()) {
                fleets.remove(fleet);
            }
        }
    }
}
