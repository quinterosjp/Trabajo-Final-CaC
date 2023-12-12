package HomeBanking.trabajoPracticoFinal;
import java.util.*;

public class TrabajoFinalCaC {

    public static void main(String[] args) {
        //Variables
        final int nroCuenta = 18;
        final String usuario = "quinterosjp";
        final String password = "q12345";
        int saldo = 182000;

        //Comparaciones
        int nroCuenta2;
        String usuario2;
        String password2;
        Scanner miTeclado = new Scanner(System.in);
        Scanner miTeclado2 = new Scanner(System.in);
        int opc;
        int movimientoPago = 0;

        //Servicios
        int agua = 2457;
        int luz = 15220;
        int gas = 1448;


        do {
            imprimirMenu();
            opc = miTeclado.nextInt();

            switch (opc) {
                case 1:
                    imprimirHome();
                    System.out.print("Ingrese su numero de cuenta: ");
                    nroCuenta2 = miTeclado.nextInt();
                    System.out.print("Ingrese su usuario: ");
                    usuario2 = miTeclado2.nextLine();
                    usuario2 = usuario2.toLowerCase();
                    System.out.print("Ingrese su contraseña: ");
                    password2 = miTeclado2.nextLine();

                    if (nroCuenta2 == nroCuenta && usuario2.equals(usuario) && password2.equals(password)) {
                        do {
                            imprimirOpciones();
                            opc = miTeclado.nextInt();
                            switch (opc) {
                                case 1:
                                    saldo = extraccion(saldo);
                                    break;
                                case 2:
                                    pagoServicio();
                                    int opc1;
                                    opc1 = miTeclado.nextInt();
                                    switch (opc1) {
                                        case 1:
                                            int A = saldo - agua;
                                            saldo = A;
                                            System.out.println("Se adeudo $2457 a ServiciosHidro su saldo es: $" + saldo);
                                            break;
                                        case 2:
                                            int B = saldo - gas;
                                            saldo = B;
                                            System.out.println("Se adeudo $1448 a NeoGas su saldo es: $" + saldo);
                                            break;
                                        case 3:
                                            int C = saldo - luz;
                                            saldo = C;
                                            System.out.println("Se adeudo $15220 a ElectricaConcordia su saldo es: $" + saldo);
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Saliendo del HomeBaking");
                                    break;
                                case 4:
                                    saldo = ingreso(saldo);
                                    break;
                                default:
                                    System.out.println("La operación no es valida o es inexistente");
                                    break;
                            }
                        } while (opc != 3);

                    } else {
                        System.out.println("Parece que uno o mas datos son incorrectos");
                    }


                    break;
                case 2:
                    imprimirSaludo();
                    break;
                default:
                    System.out.println("La opción no es valida o es inexistente");
                    break;

            }

        } while (opc != 2);


    }

    public static void imprimirSaludo() {
        System.out.println("¡Muchas gracias por confiar en Nuevo Banco Concordia!");
        System.out.println("*************************************");
        System.out.println("Grupo 18 Juan Pablo Quinteros");
        System.out.println("*************************************");
    }

    public static void imprimirHome() {
        System.out.println("*************************************");
        System.out.println("¡Bienvenido al Nuevo Banco Concordia!");
        System.out.println("*************************************");
    }

    public static void imprimirOpciones() {
        System.out.println("[1] - Realizar una extración");
        System.out.println("[2] - Realizar un pago de Servicio");
        System.out.println("[3] - Menu Principal");
        System.out.println("[4] - Ingresar dinero a la cuenta");
        System.out.print("¿Que desea hacer?");
    }

    public static void imprimirMenu() {
        System.out.println("[1] - Ingresar al Sistema.");
        System.out.println("[2] - Salir");
        System.out.print("A continuación ingrese una opcion por favor: ");
    }

    public static void pagoServicio() {
        System.out.println("¿Que servicio desea pagar?");
        System.out.println("[1] Pagar Agua (ServiciosHidro)");
        System.out.println("[2] Pagar Gas (NeoGas)");
        System.out.println("[3] Pagar Luz (ElectricaConcordia)");
    }

    public static int extraccion(int saldo) {
        int movimientoPago;
        Scanner miTeclado = new Scanner(System.in);
        System.out.print("Ingrese el monto a retirar: ");
        movimientoPago = miTeclado.nextInt();
        if (saldo >= movimientoPago) {
            saldo -= movimientoPago;
            System.out.println("Retire su efectivo!");
            System.out.println("Retiro " + movimientoPago + " Su saldo es: $" + saldo);
            movimientoPago = saldo;
        } else {
            System.out.print("Parece que no cuenta con el Saldo suficiente");
        }

        return saldo;
    }

    public static int ingreso(int saldo) {
        int movimientoPago;
        Scanner miTeclado = new Scanner(System.in);
        System.out.println("Por favor indique el monto a ingresar y posteriormente transfiera a este CBU concordia.nuevo.banco o Ingrese el efectivo");
        movimientoPago = miTeclado.nextInt();
        saldo += movimientoPago;
        System.out.println("Ingreso " + movimientoPago + " Su saldo total es: $" + saldo);
        movimientoPago = saldo;


    return saldo;

   }
}
/**
 * @quinterosjp
 * Java: OracleJDK version 17.0.8
 * Trabajo Practico Final para Codo a Codo 4.0 "Programación Inicial"
 */