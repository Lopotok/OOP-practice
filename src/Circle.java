public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }
    public Circle(double r) {
        radius = r;
        color = "Red";
    }
    public Circle ( double radius, String color){
            this.radius=radius;
            this.color=color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setRadius (double newRadius){
       radius=newRadius;}
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";

    }
}
