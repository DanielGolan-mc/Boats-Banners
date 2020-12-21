package net.danielgolan.shipandbanners.templates;

import net.danielgolan.shipandbanners.elements.Ship;
import net.danielgolan.shipandbanners.interfaces.Printable;
import net.danielgolan.shipandbanners.interfaces.ShipPrintable;
import net.danielgolan.shipandbanners.interfaces.ShipTemplateInterface;
import net.danielgolan.shipandbanners.util.Tracker;

public abstract class ShipTemplate extends Ship implements ShipTemplateInterface, Printable, ShipPrintable {
    protected ShipTemplate(String systemName, int shipGrade, int shipLevel) {
        super(systemName, shipGrade, shipLevel);
    }
    protected ShipTemplate(String systemName, int shipGrade) {
        super(systemName, shipGrade);
    }
    protected ShipTemplate(String systemName, int shipGrade, int shipLevel, int DAMAGE, int KNOCK_BACK,
                           int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, shipLevel, DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }
    protected ShipTemplate(String systemName, int shipGrade, int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE,
                           int HEALTH_POINTS, int RESISTANCE) {
        super(systemName, shipGrade, DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }

    @Override
    public String printStats(boolean colored) {
        return printSYSTEM_NAME(colored, true) + printDAMAGE(colored) + Tracker.Data.COMMA + printKNOCK_BACK(colored)
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
            return Tracker.Color.WHITE_UNDERLINED + "Damage" + Tracker.Color.WHITE + ": " + DAMAGE() + " (" +
                    DAMAGE_CHANCES(false) + Tracker.Data.COMMA + DAMAGE_CHANCES(true) + ")" +
                    Tracker.Color.RESET;
        else return "Damage: " + DAMAGE() + " (" + DAMAGE_CHANCES(false) + Tracker.Data.COMMA
                + DAMAGE_CHANCES(true) + ")";
    }

    @Override
    public String printKNOCK_BACK(boolean colored) {
        if (colored)
            if (KNOCK_BACK_ENABLED())
                return Tracker.Color.WHITE_UNDERLINED + "KnockBack" + Tracker.Color.WHITE + ": " + KNOCK_BACK() + " ("
                        + KNOCK_BACK_RESISTANCE() + ")" + Tracker.Color.RESET;
            else return Tracker.Color.WHITE_UNDERLINED + "KnockBack" + Tracker.Color.WHITE + ": Disabled"
                    + Tracker.Color.RESET;
        else if (KNOCK_BACK_ENABLED())
            return "KnockBack: " + KNOCK_BACK() + " (" + KNOCK_BACK_RESISTANCE() + ")";
        else return "KnockBack: Disabled";
    }

    @Override
    public String printHEALTH_POINTS(boolean colored) {
        if (colored)
            return Tracker.Color.WHITE_UNDERLINED + "HP" + Tracker.Color.WHITE + ": " + HEALTH_POINTS() + " (" + RESISTANCE()
                    + ")" + Tracker.Color.RESET;
        else return "HP: " + HEALTH_POINTS() + "( " + RESISTANCE() + ")";
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
