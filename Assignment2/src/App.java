import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number to checking is that a pefect number : ");
        int userNumber = scanner.nextInt();
        int sum = 0;
        for(int i = 1;i<userNumber;i++){
            if(userNumber % i == 0){
                sum += i;
            }
        }
        if(sum == userNumber){
            System.out.println(userNumber+" its a perfect number");
        }else{
            System.out.println("its not a perfect number");
        }
    }
}
