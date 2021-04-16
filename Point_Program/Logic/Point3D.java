package Point_Program.Logic;

public class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }


    public void increaseZ(double z){
        if(z<0){
            z*=-1;
        }
        this.z += z;
    }

    public void decreaseZ(double z){
        if(z<0){
            z*=-1;
        }
        this.z -= z;
    }

    public double distanceOtherPoint3D(Point3D p2) {
        return Math.sqrt(Math.pow((p2.getX()-this.getX()),2)+(Math.pow((p2.getY()-this.getY()),2))+(Math.pow((p2.z-this.z),2)));
    }

    public double distanceOrigin3D() {
        return Math.sqrt(Math.pow(this.getX(),2)+(Math.pow(-this.getY(),2))+(Math.pow(this.z,2)));
    }


    public void showPoint3D() {
        System.out.println("La coordenada actual del punto es: "+this.toString());
    }

    @Override
    public String toString() {
        return "["+this.getX()+","+this.getY()+","+z+"]";
    }
}
