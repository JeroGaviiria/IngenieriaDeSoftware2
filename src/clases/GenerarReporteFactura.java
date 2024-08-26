package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GenerarReporteFactura {

    public static void generarReporteFactura(Connection conn) {
        Scanner scanner = new Scanner(System.in);

        try {         
            System.out.print("Ingresa el numero del mes (1-12) para generar el reporte: ");
            int mes = scanner.nextInt();
       
            if (mes < 1 || mes > 12) {
                System.out.println("Mes invalido. Debe ingresar un número entre 1 y 12.");
                return;
            }

            String query = "SELECT * FROM factura WHERE MONTH(fecha) = " + mes;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Reporte de Facturas del Mes " + mes + ":");
            boolean hayFacturas = false;
            while (rs.next()) {
                hayFacturas = true;
                System.out.println("ID: " + rs.getInt("id") + ", Cliente ID: " + rs.getInt("cliente_id") +
                                   ", Fecha: " + rs.getDate("fecha") + ", Total: $" + rs.getDouble("total"));
            }

            if (!hayFacturas) {
                System.out.println("No se encontraron facturas en el mes " + mes + ".");
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
