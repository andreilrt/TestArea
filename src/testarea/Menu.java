package testarea;

import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    private Circulo ObjCirculo;
    private Cuadrado ObjCuadrado;
    private Diferencia ObjDiferencia;
    private Scanner Input;
    private VolumenEsfera ObjEsfera;

    public Menu() {
        ObjCirculo = new Circulo();
        ObjCuadrado = new Cuadrado();
        ObjDiferencia = new Diferencia();
        ObjEsfera = new VolumenEsfera();
        Input = new Scanner(System.in);
    }

    public void Opciones() {
        System.out.println("Digite 1 para visualizar el area del circulo o");
        System.out.println("Digite 2 para visualizar el area del cuadrado 👩");
        System.out.println("Digite 3 para visualizar el area sombreada ◘ de las figuras");
        System.out.println("Digite 4 para visualizar el volumen de una esfera o");
        System.out.println("Digite 5 para salir");
        int Opc = 0;
        Opc = Input.nextInt();
        while (Opc <= 0 || Opc > 5) {
            System.out.println("Digite una opcion valida");
            Opc = Input.nextInt();
        }
        if (Opc == 1) {
            System.out.println("El area de su circulo o es " + ObjCirculo.AreaCirculo() + " cm^2");
        }
        if (Opc == 2) {
            System.out.println("El area de su rectangulo 👩 es " + ObjCuadrado.AreaCuadrado() + " cm^2");
        }
        if (Opc == 3) {
            System.out.println("El area sombreada de sus figuras ◘ es " + ObjDiferencia.AreaSombreada() + " cm^2");
        }
        if (Opc == 4) {
            System.out.println("El volumen de su esfera o es: "+ObjEsfera.CalcularVolumen()+" cm^3");
        }
        if(Opc==5){
            System.out.println("El programa ha finalizado");
            exit(0);
        }
    }

    public void Recurrencia() {
        boolean Control = true;
        while (Control) {
            Opciones();
            char Recurrente = ' ';
            System.out.println("Quiere ejecutar nuevamente el programa(S/N)");
            Recurrente = Input.next().charAt(0);
            if (Recurrente == 'S' || Recurrente == 's') {
                Control = true;
            } else {
                Control = false;
            }
        }

    }
}
