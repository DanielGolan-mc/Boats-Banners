package net.danielgolan.shipandbanners.elements;

class ShipPowerLevels {
    private int shipGrade;
    private ShipPowerLevel[] shipPowerLevels;

    ShipPowerLevels(int shipGrade){
        setShipGrade(shipGrade);
        resetShipPowerLevels();
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
    public void resetShipPowerLevels(){
        setShipPowerLevels(new ShipPowerLevel[getShipGrade()]);
    }
}
