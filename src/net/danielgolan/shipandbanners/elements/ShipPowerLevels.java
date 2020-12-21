package net.danielgolan.shipandbanners.elements;

class ShipPowerLevels {
    private int shipGrade;
    private ShipPowerLevel[] shipPowerLevels;

    ShipPowerLevels(int shipGrade) {
        setShipGrade(shipGrade);
        resetShipPowerLevels();
    }
    ShipPowerLevels(int shipGrade, int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        setShipGrade(shipGrade);
        resetShipPowerLevels(DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }

    public int getShipGrade() {
        return shipGrade;
    }
    public void setShipGrade(int shipGrade) {
        this.shipGrade = shipGrade;
    }

    public ShipPowerLevel[] getShipPowerLevel() {
        return shipPowerLevels;
    }
    private void setShipPowerLevels(ShipPowerLevel[] shipPowerLevels) {
        this.shipPowerLevels = shipPowerLevels;
    }
    public void resetShipPowerLevels() {
        setShipPowerLevels(new ShipPowerLevel[getShipGrade()]);
    }
    public void resetShipPowerLevels(int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE) {
        setShipPowerLevels(new ShipPowerLevel[getShipGrade()]);
        refreshShipPowerLevels(DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
    }
    public void refreshShipPowerLevels(int DAMAGE, int KNOCK_BACK, int KNOCKBACK_RESISTANCE, int HEALTH_POINTS, int RESISTANCE){
        for (int i = 0; i < shipPowerLevels.length; i++) {
            shipPowerLevels[i] = new ShipPowerLevel(DAMAGE, KNOCK_BACK, KNOCKBACK_RESISTANCE, HEALTH_POINTS, RESISTANCE);
        }
    }
}