class Tire {
    private double pressure;

    Tire(double pressure) {
        this.pressure = pressure;
    }

    void inflate(double pressure) {
        this.pressure += pressure;
    }

    double getPressure() {
        return this.pressure;
    }
}