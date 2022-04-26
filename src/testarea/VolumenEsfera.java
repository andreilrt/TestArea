package testarea;

public class VolumenEsfera {

    public double CalcularVolumen() {
        double Volumen = 0;
        Circulo ObjRadio = new Circulo();
        ObjRadio.PedirRadio();
        Volumen = (4* (Math.PI * Math.pow(ObjRadio.getRadio(),(3)))/3);
        return Volumen;
    }
}
