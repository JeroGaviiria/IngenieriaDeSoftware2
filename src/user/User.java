package user;
import java.util.Scanner;
import java.util.regex.*;

//Clase Usuario
class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;

    //Constructor
    public Usuario(String nombre, String apellido, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;       
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public String getDireccion() {
        return direccion;
    }
}

//Obtener informacion del usuario
class ObtenerInformacion {
    public void obtenerInformacion(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Direccion: " + usuario.getDireccion());
    }
}

//Enviar correos electronicos
class EnviarCorreo {
    public void enviarCorreo(String destinatario, String asunto, String mensaje) {
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Se ha enviado el correo.");
    }
}
//Validar la contraseña
class ValidarContrasena {
    public boolean validarContrasena(String contrasena) {
        if (contrasena.length() > 8) {
        boolean mayuscula = false;
        boolean numero = false;
        boolean letra = false;
        boolean especial = false;

        
        Pattern special = Pattern.compile("[¡!¿?*+-]");
        Matcher hasSpecial = special.matcher(contrasena);
        
        char l;

        for (int i = 0; i < contrasena.length(); i++) {
            l = contrasena.charAt(i);         
            if (Character.isDigit(l)) {
                numero = true;
            }
            if (Character.isLetter(l)) {
                letra = true;
            }
            if (Character.isUpperCase(l)) { 
                mayuscula = true;
            }
            if (hasSpecial.find()) {       
                especial = true;
            }
        }

            return numero && mayuscula && letra && especial ;
    } else {
        return false;
    }
    }
}

//Calcular el salario
class CalcularSalario {
    public void calcularSalario(double horasTrabajadas, double pagoPorHora) {
        double salario = horasTrabajadas * pagoPorHora;
        System.out.println("Salario: $" + salario);
    }
}

//Clase Principal
public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crea un usario de clase Usuario
        Usuario usuario = new Usuario("Juan", "Perez", "juanp@gmail.com", "Enea");

        //Se llama a la clase para obtener la info
        ObtenerInformacion obtenerInfo = new ObtenerInformacion();
        obtenerInfo.obtenerInformacion(usuario);
        
        //Se le pide al usuario que ingrese la contraseña para validarla
        System.out.print("Ingresa tu contrasena a validar: ");
        String contrasena = scanner.nextLine();
        
       //Se llama a la clase y se hace un SOUT para decir si la contraseña fue 
       //valida o invalida
        ValidarContrasena validador = new ValidarContrasena();
        if (validador.validarContrasena(contrasena)) {
            System.out.println("Contraseña valida.");
        } else {
            System.out.println("Contraseña invalida.");
        }

        //Se le pide datos al usuario para calcular su salario
        System.out.print("Ingresa las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingresa cuanto te pagan la hora: ");
        double pagoPorHora = scanner.nextDouble();

        //Se llama a la clase para calcular el salario
        CalcularSalario calculadoraDeSalarios = new CalcularSalario();
        calculadoraDeSalarios.calcularSalario(horasTrabajadas, pagoPorHora);
        scanner.nextLine(); 

        
        //Se le pide al usuario datos para enviar el correo
        System.out.print("Ingresa el correo del destinatario: ");
        String destinatario = scanner.nextLine();
        System.out.print("Ingresa el asunto: ");
        String asunto = scanner.nextLine();
        System.out.print("Ingresa el contenido: ");
        String mensaje = scanner.nextLine();

       //Se llama a la clase para enviar el correo
        EnviarCorreo enviarCorreos = new EnviarCorreo();
        enviarCorreos.enviarCorreo(destinatario, asunto, mensaje);

        scanner.close();
    }
}
