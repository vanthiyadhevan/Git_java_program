import java.util.Scanner;
public class Infitie_Tables {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 1;
        while(true) {
            int i = 1;
            for(i = 1;i<=10;i++) {
                System.out.println(i + "x" + num + " = " + (i * num));
            }
            System.out.println("Do You Want Exit In This Program Press 0 exit:");
            int choice = scan.nextInt();
            if(choice == 0) {
                System.out.println("Exit the Progeram");
                break;
            }
            else {
                num++;
            }
        }

    }
}