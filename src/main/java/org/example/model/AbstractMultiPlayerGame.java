package org.example.model;

import org.example.model.type.IBoard;
import org.example.model.type.IFireStrategy;
import org.example.model.type.IGame;
import org.example.util.TakeUserInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMultiPlayerGame implements IGame {
    List<Player> players;
    IBoard board;

    IFireStrategy fireStrategy;

    public IBoard addBoard(int n, String boardShape) {
        if (boardShape.equalsIgnoreCase("square")) {
            return new SquareBoard(n);
        }
        return null;
    }

    public List<Player> addPlayers(int num) throws IOException {
        for (int i = 1 ; i <= num; i++) {
            System.out.println("Enter Player "+ i +"'s Name");
            String name = TakeUserInput.takeUserInput();
            players.add(new Player(board, name));
        }
        return players;
    }
}
