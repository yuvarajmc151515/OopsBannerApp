package Bridgelabz.OopsBannerApp;


public class UseCaseTwo {

    public static void main(String[] args) {

        int height = 7;
        int width = 7;

        for (int row = 0; row < height; row++) {

            // ---------- O ----------
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // ---------- O ----------
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // ---------- P ----------
            for (int col = 0; col < width; col++) {
                if (col == 0 ||
                        (row == 0 && col < width - 1) ||
                        (row == height / 2 && col < width - 1) ||
                        (col == width - 1 && row > 0 && row < height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // ---------- S ----------
            for (int col = 0; col < width; col++) {
                if (row == 0 ||
                        row == height / 2 ||
                        row == height - 1 ||
                        (col == 0 && row < height / 2) ||
                        (col == width - 1 && row > height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}

