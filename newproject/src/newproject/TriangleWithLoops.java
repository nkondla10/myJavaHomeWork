package newproject;

public class TriangleWithLoops {
    public static void main(String args[]) {
        drawPyramidPattern();
    }
    public static void drawPyramidPattern() {
        for (int i = 0; i < 14; i++)
        {
            for (int j = 0; j < 14 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (i%2 == 0) {
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
    }
}