public class Patternpros_in_object {
    public static void main(String[] args) {
        Patterns pat = new Patterns();
        pat.numIncrPyramid(5);
    }
}
class Patterns {
    int n;

    public void numIncrPyramid(int n) {
        /* Number-increasing Pyramid Pattern
            1 
            1 2 
            1 2 3 
            1 2 3 4 
            1 2 3 4 5 
         */
        for(int i = 1; i <= n; i++ ) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
