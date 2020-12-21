package net.danielgolan.shipandbanners.interfaces;

public interface ShipLevelUpAbleInterface {
    void LevelUp();

    int getXP();
    void setXp(int xp);
    void addXP(int xp);
    void removeXP(int xp);

    int getMAX_XP();
}
