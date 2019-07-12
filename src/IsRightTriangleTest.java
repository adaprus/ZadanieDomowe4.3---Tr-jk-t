public class IsRightTriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,6,4);

        IsRightTriangle isRight = new IsRightTriangle();

        boolean iSTri = isRight.isRightTriangle(triangle);

        System.out.println("Czy trójkąt jest prostokątny? " + iSTri);
    }
}
