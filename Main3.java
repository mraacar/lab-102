import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos vehiculos tienes?");
        int count = Integer.parseInt(scanner.nextLine());

        Car[] cars = new Car[count];

        for (int i = 0; i < count; i++) {
            String type;
            while (true) {
                System.out.println("\nIngrese el tipo de vehiculo (sedan / utility / truck):");
                type = scanner.nextLine().toLowerCase();
                if (type.equals("sedan") || type.equals("utility") || type.equals("truck")) {
                    break;
                }
                System.out.println("Tipo no válido. Por favor, ingrese 'sedan', 'utility' o 'truck'.");
            }

            System.out.println("Ingrese VIN:");
            String vin = scanner.nextLine();

            System.out.println("Ingrese marca:");
            String make = scanner.nextLine();

            System.out.println("Ingrese modelo:");
            String model = scanner.nextLine();

            System.out.println("Ingrese kilometraje (entero):");
            int mileage = Integer.parseInt(scanner.nextLine());

            if (type.equals("sedan")) {
                cars[i] = new Sedan(vin, make, model, mileage);
            } else if (type.equals("utility")) {
                System.out.println("¿Tiene tracción en las cuatro ruedas? (true/false):");
                boolean fourWheelDrive = Boolean.parseBoolean(scanner.nextLine());
                cars[i] = new UtilityVehicle(vin, make, model, mileage, fourWheelDrive);
            } else { // type.equals("truck")
                System.out.println("Ingrese capacidad de remolque (decimal):");
                double towingCapacity = Double.parseDouble(scanner.nextLine());
                cars[i] = new Truck(vin, make, model, mileage, towingCapacity);
            }
        }

        System.out.println("\nInventario de autos:");
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }

        scanner.close();
    }
}
