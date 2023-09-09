package org.example;

import org.example.resource.BattleShipResource;
import org.example.util.TakeUserInput;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BattleShipResource battleShipResource = new BattleShipResource();
        while (true) {
            System.out.println("Commands");
            System.out.println("init n --> initiates game");
            System.out.println("addship playername --> Adds ship to playername");
            System.out.println("start --> Starts Game");
            System.out.println("view --> View BattleField");
            String str = TakeUserInput.takeUserInput();
            String[] arr = str.split(" ");
            switch (arr[0]) {
                case "init" : battleShipResource.initGame(Integer.parseInt(arr[1]));
                break;
                case "addship" : battleShipResource.addShip(arr[1]);
                break;
                case "start" : battleShipResource.startGame();
                break;
            }
        }
    }
}