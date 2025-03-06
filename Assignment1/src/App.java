public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 2;i<=100;i++){
            boolean isPrime = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println(i+":its a prime number");
            }
        }
    }
}
