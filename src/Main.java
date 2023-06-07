import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên dương:");
        int primeNumber = sc.nextInt();
        if (primeNumber<2){
            System.out.println(primeNumber+"  không phải là một số nguyên tố");
        }else {
            int i =2;
            boolean check =true;
            while (i <=Math.sqrt(primeNumber)){
                if (primeNumber%i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(primeNumber+" là số nguyên tố");
            }else {
                System.out.println(primeNumber+" không phải là số nguyên tố");
                main(args);
            }
        }
    }
}