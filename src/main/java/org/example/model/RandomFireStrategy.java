package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IFireStrategy;

@AllArgsConstructor
@Setter
@Getter
public class RandomFireStrategy implements IFireStrategy {
    int n;
    public Location fire(Player player) {
        int x;
        if (player.isFirstHalf()) {
            x = (int) ((Math.random() * (n - n/2)) + n/2);
        } else {
            x = (int) (Math.random() * (n/2));
        }

        int y = (int) (Math.random() * (n - 1));
        return new Location(x, y);
    }
}
