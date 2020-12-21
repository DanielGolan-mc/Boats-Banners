package net.danielgolan.shipandbanners.interfaces;

public interface ShipPrintable extends Printable{
    String printSYSTEM_NAME(boolean colored, boolean statsPrinting);
    String printDAMAGE(boolean colored);
    String printKNOCK_BACK(boolean colored);
    String printHEALTH_POINTS(boolean colored);
}
