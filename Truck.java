public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck - VIN: " + vinNumber + ", Marca: " + make + ", Modelo: " + model +
                ", Kilometraje: " + mileage + ", Capacidad de remolque: " + towingCapacity;
    }
}
