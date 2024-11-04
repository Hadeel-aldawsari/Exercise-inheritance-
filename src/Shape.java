public class Shape {
    private String color;
    private boolean filled;

    Shape(){
    this.color="green";
    this.filled=true;
    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    //set
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    //get

    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }


public String toString(){
        String s;
        String failed_s="";
        if(this.isFilled())failed_s="failed";
        else failed_s="Not failed";
        s="A Shape with color of "+this.color+" and "+failed_s;
   return s;
}

}


