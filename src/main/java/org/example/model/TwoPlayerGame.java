package org.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;

@Getter
@Setter
public class TwoPlayerGame extends AbstractMultiPlayerGame {
    public TwoPlayerGame(int boardSize, String boardShape) throws IOException {
        this.board = addBoard(boardSize, boardShape);
        this.players = new ArrayList<>();
        addPlayers(2);
        this.fireStrategy = new RandomFireStrategy(boardSize);
    }

    public Player start() {
        Location location = null;
        while (true) {
            if (players.stream().filter(player -> player.getFleets().size() == 0).findFirst().get() != null) {
                return players.stream().filter(player -> player.getFleets().size() > 0).findFirst().get();
            }
            for (Player player : this.players) {
                if (location == null) {
                    player.fire();
                } else {
                    player.receiveFire(location);
                    location = player.fire();
                }
            }
        }
    }
}
