package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.model.type.IFleet;

@Getter
@Setter
public class Ship implements IFleet {
    Location location;

    int size;

    RandomFireStrategy randomFireStrategy;

    public Ship(Location location, int size) {
        this.location = location;
        this.size = size;
    }
}
