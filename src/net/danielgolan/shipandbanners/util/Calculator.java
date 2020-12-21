package net.danielgolan.shipandbanners.util;

import net.danielgolan.shipandbanners.elements.Ship;

import java.util.Random;

public enum Calculator {
    plus, minus, multiply, divide, nothing, infinite;

    private final static Random RANDOM = new Random();

    public static int randomizeAndAddANumber(int min, int max, Calculator function, int by){
        if (Tracker.Error.trackError(min >= max, Tracker.Data.CALCULATOR_LOCATION
                + "randomizeAndAddANumber", "min >= max", 0))
            return 0;
        else
            if (function == plus)
                return (RANDOM.nextInt(max - min) + min) + by;
            else if (function == minus)
                return (RANDOM.nextInt(max - min) + min) - by;
            else if (function == multiply)
                return (RANDOM.nextInt(max - min) + min) * by;
            else if (function == divide)
                return (RANDOM.nextInt(max - min) + min) / by;
            else if (function == nothing)
                return (RANDOM.nextInt(max - min) + min)     ;
            else
                return Tracker.Error.reportError(Tracker.Data.CALCULATOR_LOCATION + "randomizeAndAddNumber",
                        "UnSupported Value: Calculator function", 0);
    }
    public static int randomize (int min, int max) {
        if (Tracker.Error.trackError(min >= max, Tracker.Data.CALCULATOR_LOCATION
                + "randomizeAndAddANumber", "min >= max", 0))
            return 0;
        else return (RANDOM.nextInt(max - min) + min);
    }

    public static class Battle {
        public static int calculateHPRemainsToShipAfterAttack(Ship harmer, Ship defender, int defenderCurrentHealthPoints){
            if (defender.getResistance() >= harmer.getDamage())
                return defenderCurrentHealthPoints;
            else
                return defenderCurrentHealthPoints - (calculateDamageShipCausing(harmer)) + defender.getResistance();
        }
        public static int calculateHPRemainsToShipAfterAttack(Ship harmer, Ship defender){
            if (defender.getResistance() >= harmer.getDamage())
                return defender.getHealthPoints();
            else
                return defender.getHealthPoints() - calculateDamageShipCausing(harmer) + defender.getResistance();
        }

        public static int calculateDamageShipCausing(Ship harmer){
            return randomizeAndAddANumber(harmer.getDamageChances(false), harmer.getDamageChances(true),
                    plus, harmer.getDamage());
        }

        public static Ship shipLevelUp(Ship ship, boolean enableKnockBack) {
            ship.setShipLevel(ship.getShipLevel() + 1);

            if (enableKnockBack) {
                ship.setKnockBack((int) (ship.getKnockBack(0) * 1.5 + 1));
                ship.setKnockBackResistance(ship.getKnockBack() / 2);
            }

            ship.setHealthPoints((int) (ship.getHealthPoints() * 1.25));
            ship.setResistance((int) (ship.getHealthPoints() * 0.07));

            ship.setDamage((int) (ship.getDamage(0) * 1.3));

            ship.setDamageChances(ship.getDamageChances(0, true) +
                    (int) (ship.getDamageChances(0, true) * 0.3), true);
            ship.setDamageChances(ship.getDamageChances(0, false) +
                    (int) (ship.getDamageChances(0, false) * 0.3), false);
            return ship;
        }
    }
}
