public class Circle extends Shape{
    private double radius;

    Circle(){
this.radius=10;
    }

    Circle(double radius){
        this.radius=radius;
    }

    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
     return (3.14*(this.radius*this.radius));
    }

    public double getPerimeter(){
        return ((3.14*2)*this.radius);
    }


    public String toString(){
        String s;
        s="A Circle with radius="+this.radius+" which is a subclass of "+super.toString();
        return s;
    }
}
