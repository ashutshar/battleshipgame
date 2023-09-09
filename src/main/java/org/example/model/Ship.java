package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IFireStrategy;
import org.example.model.type.IFleet;

@Getter
@Setter
public class Ship implements IFleet {
    Location location;

    int size;

    IFireStrategy fireStrategy;

    public Ship(Player player, Location location, int size) {
        if (validateLocation(player, location)) {
            this.location = location;
            this.size = size;
        }
        else {
            throw new RuntimeException();
        }

    }

    @Override
    public Location fire(Player player) {
        return fireStrategy.fire(player);
    }

    public boolean validateLocation(Player player, Location location) {
        int[][] board = (int[][]) player.getBoard().getPlayBoard();
        if (player.isFirstHalf() && location.getX() < board.length/2) {
            return true;
        } else return !player.isFirstHalf() && location.getX() >= board.length / 2;
    }
}
