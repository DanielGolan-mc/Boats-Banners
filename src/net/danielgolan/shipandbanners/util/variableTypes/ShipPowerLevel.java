package net.danielgolan.shipandbanners.util.variableTypes;

public class ShipPowerLevel {
    private int DAMAGE;
    private int KNOCK_BACK;
    private int KNOCK_BACK_RESISTANCE;
    private int HEALTH_POINTS;
    private int RESISTANCE;
    private int DAMAGE_CHANCES_MIN;
    private int DAMAGE_CHANCES_MAX;

    ShipPowerLevel(int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE){
        setDAMAGE(DAMAGE);
        setKNOCK_BACK(KNOCK_BACK);
        setKNOCK_BACK_RESISTANCE(KNOCKBACK_RESISTANCE);
        setHEALTH_POINTS(HEALTH_POINTS);
        setRESISTANCE(RESISTANCE);
        setDAMAGE_CHANCES(false, -10);
        setDAMAGE_CHANCES(true, 10);
    }

    public int getDAMAGE() {
        return DAMAGE;
    }
    public void setDAMAGE(int DAMAGE) {
        this.DAMAGE = DAMAGE;
    }

    public int getHEALTH_POINTS() {
        return HEALTH_POINTS;
    }
    public void setHEALTH_POINTS(int HEALTH_POINTS) {
        this.HEALTH_POINTS = HEALTH_POINTS;
    }

    public int getKNOCK_BACK() {
        return KNOCK_BACK;
    }
    public void setKNOCK_BACK(int KNOCK_BACK) {
        this.KNOCK_BACK = KNOCK_BACK;
    }

    public int getKNOCK_BACK_RESISTANCE() {
        return KNOCK_BACK_RESISTANCE;
    }
    public void setKNOCK_BACK_RESISTANCE(int KNOCK_BACK_RESISTANCE) {
        this.KNOCK_BACK_RESISTANCE = KNOCK_BACK_RESISTANCE;
    }

    public int getRESISTANCE() {
        return RESISTANCE;
    }
    public void setRESISTANCE(int RESISTANCE) {
        this.RESISTANCE = RESISTANCE;
    }

    public int getDAMAGE_CHANCES(boolean min_max) {
        if (min_max)
            return DAMAGE_CHANCES_MAX;
        else return DAMAGE_CHANCES_MIN;
    }
    public void setDAMAGE_CHANCES(boolean min_max, int setTo) {
        if (min_max)
            DAMAGE_CHANCES_MAX = setTo;
        else DAMAGE_CHANCES_MIN = setTo;
    }
}
