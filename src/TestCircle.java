public class TestCircle {
    /**
     * A Test Driver for the Circle class
     */
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        //The circle has radius of 2.0 and area of 12.566370614359172

        //TODO Modify the test program TestCircle to construct an instance of Circle using this constructor.

        c1.setColor("Green");
        Circle c3 = new Circle(5,"Green");
        System.out.println(" The circel has radius of " + c3.getRadius() + " and the color of Circle is" + c3.getColor());

        //TODO public VS private
        // Try it out and explain the error messages.
        // c1.radius=5.0;
        // System.out.println(c1.radius);

        //MAGYARÁZAT: A radius a circle objektumbe private, a TestCircle nem látja.


    }

}

