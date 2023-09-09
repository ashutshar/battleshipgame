package org.example.model.type;

import org.example.model.Location;
import org.example.model.Player;

public interface IFleet {

    public Location fire(Player player);

    public Location getLocation();

    public int getSize();

    public boolean validateLocation(Player player, Location location);
}
