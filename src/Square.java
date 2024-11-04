public class Square extends Rectangle{

    Square(){

    }

    Square(double side){
     super(side,side);
    }

    Square(double side,String color,boolean filled) {
        super( side, side,color, filled);
    }

    public String toString(){
        String s;
        s="A Square with side= "+super.getWidth()+" which is a subclass of "+super.toString();
        return s;
    }


    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide() {
        return super.getWidth();
    }

}
