package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IBoard;

@Setter
public class SquareBoard implements IBoard {
    int[][] board;

    public SquareBoard(int n) {
        this.board = new int[n][n];
    }

    @Override
    public Object getPlayBoard() {
        return null;
    }
}
