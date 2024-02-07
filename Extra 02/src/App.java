public class App {
    public static void main(String[] args) throws Exception {
        FuelTank tank = new FuelTank(50);
        Engine engine = new Engine(71, 12, tank);
        Tire[] tires = {new Tire(27), new Tire(27), new Tire(23), new Tire(23)};
        Vehicle vehicle = new Vehicle(engine, tires);

        tank.refuel(30);

        System.out.println("Engine power: " + engine.getPower());
        System.out.println("Engine consumption rate: " + engine.getConsumptionRate());
        System.out.println("Fuel tank capacity: " + tank.getCapacity());
        System.out.println("Fuel tank current fuel: " + tank.getCurrentFuel());
        for (int i = 0; i < tires.length; i++) {
            System.out.println("Tire " + (i + 1) + " pressure: " + tires[i].getPressure());
        }

        engine.drive(300, tires);
        System.out.println("Distance driven: 300 km");
        System.out.println("Fuel remaining: " + tank.getCurrentFuel() + " liters");

        tires[2].inflate(-6);
        System.out.println("Rear left tire pressure: " + tires[2].getPressure());
    }
}