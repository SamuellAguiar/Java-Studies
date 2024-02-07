class FuelTank {
    private double capacity;
    private double currentFuel;

    FuelTank(double capacity) {
        this.capacity = capacity;
        this.currentFuel = 0;
    }

    void refuel(double fuel) {
        this.currentFuel = Math.min(this.currentFuel + fuel, this.capacity);
    }

    double getCapacity() {
        return this.capacity;
    }

    double getCurrentFuel() {
        return this.currentFuel;
    }
}
