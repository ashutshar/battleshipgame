package org.example.model.type;

import org.example.model.Player;

import java.util.List;

public interface IGame {
    /*
    * Returns winner player */
    public Player start();

    public List<Player> listPlayers();
}
