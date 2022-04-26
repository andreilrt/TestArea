package testarea;

import java.util.Scanner;

public class Cuadrado {

    private Scanner Input;
    
    public Cuadrado(){
        Input = new Scanner(System.in);
    }

    public double AreaCuadrado() {
        double Lado = 0;
        double Lado1 = 0;
        double ACuadrado = 0;
        while (Lado <= 0 && Lado1 <= 0) {
            System.out.print("Por favor ingrese su valor de alto en cm: ");
            Lado = Input.nextDouble();
            System.out.print("Por favor ingrese su valor de ancho en cm: ");
            Lado1 = Input.nextDouble();
        }
        ACuadrado = Lado * Lado1;
        return ACuadrado;
    }

}
