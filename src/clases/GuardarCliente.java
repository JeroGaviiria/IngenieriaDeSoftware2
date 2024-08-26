package clases;

import modelos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarCliente {

    public static void guardarCliente(Connection conn, Cliente cliente) throws SQLException {
        String query = "INSERT INTO Cliente (nombre, correo, direccion) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)){
        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getCorreo());
        stmt.setString(3, cliente.getDireccion());
        stmt.executeUpdate();
        stmt.close();
    }
}}
