class Rectangle extends Shape {

    public double width =1.0;
    public double length=1.0;
    public double area;
    public double Perimeter;



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }
    public String toString (){
        return String.format("%d %s ",getColor(), getFilled(),"%a %x ",getWidth(),getLength());
    }
     Rectangle() {

    }
    Rectangle(double width,double length){

    }
    Rectangle(double width, double length,String color,Boolean filled){
        this.setWidth(width);
        this.setLength(length);
        this.setColor(color);
        this.setFilled(filled);
    }

}
