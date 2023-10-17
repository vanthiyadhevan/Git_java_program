/* Java Number Pattern Program 
    12345
    12345
    12345
    12345
    12345
 */
public class for_loop {
    public static void main(String args) {
        //Outer loop 
        for(int i = 1; i <= 5; i++) {
            //inner loop
            for(int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}