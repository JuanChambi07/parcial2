

 class Circle extends Shape {
    public double radius ;
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
         return String.format("%s %s %s %b %s %f %s" ,"Circle[Shape[color=",this.getColor(),"filled=",this.getFilled(),"]radius=", this.getRadius(),"]");


     }
     Circle(){
    setRadius(1.0);
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