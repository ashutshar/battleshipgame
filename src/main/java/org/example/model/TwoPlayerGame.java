package org.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IBoard;

import java.io.IOException;

@Getter
@Setter
@Builder
public class TwoPlayerGame extends AbstractMultiPlayerGame {
    public TwoPlayerGame(int boardSize, String boardShape) throws IOException {
        this.board = addBoard(boardSize, boardShape);
        addPlayers(2);
        this.fireStrategy = new RandomFireStrategy(boardSize);
    }

}
