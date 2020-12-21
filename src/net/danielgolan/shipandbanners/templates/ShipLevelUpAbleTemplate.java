package net.danielgolan.shipandbanners.templates;

import net.danielgolan.shipandbanners.interfaces.ShipLevelUpAble;
import net.danielgolan.shipandbanners.util.Calculator;

public abstract class ShipLevelUpAbleTemplate extends ShipTemplate implements ShipLevelUpAble {
    protected ShipLevelUpAbleTemplate(String systemName, int shipGrade, int shipLevel) {
        super(systemName, shipGrade, shipLevel);
    }
    protected ShipLevelUpAbleTemplate(String systemName, int shipGrade) {
        super(systemName, shipGrade);
    }
    protected ShipLevelUpAbleTemplate(String systemName, int shipGrade, int shipLevel, int DAMAGE, int KNOCK_BACK,
                           int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, shipLevel, DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }
    protected ShipLevelUpAbleTemplate(String systemName, int shipGrade, int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE,
                           int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }

    @Override
    public void LevelUp() {
        Calculator.Battle.shipLevelUp(this, KNOCK_BACK_ENABLED());
    }

    @Override
    public int DAMAGE() {
        return 0;
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
        return 0;
    }

    @Override
    public int RESISTANCE() {
        return 0;
    }

    @Override
    public int DAMAGE_CHANCES(boolean min_max) {
        if (min_max)
            return 10;
        else return -10;
    }
}
