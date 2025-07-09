// Given three sides of a triangle A, B and C in the form of integers. Find the area of the triangle.
// Note: The triangle may not exist. In such cases, the area is 0.

package P02_Mathematics;

public class BasicsProgram6 {
    double findArea(int A, int B, int C) {
        // code here
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double S = (double) (A + B + C) / 2.0;
            double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
            return area;
        } else {
            return 0.0;
        }
    }
}
