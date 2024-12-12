package alejandro.integración.de.conocimientos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AlejandroIntegraciónDeConocimientos {

    // atributos 
    public String estadohabitacion;
    public int numeroHabitacion;
    private int precionoche;

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        //menú
        String opcion = JOptionPane.showInputDialog(null,
                "Menú\n"
                + "1. Ver estado de las Habitaciones\n"
                + "2. Reservas\n"
                + "3. Salir");
        switch (opcion) {
            case "1":
                // ver las habitaciones
                String opcionHabitaciones = JOptionPane.showInputDialog(null,
                        "**Gestión de Habitaciones**\n"
                        + "1. Ver las habitaciones\n"
                        + "2. Buscar por número de habitación\n"
                        + "3. Modificar una habitación\n"
                        + "4. Volver al menú principal");

                break;
                
            case "2":
             String opcionreserva = JOptionPane.showInputDialog(null,
                     "**Gestión de reserva**\n"
                        + "1. reservar habitacion solo\n"
                        + "2. reservar habitacion duo\n"
                        + "3. cancelar reservacion\n"
                        + "4. Volver al menú principal");
                     
        }

    }
//getters and setters

    public String getEstadohabitacion() {
        return estadohabitacion;
    }

    public void setEstadohabitacion(String estadohabitacion) {
        this.estadohabitacion = estadohabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getPrecionoche() {
        return precionoche;
    }

    public void setPrecionoche(int precionoche) {
        this.precionoche = precionoche;
    }
    
}

