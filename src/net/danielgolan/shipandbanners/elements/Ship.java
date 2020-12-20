package net.danielgolan.shipandbanners.elements;

abstract public class Ship {
    private String SYSTEM_NAME;
    private ShipPowerLevels shipPowerLevels;
    private int shipLevel;

    protected Ship(String systemName, int shipGrade, int shipLevel){
        setSYSTEM_NAME(systemName);
        setShipPowerLevels(new ShipPowerLevels(shipGrade));
        setShipLevel(shipLevel);
    }
    protected Ship(String systemName, int shipGrade) {
        setSYSTEM_NAME(systemName);
        setShipPowerLevels(new ShipPowerLevels(shipGrade));
        setShipLevel(0);
    }

    public String getSYSTEM_NAME() {
        return SYSTEM_NAME;
    }
    private void setSYSTEM_NAME(String SYSTEM_NAME) {
        this.SYSTEM_NAME = SYSTEM_NAME;
    }

    public ShipPowerLevels getShipPowerLevels() {
        return shipPowerLevels;
    }
    private void setShipPowerLevels(ShipPowerLevels shipPowerLevels) {
        this.shipPowerLevels = shipPowerLevels;
    }

    public int getShipLevel() {
        return shipLevel;
    }
    public void setShipLevel(int shipLevel) {
        this.shipLevel = shipLevel;
    }

    public int getDamage(int shipLevel) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getDAMAGE();
    }
    public int getDamage() {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getDAMAGE();
    }
    public void setDamage(int shipLevel, int damage) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setDAMAGE(damage);
    }
    public void setDamage(int damage) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setDAMAGE(damage);
    }

    public int getHealthPoints(int shipLevel) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getHEALTH_POINTS();
    }
    public int getHealthPoints() {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getHEALTH_POINTS();
    }
    public void setHealthPoints(int shipLevel, int healthPoints) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setHEALTH_POINTS(healthPoints);
    }
    public void setHealthPoints(int healthPoints) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setHEALTH_POINTS(healthPoints);
    }

    public int getKnockBack(int shipLevel) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getKNOCK_BACK();
    }
    public int getKnockBack() {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getKNOCK_BACK();
    }
    public void setKnockBack(int shipLevel, int knockBack) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setKNOCK_BACK(knockBack);
    }
    public void setKnockBack(int knockBack) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setKNOCK_BACK(knockBack);
    }

    public int getKnockBackResistance(int shipLevel) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getKNOCK_BACK_RESISTANCE();
    }
    public int getKnockBackResistance() {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getKNOCK_BACK_RESISTANCE();
    }
    public void setKnockBackResistance(int shipLevel, int knockBackResistance) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setKNOCK_BACK_RESISTANCE(knockBackResistance);
    }
    public void setKnockBackResistance(int knockBackResistance) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setKNOCK_BACK_RESISTANCE(knockBackResistance);
    }

    public int getResistance(int shipLevel) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getRESISTANCE();
    }
    public int getResistance() {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getRESISTANCE();
    }
    public void setResistance(int shipLevel, int resistance) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setRESISTANCE(resistance);
    }
    public void setResistance(int resistance) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setRESISTANCE(resistance);
    }

    public int getDamageChances(int shipLevel, boolean min_max) {
        return shipPowerLevels.getShipPowerLevel()[shipLevel].getDAMAGE_CHANCES(min_max);
    }
    public int getDamageChances(boolean min_max) {
        return shipPowerLevels.getShipPowerLevel()[getShipLevel()].getDAMAGE_CHANCES(min_max);
    }
    public void setDamageChances(int shipLevel, int damage, boolean min_max) {
        shipPowerLevels.getShipPowerLevel()[shipLevel].setDAMAGE_CHANCES(min_max, damage);
    }
    public void setDamageChances(int damage, boolean min_max) {
        shipPowerLevels.getShipPowerLevel()[getShipLevel()].setDAMAGE_CHANCES(min_max, damage);
    }
}
