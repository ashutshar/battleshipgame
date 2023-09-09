package org.example.resource;

import org.example.model.Player;
import org.example.model.TwoPlayerGame;
import org.example.model.type.IGame;
import org.example.model.type.IGameResource;

import java.io.IOException;
import java.util.List;

public class BattleShipResource implements IGameResource {

    IGame game;

    @Override
    public void initGame(int sizeOfBoard) throws IOException {
        TwoPlayerGame twoPlayerGame = new TwoPlayerGame(sizeOfBoard, "square");
        if (game == null) {
            this.game = twoPlayerGame;
        }
    }

    @Override
    public void addShip(String playerName) throws IOException {
        List<Player> players = game.listPlayers();
        Player currentPlayer = players.stream().filter(player -> player.getPlayerName().equalsIgnoreCase(playerName)).findFirst().get();
        currentPlayer.addShips();
    }

    @Override
    public Player startGame() {
        return game.start();
    }

    @Override
    public void viewBattleField() {

    }
}
