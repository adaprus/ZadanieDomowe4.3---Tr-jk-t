public class IsRightTriangle {

    Triangle triangle;

    boolean isRightTriangle(Triangle triangle) {

         boolean isRight = ((triangle.sideA * triangle.sideA + triangle.sideB * triangle.sideB == triangle.sideC * triangle.sideC)||
                 (triangle.sideA * triangle.sideA + triangle.sideC * triangle.sideC == triangle.sideB * triangle.sideB) ||
                 (triangle.sideB * triangle.sideB + triangle.sideC * triangle.sideC == triangle.sideA * triangle.sideA));

        return isRight;
    }
}
