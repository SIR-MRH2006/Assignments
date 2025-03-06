
import java.util.Scanner;

public class App {
    //################################<MAIN>############################//
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  // 
        System.out.println("please enter your number : ");
        String nums = scanner.nextLine();
        scanner.close();

        String res = "";
        switch (nums){
            case "11":
                res = "yazdah";
                break;
            case "12":
                res = "davazdah";
                break;
            case "13":
                res = "sizdah";
                break;
            case "14":
                res = "chahardah";
                break;
            case "15":
                res = "ponzdah";
                break;
            case "16":
                res = "shonzdah";
                break;
            case "17":
                res = "hefdah";
                break;
            case "18":
                res = "hejdaah";
                break;
            case "19":
                res = "nozdah";
                break;
            default:
                res = "";
                break;
        }

        String res1 = "";
        String res2 = "";
        String res3 = "";

        if(res.equals("")){
            String nums_p = nums;
            while (!nums_p.equals("")) {
                switch (nums_p.length()) {
                    // SADGHAN
                    case 3:
                        String sad = nums_p.substring(0, 1);
                        switch (sad) {
                            case "1":
                                res1 = "sad";
                                break;
                            case "2":
                                res1 = "divist";   
                                break;
                            case "3":
                                res1 = "sisad";
                                break;
                            case "4":
                                res1 = "chaharsad";
                                break;
                            case "5":
                                res1 = "ponsad";
                                break;
                            case "6":
                                res1 = "shishsad";
                                break;
                            case "7":
                                res1 = "haftsad";
                                break;
                            case "8":
                                res1 = "hashtsad";
                                break;
                            case "9":
                                res1 = "nohsad";
                                break;
                        }
                        nums_p = nums_p.substring(1);
                        break;
    
                    // DAHGAN   
                    case 2:
                        String dah = nums_p.substring(0, 1);
                        if (!dah.equals("0")) {
                            switch (dah) {
                                case "1":
                                    res2 = "dah";  //         
                                    break;
                                case "2":
                                    res2 = "bist";
                                    break;
                                case "3":
                                    res2 = "si";
                                    break;
                                case "4":
                                    res2 = "chehel";
                                    break;
                                case "5":
                                    res2 = "panjah";
                                    break;
                                case "6":
                                    res2 = "shast";
                                    break;
                                case "7":
                                    res2 = "haftad";
                                    break;
                                case "8":
                                    res2 = "hashtad";
                                    break;
                                case "9":
                                    res2 = "navad";
                                    break;
                            }
                        }
                        nums_p = nums_p.substring(1);
                        break;
                    case 1:
                        String yek = nums_p.substring(0, 1);
                        if (!yek.equals("0")) {
                            switch (yek) {
                                case "1":
                                    res3 = "yek";     
                                    break;
                                case "2":
                                    res3 = "do";
                                    break;
                                case "3":
                                    res3 = "se ";
                                    break;
                                case "4":
                                    res3 = "chahar";
                                    break;
                                case "5":
                                    res3 = "pang";
                                    break;
                                case "6":
                                    res3 = "shish";
                                    break;
                                case "7":
                                    res3 = "haft";
                                    break;
                                case "8":
                                    res3 = "hasht";
                                    break;
                                case "9":
                                    res3 = "noh";
                                    break;
                                }
                                nums_p = nums_p.substring(1);
                        } else {
                            nums_p = "";
                        }
                        break;
                    default:
                        System.out.println("please enter a valid number");
                        break;
                }
            }


            if(!res1.equals("") && !res2.equals("") && !res3.equals("")){
                System.out.println(res1+" o "+res2+" o "+res3);
            }else if(!res2.equals("") && !res3.equals("")){
                System.out.println(res2+" o "+res3);
            }else if(!res1.equals("") && !res3.equals("")){
                System.out.println(res1 + " o " + res3);
            }else if(!res3.equals("")){
                System.out.println(res3);
            }else if(!res1.equals("") && !res2.equals("")){
                System.out.println(res1 + " o " + res2);
            }else if(!res1.equals("")){
                System.out.println(res1);
            }else if(!res2.equals("")){
                System.out.println(res2);
            }


        }else{
            System.out.println(res);
        }
    }
}