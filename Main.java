/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //invocamos clases       
        GestorIO miMensaje = new GestorIO();
        cuenta miCuenta = new cuenta();

        // se crean variables de mensajes para hacer mas corto y legible el codigo 

        final String primerMenu = ("Informacion importante: " + "\n" + 
                                      "-Precio por hora 10 mil colones + 13% de IVA " + "\n" + 
                                      "-Este tiempo va desde que saca la bicicleta del" + "\n" + 
                                      "estacionamiento, hasta dejarla otra vez en uno de estos. " + "\n" +
                                      "\n" + 
                                      "1- Alquilar Bicicleta" + "\n" +
                                      "2- Salir");


        final String segundoMenu = ("1- Log in" + "\n" +
                                    "2- Sign in");

        // variables de salida 
        boolean salir = false; 
        
        // se inserta un "do" que llevara por dentro todo el proceso del main 

        do{

            int opcionPrimerM = miMensaje.solicitarInt(primerMenu);
  
            // insertamos un switch para desarrollar el codigo dependiendo de la eleccion del usuario 
 
            switch (opcionPrimerM) {

                case 1 :

                    int opcionSegundoM = miMensaje.solicitarInt(segundoMenu);

                    // se inserta otro switch para hacer respectivos casos (log in o sign in)

                    switch (opcionSegundoM) {

                        case 1 : 

                            String usuario = miMensaje.solicitarString("Digite su usuario");
                            miCuenta.setUsuario(usuario);

                            String password = miMensaje.solicitarString("Digite su contrasena");
                            miCuenta.setPassword(password);
                            
                            // se llaman los metodos de la clase cuenta para validar los datos 
                            break;


                        case 2 : 

                            String nombreCompleto = miMensaje.solicitarString("Creacion de cuenta" + "\n" +
                                                                              "\n" + "Nombre completo: ");
                            miCuenta.setNombreCompleto(nombreCompleto);

                            String usuarioNuevo = miMensaje.solicitarString("Usuario: (No se permiten caracteres especiales ni numeros) ");
                            miCuenta.setUsuario(usuarioNuevo);

                            String correo = miMensaje.solicitarString("Correo electronico: ");
                            miCuenta.setCorreo(correo);

                            String direccionFisica = miMensaje.solicitarString("Direccion fisica: ");
                            miCuenta.setDireccionFisica(direccionFisica);

                            String passwordNueva = miMensaje.solicitarString("Password:  ");
                            miCuenta.setPassword(passwordNueva);

                            break;

                        default:
                        miMensaje.desplegarString("El usario digito una opcion invalida");
                        salir=false;
                        break;

                    }



                    break;


                case 2:
                    
                    miMensaje.desplegarString("Progama cerrado");
                    salir = false;
                    break;

                default:
                miMensaje.desplegarString("El usario digito una opcion invalida");
                salir=false;
                break;

            }


        }while (salir = false);



    }

}
