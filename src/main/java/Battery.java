public class Battery {
    private int capacityMAh;
    private boolean isCharged = false;

    public Battery(int capacityMAh) {
        this.capacityMAh = capacityMAh;
    }

    public boolean isCharged() {
        return isCharged;
    }

    public int getCapacityMAh() {
        return this.capacityMAh;
    }

    public void charge() {
        isCharged = true;
    }

    @Override
    public String toString() {
        return "Battery: " + this.capacityMAh + " mAh, Charged: " + isCharged;
    }
}
