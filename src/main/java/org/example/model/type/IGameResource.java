package org.example.model.type;

import org.example.model.Player;

import java.io.IOException;

public interface IGameResource {
    public void initGame(int sizeOfBoard) throws IOException;

    public void addShip(String playerName) throws IOException;

    public Player startGame();

    public void viewBattleField();
}
