class Vehicle {
    private Engine engine;
    private Tire[] tires;

    Vehicle(Engine engine, Tire[] tires) {
        this.engine = engine;
        this.tires = tires;
    }

    Engine getEngine() {
        return this.engine;
    }

    Tire[] getTires() {
        return this.tires;
    }
}