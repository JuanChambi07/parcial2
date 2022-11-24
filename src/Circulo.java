import java.awt.Shape;

public class Circulo {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    Circulo(Double radio){
        setRadio(radio);

    }
    public String toString (){
        return String.format("%d %d",Shape(getColor(), getFilled()),getRadio());
    }




}