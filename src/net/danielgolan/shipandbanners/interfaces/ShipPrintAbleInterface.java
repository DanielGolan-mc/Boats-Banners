package net.danielgolan.shipandbanners.interfaces;

public interface ShipPrintAbleInterface extends PrintAbleInterface {
    String printSYSTEM_NAME(boolean colored, boolean statsPrinting);
    String printDAMAGE(boolean colored);
    String printKNOCK_BACK(boolean colored);
    String printHEALTH_POINTS(boolean colored);
    String printSHIP_GRADE();
}
