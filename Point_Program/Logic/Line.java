package Point_Program.Logic;

public class Line {
    private Point initPoint;
    private Point endPoint;

    public Line(Point initPoint, Point endPoint) {
        this.initPoint = initPoint;
        this.endPoint = endPoint;
    }

    public void upLine(double distance){
        initPoint.up(distance);
        endPoint.up(distance);
    }

    public void downLine(double distance){
        initPoint.down(distance);
        endPoint.down(distance);
    }

    public void leftLine(double distance){
        initPoint.left(distance);
        endPoint.left(distance);
    }

    public void rightLine(double distance){
        initPoint.right(distance);
        endPoint.right(distance);
    }

    public double lineLength(){
        return initPoint.distanceOtherPoint(endPoint);
    }

    public Point getInitPoint() {
        return initPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Inicio: "+initPoint+" Final: "+endPoint;
    }
}
