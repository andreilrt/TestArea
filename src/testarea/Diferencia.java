package testarea;

import java.util.Scanner;

public class Diferencia {

    private Scanner Input;
    private Cuadrado ObjCuadrado;
    private Circulo ObjCirculo;

    public Diferencia() {
        Input = new Scanner(System.in);
        ObjCirculo = new Circulo();
        ObjCuadrado = new Cuadrado();
    }

    public boolean ValidarArea(double AreaCirculo, double AreaCuadrado) {
        boolean Control = true;
        Control = AreaCuadrado < AreaCirculo ? true : false;
        if (Control == true) {
            System.out.println("\nEl area de su circulo es mayor al area de su cuadrado");
            System.out.println("Ingrese los valores de sus figuras nuevamente\n\n");
        }
        return Control;
    }

    public double DiferenciaArea(double AreaCirculo, double AreaCuadrado) {
        return AreaCuadrado - AreaCirculo;
    }

    public double AreaSombreada() {
        double AreaCirculo = 0;
        double AreaCuadrado = 0;
        boolean Control = true;
        while (Control) {
            AreaCirculo = ObjCirculo.AreaCirculo();
            AreaCuadrado = ObjCuadrado.AreaCuadrado();
            Control = ValidarArea(AreaCirculo, AreaCuadrado);
        }
        return DiferenciaArea(AreaCirculo, AreaCuadrado);
    }
}
