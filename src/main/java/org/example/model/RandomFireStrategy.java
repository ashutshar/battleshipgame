package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IFireStrategy;

import java.util.Map;

@AllArgsConstructor
@Setter
@Getter
public class RandomFireStrategy implements IFireStrategy {
    int n;
    public Location fire() {
        int x = (int) (Math.random() * (n - 1));
        int y = (int) (Math.random() * (n - 1));
        return new Location(x, y);
    }
}
