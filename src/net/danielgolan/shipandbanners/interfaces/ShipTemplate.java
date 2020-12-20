package net.danielgolan.shipandbanners.interfaces;

public interface ShipTemplate {
    int DAMAGE();
    int KNOCK_BACK();
    int KNOCK_BACK_RESISTANCE();
    int HEALTH_POINTS();
    int RESISTANCE();
    int DAMAGE_CHANCES(boolean min_max);
}
