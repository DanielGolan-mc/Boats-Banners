package net.danielgolan.shipandbanners;

import net.danielgolan.shipandbanners.elements.Ship;
import net.danielgolan.shipandbanners.elements.ShipPrintAble;
import net.danielgolan.shipandbanners.templates.ship.ShipBasic;
import net.danielgolan.shipandbanners.templates.ship.ShipDefender;
import net.danielgolan.shipandbanners.util.Tracker;

public class Main {

    public static void main(String[] args) {
        System.out.println(Tracker.Color.BLACK_BOLD + "This is just the alpha of the core of my game "
                + Tracker.Color.BLUE + "Ships & Banners" + Tracker.Color.RESET
                + Tracker.Color.BLACK_BOLD + " (Name is not finally)");
        System.out.println();
        System.out.println(Tracker.Color.BLACK_BOLD + "This program know to:" + Tracker.Color.RESET);
        System.out.println("- Store Ships And Ships Levels");
        System.out.println("- Tracker, that can manage color, errors, and data.");
        System.out.println("- Calculator, that calculates the math");
        System.out.println("- Manage Ship types, Ship Grades Ship Templates, Ship printing And More");
        System.out.println(Tracker.Color.WHITE + "- And More Coming Soon!" + Tracker.Color.RESET);

        System.out.println();
        ShipPrintAble[] ships = {new ShipBasic()};
        ShipDefender shipDefender = new ShipDefender();
        System.out.println(shipDefender.printStats(true));
        System.out.println(ships[0].printStats(true));

        System.out.println();
        shipDefender.addXP(shipDefender.getMAX_XP());
        System.out.println(shipDefender.printStats(true));
    }
}
