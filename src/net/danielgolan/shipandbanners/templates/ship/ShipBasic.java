package net.danielgolan.shipandbanners.templates.ship;

import net.danielgolan.shipandbanners.elements.ShipPrintAble;

public class ShipBasic extends ShipPrintAble {
    public ShipBasic() {
        super("ship_basic", 1, 0);
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
        return false;
    }

    @Override
    public int KNOCK_BACK() {
        return 0;
    }

    @Override
    public int KNOCK_BACK_RESISTANCE() {
        return 0;
    }

    @Override
    public int HEALTH_POINTS() {
        return 30;
    }

    @Override
    public int RESISTANCE() {
        return 0;
    }

    @Override
    public int DAMAGE_CHANCES(boolean min_max) {
        if (min_max)
            return 5;
        else return -5;
    }
}