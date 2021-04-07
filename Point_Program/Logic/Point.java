package Point_Program.Logic;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void up(double y){
        if(y<0){
            y*=-1;
        }
        this.y += y;
    }

    public void down(double y){
        if(y<0){
            y*=-1;
        }
        this.y -= y;

    }

    public void right(double x){
        if(x<0){
            x*=-1;
        }
        this.x += x;
    }

    public void left(double x){
        if(x<0){
            x*=-1;
        }
        this.x -= x;
    }

    public double distanceOtherPoint(Point p2){
        return Math.sqrt(Math.pow((p2.x-this.x),2)+(Math.pow((p2.y-this.y),2)));
    }

    public double distanceOrigin(){
        return Math.sqrt(Math.pow(this.x,2)+(Math.pow(this.y,2)));
    }

    public void showPoint(){
        System.out.println("La coordenada actual es: ["+this.x+","+this.y+"]");
    }



    @Override
    public String toString() {
        return "["+this.x+","+this.y+"]";
    }
}
