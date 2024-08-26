package clases;

import modelos.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GuardarFactura {

    public static void guardarFactura(Connection conn, Factura factura) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el ID del cliente para asingarle la factura: ");
            int clienteId = scanner.nextInt();
            factura.setClienteId(clienteId);  

            String query = "INSERT INTO factura (cliente_id, fecha, total) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, factura.getClienteId());
            pstmt.setDate(2, new java.sql.Date(factura.getFecha().getTime()));
            pstmt.setDouble(3, factura.getTotal());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Factura guardada exitosamente.");
            } else {
                System.out.println("Error al guardar la factura.");
            }
            
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
