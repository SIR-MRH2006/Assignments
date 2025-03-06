import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number for print a leaf(odd number):");
        int userNumber = scanner.nextInt();
        int t = 1;
        int m = (userNumber-1)/2;
        for(int i=0;i<(userNumber+1)/2;i++){
            boolean isExistSpace = false;
            for(int j=m ; j>0 ; j--){
                System.out.print(" ");
                isExistSpace = true;
            }
            for(int k=t ; k>0 ; k--){
                System.out.print("*");
            }
            // Bleow Code can be or not
            // if(isExistSpace == true){
            //     for(int j=m ; j>0 ; j--){
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
            t += 2;
            m -= 1;
        }
        for(int n = 0;n<3;n++){
            for(int n1 = (userNumber-1)/2;n1>0;n1--){
                System.out.print(" ");
            }
            for(int n2 = 1;n2>0;n2--){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
