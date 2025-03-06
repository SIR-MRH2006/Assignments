//==================== 2)use number(main way)======================//

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int userNumber = scanner.nextInt();
        
        // find count of user number
        int userNumber2 = userNumber;
        int count = 0;
        while(userNumber2 != 0){    
            count++;
            userNumber2 = userNumber2/10;
        }
        
        double end;
        int sum = 0;
        userNumber2 = userNumber;
        while(count != 0) {
            end = (userNumber2%10)*(Math.pow(10, (count-1)));
            sum += end;
            count--;
            userNumber2 = userNumber2/10;
        }

        if(sum == userNumber){
            System.out.println("its a pal number");
        }else{
            System.out.println("it isnt a pal number");
        }

        scanner.close();
    }
}




// ==================== 1)use String ======================//
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("please enter a number : ");
//         String userNumber = scanner.next();
//         int len = userNumber.length();
//         boolean ispal = true;
//         for(int i = 0;i<(len/2);i++){
//             if(userNumber.charAt(i) != userNumber.charAt(len-i-1)){
//                 ispal = false;
//             }
//         }
//         if(ispal == true){
//             System.out.println("its a pal number");
//         }else{
//             System.out.println("its not a pal number");
//         }
//         scanner.close();
//     }
// }






