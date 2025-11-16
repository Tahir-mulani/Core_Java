/*
		   1
		1     1
      1			1
    1			  1
  1   2    3    4   1
 */
 public class PatternAPP {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {              // <-- loop 1 (rows)
            // print leading spaces without an extra loop (Java 11+)
            System.out.print(" ".repeat(rows - i));

            for (int j = 0; j <= i; j++) {            // <-- loop 2 (columns)
                // first or last value in the row => print 1
                if (j == 0 || j == i) {
                    System.out.print("1 ");
                }
                // if this is the last row, print the sequence 2,3,4,... in the middle
                else if (i == rows - 1) {
                    System.out.print((j + 1) + " ");
                }
                // otherwise hollow: print spaces to keep alignment
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }+

}
