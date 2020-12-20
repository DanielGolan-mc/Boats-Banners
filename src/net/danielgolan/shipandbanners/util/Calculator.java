package net.danielgolan.shipandbanners.util;

import net.danielgolan.shipandbanners.elements.Ship;

import java.util.Random;

public enum Calculator {
    plus, minus, multiply, divide, nothing, infinite;

    private final Random RANDOM = new Random();

    public int randomizeAndAddANumber (int min, int max, Calculator function, int by){
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
    public int randomize (int min, int max) {
        if (Tracker.Error.trackError(min >= max, Tracker.Data.CALCULATOR_LOCATION
                + "randomizeAndAddANumber", "min >= max", 0))
            return 0;
        else return (RANDOM.nextInt(max - min) + min);
    }

    public class Battle {
        public int calculateHPRemainsToShipAfterAttack(Ship harmer, Ship defender, int defenderCurrentHealthPoints){
            if (defender.getResistance() >= harmer.getDamage())
                return defenderCurrentHealthPoints;
            else
                return defenderCurrentHealthPoints - (calculateDamageShipCausing(harmer)) + defender.getResistance();
        }
        public int calculateHPRemainsToShipAfterAttack(Ship harmer, Ship defender){
            if (defender.getResistance() >= harmer.getDamage())
                return defender.getHealthPoints();
            else
                return defender.getHealthPoints() - calculateDamageShipCausing(harmer) + defender.getResistance();
        }

        public int calculateDamageShipCausing(Ship harmer){
            return randomizeAndAddANumber(harmer.getDamageChances(false), harmer.getDamageChances(true),
                    plus, harmer.getDamage());
        }
    }
}
