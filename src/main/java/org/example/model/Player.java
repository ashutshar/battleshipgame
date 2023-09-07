package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IBoard;

@AllArgsConstructor
@Getter
@Setter
public class Player {
    IBoard board;
    String playerName;
}
