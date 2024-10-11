import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Moto m1 = new Moto("Yamnaha", "Model1", 2024, 250, "Deportiva");
        Moto m2 = new Moto("Yamnaha", "Model1", 2024, 250, "Deportiva");

        Auto a1 = new Auto("Nissan", "Kicks", 2024, 5, false);
        Auto a2 = new Auto("Suzuki", "Grand Vitara", 2013, 5, false);

        // m1.mostrarDatos();
        // m2.mostrarDatos();
        // a1.mostrarDatos();
        // a2.mostrarDatos();

        vehiculos.add(m1);
        vehiculos.add(m2);
        vehiculos.add(a1);
        vehiculos.add(a2);

        mostrarReporte(vehiculos);
    }

     public static void mostrarReporte(List<Vehiculo> vehiculos) {
        System.out.println("Reporte de Vehículos:");
        System.out.println("=====================");

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Moto) {
                ((Moto) vehiculo).mostrarDatos(); // Llamar al método mostrarDatos de Moto
            } else if (vehiculo instanceof Auto) {
                ((Auto) vehiculo).mostrarDatos(); // Llamar al método mostrarDatos de Auto
            }
            System.out.println(); // Línea en blanco entre vehículos
        }
    }
}
