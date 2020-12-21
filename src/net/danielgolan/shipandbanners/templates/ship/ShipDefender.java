package net.danielgolan.shipandbanners.templates.ship;

import net.danielgolan.shipandbanners.templates.ShipLevelUpAbleTemplate;
import net.danielgolan.shipandbanners.util.Calculator;

public class ShipDefender extends ShipLevelUpAbleTemplate {
    public ShipDefender() {
        super("ship_defender", 2, 0);
        super.refreshShipPowerLevels(DAMAGE(), KNOCK_BACK(), KNOCK_BACK_RESISTANCE(), HEALTH_POINTS(), RESISTANCE());
        setDamage(DAMAGE());
        setHealthPoints(HEALTH_POINTS());
        setResistance(RESISTANCE());
        setKnockBack(KNOCK_BACK());
        setKnockBackResistance(KNOCK_BACK_RESISTANCE());
        setDamageChances(DAMAGE_CHANCES(false), false);
        setDamageChances(DAMAGE_CHANCES(true), true);
    }

    @Override
    public int DAMAGE() {
        return 10;
    }

    @Override
    public boolean KNOCK_BACK_ENABLED() {
        return true;
    }

    @Override
    public int KNOCK_BACK() {
        return 2;
    }

    @Override
    public int KNOCK_BACK_RESISTANCE() {
        return 1;
    }

    @Override
    public int HEALTH_POINTS() {
        return 50;
    }

    @Override
    public int RESISTANCE() {
        return 4;
    }

    @Override
    public int DAMAGE_CHANCES(boolean min_max) {
        if (min_max)
            return 5;
        else return -5;
    }

    @Override
    public void LevelUp() {
        Calculator.Battle.shipLevelUp(this, KNOCK_BACK_ENABLED());
    }
}
