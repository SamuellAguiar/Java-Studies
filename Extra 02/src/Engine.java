class Engine {
    private double power;
    private double consumptionRate;
    private FuelTank fuelTank;

    Engine(double power, double consumptionRate, FuelTank fuelTank) {
        this.power = power;
        this.consumptionRate = consumptionRate;
        this.fuelTank = fuelTank;
    }

    void drive(double distance, Tire[] tires) {
        double consumption = distance / this.consumptionRate;
        int lowPressureTires = 0;
        for (Tire tire : tires) {
            if (tire.getPressure() < 20) lowPressureTires++;
        }
        if (lowPressureTires > 1) consumption *= 1.3;
        this.fuelTank.refuel(-consumption);
    }

    double getPower() {
        return this.power;
    }

    double getConsumptionRate() {
        return this.consumptionRate;
    }

    FuelTank getFuelTank() {
        return this.fuelTank;
    }
}