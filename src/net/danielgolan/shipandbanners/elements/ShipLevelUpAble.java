package net.danielgolan.shipandbanners.elements;

import net.danielgolan.shipandbanners.interfaces.ShipLevelUpAbleInterface;
import net.danielgolan.shipandbanners.util.Calculator;

public abstract class ShipLevelUpAble extends ShipPrintAble implements ShipLevelUpAbleInterface {
    protected ShipLevelUpAble(String systemName, int shipGrade, int shipLevel) {
        super(systemName, shipGrade, shipLevel);
    }
    protected ShipLevelUpAble(String systemName, int shipGrade) {
        super(systemName, shipGrade);
    }
    protected ShipLevelUpAble(String systemName, int shipGrade, int shipLevel, int DAMAGE, int KNOCK_BACK,
                              int KNOCK_BACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, shipLevel, DAMAGE, KNOCK_BACK, KNOCK_BACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }
    protected ShipLevelUpAble(String systemName, int shipGrade, int DAMAGE, int KNOCK_BACK, int KNOCK_BACK_RESISTANCE,
                              int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, DAMAGE, KNOCK_BACK, KNOCK_BACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }


    private int XP;
    private final int MAX_XP = 1200;

    @Override
    public void LevelUp() {
        while (getXP() >= MAX_XP) {
            Calculator.Battle.shipLevelUp(this, KNOCK_BACK_ENABLED());
            removeXP(MAX_XP);
        }
    }

    @Override
    public int getXP() {
        return XP;
    }

    @Override
    public void setXp(int xp) {
        XP = xp;
        LevelUp();
    }

    @Override
    public void addXP(int xp) {
        setXp(getXP() + xp);
    }

    @Override
    public void removeXP(int xp) {
        setXp(getXP() - xp);
    }

    @Override
    public int getMAX_XP() {
        return MAX_XP;
    }
}
