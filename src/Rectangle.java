public class Rectangle extends Shape{

private double width;
private double length;

    Rectangle(){
        this.width=1;
        this.length=1;
    }

    Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }

    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
    }


    //set
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //get

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
//method
    public double getArea(){
    return width*length;
    }

    public double getPerimeter(){
        return (width*2)+(length*2);
    }



    public String toString(){
        String s;
        s="A Rectangle with width="+this.width+"and length="+this.length+" which is a subclass of "+super.toString();
        return s;
    }
}
