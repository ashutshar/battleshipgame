package org.example.model;

import lombok.AllArgsConstructor;
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

    List<IFleet> ships;

    public Player(IBoard board, String playerName) {
        this.board = board;
        this.playerName = playerName;
    }

    public void addShips() throws IOException {
        System.out.println("Enter location and size x,y,size");
        String str = TakeUserInput.takeUserInput();
        String[] input = str.split(",");
        ships.add(new Ship(new Location(Integer.parseInt(input[0]), Integer.parseInt(input[1])), Integer.parseInt(input[2])));
    }
}
