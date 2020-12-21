package net.danielgolan.shipandbanners.elements;

import net.danielgolan.shipandbanners.interfaces.PrintAbleInterface;
import net.danielgolan.shipandbanners.interfaces.ShipPrintAbleInterface;
import net.danielgolan.shipandbanners.interfaces.ShipTemplateInterface;
import net.danielgolan.shipandbanners.util.Tracker;

public abstract class ShipPrintAble extends Ship implements ShipTemplateInterface, PrintAbleInterface, ShipPrintAbleInterface {
    protected ShipPrintAble(String systemName, int shipGrade, int shipLevel) {
        super(systemName, shipGrade, shipLevel);
    }
    protected ShipPrintAble(String systemName, int shipGrade) {
        super(systemName, shipGrade);
    }
    protected ShipPrintAble(String systemName, int shipGrade, int shipLevel, int DAMAGE, int KNOCK_BACK,
                            int KNOCK_BACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, shipLevel, DAMAGE, KNOCK_BACK, KNOCK_BACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }
    protected ShipPrintAble(String systemName, int shipGrade, int DAMAGE, int KNOCK_BACK, int KNOCK_BACK_RESISTANCE,
                            int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, DAMAGE, KNOCK_BACK, KNOCK_BACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }

    @Override
    public String printStats(boolean colored) {
        return printSYSTEM_NAME(colored, true) + printSHIP_GRADE() + printDAMAGE(colored) + Tracker.Data.COMMA + printKNOCK_BACK(colored)
                + Tracker.Data.COMMA + printHEALTH_POINTS(colored);
    }

    @Override
    public String printSYSTEM_NAME(boolean colored, boolean statsPrinting) {
        if (statsPrinting)
            return Tracker.Color.RESET + super.getSYSTEM_NAME() + " -> ";
        else return Tracker.Color.RESET + super.getSYSTEM_NAME();
    }

    @Override
    public String printDAMAGE(boolean colored) {
        if (colored)
            return Tracker.Color.WHITE_UNDERLINED + "Damage" + Tracker.Color.WHITE + ": " + super.getDamage() + " (" +
                    DAMAGE_CHANCES(false) + Tracker.Data.COMMA + super.getDamageChances(true) + ")" +
                    Tracker.Color.RESET;
        else return "Damage: " + super.getDamage() + " (" + super.getDamageChances(false) + Tracker.Data.COMMA
                + DAMAGE_CHANCES(true) + ")";
    }

    @Override
    public String printKNOCK_BACK(boolean colored) {
        if (colored)
            if (KNOCK_BACK_ENABLED())
                return Tracker.Color.WHITE_UNDERLINED + "KnockBack" + Tracker.Color.WHITE + ": " + super.getKnockBack() + " ("
                        + super.getKnockBackResistance() + ")" + Tracker.Color.RESET;
            else return Tracker.Color.WHITE_UNDERLINED + "KnockBack" + Tracker.Color.WHITE + ": Disabled"
                    + Tracker.Color.RESET;
        else if (KNOCK_BACK_ENABLED())
            return "KnockBack: " + getKnockBack() + " (" + getKnockBackResistance() + ")";
        else return "KnockBack: Disabled";
    }

    @Override
    public String printHEALTH_POINTS(boolean colored) {
        if (colored)
            return Tracker.Color.WHITE_UNDERLINED + "HP" + Tracker.Color.WHITE + ": " + getHealthPoints() + " (" + getResistance()
                    + ")" + Tracker.Color.RESET;
        else return "HP: " + getHealthPoints() + "( " + getResistance() + ")";
    }

    @Override
    public String printSHIP_GRADE() {
        return ("🌟".repeat(Math.max(0, getShipLevel() + 1)) +
                "⭐".repeat(Math.max(0, (getShipPowerLevels().getShipGrade() - getShipLevel()) - 1))) +
                " -> ";
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
