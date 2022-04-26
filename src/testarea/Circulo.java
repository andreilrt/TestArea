package testarea;

import java.util.Scanner;

public class Circulo {

    private Scanner Input;
    private double Radio;

    public Circulo() {
        Input = new Scanner(System.in);
        Radio = 0;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public void PedirRadio(){
        while (Radio <= 0) {
            System.out.print("Por favor ingrese su valor de Radio en cm: ");
           this.setRadio(Input.nextDouble()); 
        }
    }
    
    public double AreaCirculo() {
        double ACirculo = 0;
        PedirRadio();
        ACirculo = (Math.PI * Math.pow(Radio, 2));
        return ACirculo;
    }
}
