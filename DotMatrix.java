public class DotMatrix {

    public static int[][] createDotMatrix(String s1, String s2) {

    	int[][] matrix = new int[s1.length()][s2.length()];

        // Fill in the matrix based on sequence alignment
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }

    public static int calculateTotal(int[][] matrix) {
        int total = 0;
        
        // Calculate the total matches
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                total += matrix[i][j];
            }
        }

        return total;
    }

    public static void printMatrix(int[][] matrix) {
        // Print the dot matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s1 = "GCCATGC";
        String s2 = "GCATAC";

        int[][] dotMatrix = createDotMatrix(s1, s2);
        int totalMatches = calculateTotal(dotMatrix);

        // Print the dot matrix
        printMatrix(dotMatrix);

        // Print the total matches
        System.out.println("\nTotal Matches: " + totalMatches);
    }
}

