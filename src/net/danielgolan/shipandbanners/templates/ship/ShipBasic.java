package net.danielgolan.shipandbanners.templates.ship;

import net.danielgolan.shipandbanners.elements.Ship;
import net.danielgolan.shipandbanners.interfaces.ShipTemplate;

public class ShipBasic extends Ship implements ShipTemplate {
    ShipBasic() {
        super("ship_basic", 1, 0);
        setDamage(DAMAGE());
        setHealthPoints(30);
        setKnockBack(0);
        setKnockBackResistance(0);
        setDamageChances(DAMAGE_CHANCES(false), false);
        setDamageChances(DAMAGE_CHANCES(false), true);
    }

    @Override
    public int DAMAGE() {
        return 10;
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