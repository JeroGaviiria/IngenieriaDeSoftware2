package clases;

import java.util.Scanner;

public class EnviarEmailFactura {

    public void enviarEmailFactura() {
        Scanner scanner = new Scanner(System.in);
        
        String emailDestinatario;
        while (true) {
            
            System.out.print("Ingresa el correo del destinatario: ");
            emailDestinatario = scanner.nextLine().trim(); 
            
            if (!emailDestinatario.isEmpty()) {
                break; 
            } else {
                System.out.println("El correo  no puede estar vacio.");
            }
        }
        
        System.out.println("Enviando la factura al correo: " + emailDestinatario);
        System.out.println("Correo enviado exitosamente.");
    }
}
