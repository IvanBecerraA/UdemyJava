package seccion1hasta11;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        String userAutenticado = null;

        usernames[0] = "ivan";
        passwords[0] = "12345";
        usernames[1] = "admin";
        passwords[1] = "admin";
        usernames[2] = "pepe";
        passwords[2] = "12345"; */

        String[] usernames = {"ivan", "admin", "pepe"};
        String[] passwords = {"12345", "admin", "12345"};
        String userAutenticado = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();
        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) )? true: esAutenticado;

            userAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) )? usernames[i] : userAutenticado;
            /*if( usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutenticado = true;
                userAutenticado = usernames[i];
                break;
            }*/
        }


        String mensaje = esAutenticado? "Bienvenido " + userAutenticado : "Usuario o contraseña incorrectos";

        /*if(esAutenticado){
            if (userAutenticado.equals("admin")){
                System.out.println("Bienvenido al panel de Administrador");
            } else {
            System.out.println("Bienvenido " + userAutenticado);
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }*/
    }
}
