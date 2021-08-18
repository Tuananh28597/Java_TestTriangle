package com.codegym;

public class TriangleClassifier {

    public static String getTypeTriangle(int a, int b, int c) {
        boolean triangle = (a + b > c) && (a + c > b) && (b + c > a) ? true : false;
        // equilateral triangle : tam giac deu
        boolean equilateralTriangle = (a == b) && (b == c) ? true : false;
        // isosceles triangle : tam giac can
        boolean isoscelesTriangle = (a == b) || (b == c) || (a == c) ? true : false;
        if (triangle) {
            if (equilateralTriangle) {
                return "tam giác đều";
            } else
                if (isoscelesTriangle) {
                return "tam giác cân";
            }
            return "tam giác thường";
        }
        return "không phải tam giác";
    }
}
