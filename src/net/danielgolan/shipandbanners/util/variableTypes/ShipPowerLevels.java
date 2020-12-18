package net.danielgolan.shipandbanners.util.variableTypes;

public class ShipPowerLevels {
    private int shipGrade;
    private int shipLevel;
    private ShipPowerLevel[] shipPowerLevels;

    ShipPowerLevels(int shipGrade){
        setShipGrade(shipGrade);
        resetShipPowerLevels();
    }
    ShipPowerLevels(int shipGrade, int shipLevel){
        setShipGrade(shipGrade);
        resetShipPowerLevels();
        setShipLevel(shipLevel);
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

    public int getShipLevel() {
        return shipLevel;
    }
    public void setShipLevel(int shipLevel) {
        this.shipLevel = shipLevel;
    }
}
