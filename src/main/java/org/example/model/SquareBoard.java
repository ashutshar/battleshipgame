package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IBoard;

@Getter
@Setter
public class SquareBoard implements IBoard {
    int[][] board;

    public SquareBoard(int n) {
        board = new int[n][n];
    }
}
