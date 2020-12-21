package net.danielgolan.shipandbanners.interfaces;

public interface ShipTemplateInterface {
    int DAMAGE();
    boolean KNOCK_BACK_ENABLED();
    int KNOCK_BACK();
    int KNOCK_BACK_RESISTANCE();
    int HEALTH_POINTS();
    int RESISTANCE();
    int DAMAGE_CHANCES(boolean min_max);
}
