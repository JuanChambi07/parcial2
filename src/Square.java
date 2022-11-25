public class Square extends Rectangle {
private double side;


//private Rectagle width; no sabia si habia que usar eso pero creop que no poruqe ne el ejercicio lo indica como setwidth con el side
//private Rectagle length;
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }
    public String toString (){
        return String.format("%d %s ",getColor(), getFilled(),"%a %x ",getWidth(),getLength());
    }
    Square(){

    }
    Square(double side){

        this.setSide(side);
    }
    Square(double side , String color,boolean filled){

        this.setSide(side);
        this.setColor(color);
        this.setFilled(filled);
    }
}
