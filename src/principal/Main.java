package principal;

import modelos.Cliente;
import modelos.Factura;
import clases.*;
import db.Conexion;
import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //Conexion a la base de datos
            Connection conn = Conexion.getConnection();

            //Ingresar datos del ciente
            System.out.println("Ingresa los datos del cliente a guardar:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Correo: ");
            String email = scanner.nextLine();
            System.out.print("Direccion: ");
            String direccion = scanner.nextLine();
            //Crear un cliente de clase Cliente
            Cliente cliente = new Cliente(0, nombre, email, direccion);
            GuardarCliente.guardarCliente(conn, cliente);

            //Mostrar la lista de clientes
            String query = "SELECT * FROM cliente";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Lista de clientes:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") + ", Correo: " + rs.getString("correo") + ", Direccion: " + rs.getString("direccion"));
            }

            //Solicitar y guardar la factura
            Factura factura = new Factura(0, 0, new Date(), 100.50);
            GuardarFactura.guardarFactura(conn, factura);
            
            //Enviar email de la factura
            EnviarEmailFactura emailFactura = new EnviarEmailFactura();             
            emailFactura.enviarEmailFactura();

            //Generar reporte de facturas del mes
            GenerarReporteFactura.generarReporteFactura(conn);

            //Enviar factura a la DIAN
            EnviarFacturaDIAN.enviarFacturaDIAN(factura);

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
