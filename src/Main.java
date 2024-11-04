//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("----print Shape with initial value---");
        Shape shape1=new Shape();
        System.out.println(shape1.toString());
        System.out.println("----print Shape second con---");
        Shape shape2=new Shape("blue",false);
        System.out.println(shape2.toString());

        System.out.println("**************************");

        System.out.println("----print Circle with initial value---");
        Shape Circle1=new Circle();
        System.out.println(Circle1.toString());
        System.out.println("----print Circle second con---");
        Circle Circle2=new Circle(22,"Black",true);
        System.out.println(Circle2.toString());
        System.out.println("Get radius:"+Circle2.getRadius());
        System.out.println("Get Circle2 Area:"+Circle2.getArea());
        System.out.println("Get Circle2 Perimeter:"+Circle2.getPerimeter());

        System.out.println("**************************");
        System.out.println("----print Rectangle with initial value---");
        Rectangle Rectangle1=new Rectangle();
        System.out.println(Rectangle1.toString());
        System.out.println("----print Rectangle second con---");
        Rectangle Rectangle2=new Rectangle(20,30,"pink",true);
        System.out.println(Rectangle2.toString());
        System.out.println("Get Length: "+Rectangle2.getLength() +" ,Get width: "+Rectangle2.getWidth());
        System.out.println("Get Rectangle2 Area:"+Rectangle2.getArea());
        System.out.println("Get Rectangle2 Perimeter:"+Rectangle2.getPerimeter());

        System.out.println("**************************");
        System.out.println("----print Square with initial value---");
        Square Square1=new Square();
        System.out.println(Square1.toString());
        System.out.println("----print Square second con---");
        Square Square2=new Square(20);
        System.out.println(Square2.toString());
        Square2.setSide(5);
        System.out.println("Get side after seting side 5: "+Square2.getSide());







    }
}