

 class Circle extends Shape {
    public double radius =1.0;
    public double area;

    public double perimeter;

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     @Override
     public double getArea() {
         return area;
     }

     public void setArea(double area) {
         this.area = area;
     }

     @Override
     public double getPerimeter() {
         return perimeter;
     }

     public void setPerimeter(double perimeter) {
         this.perimeter = perimeter;
     }
     public String toString (){
         return String.format("%d %d %d",
                 this.getColor(),
                 this.getFilled(),
                 this.getRadius());
     }
     Circle(){

     }
     Circle(double radius){
         this.setRadius(radius);

     }
     Circle(double radius, String color, boolean filled){
         this.setRadius(radius);
         this.setColor(color);
         this.setFilled(filled);
     }
 }