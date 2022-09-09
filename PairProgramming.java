import java.util.Scanner;
public class PairProgramming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choices ::: \n 1 : Armstrong numbers \n 2 : Factors of a number ");
            int n = input.nextInt();
            if(n==1){
                System.out.println("Enter number for checking Armstrong : ");
                int num = input.nextInt();
                System.out.println(armstrong(num));
            } else if (n==2) {
             System.out.println("Enter number for finding factors : ");
                int a = input.nextInt();
                factors(a);   
            }else{
                System.out.println("Invalid Input");
            }

    }

    static boolean armstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp!=0){
            int rem = temp%10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    

  static void factors(int a){
        for(int i = 1;i<=a/2;i++){
            if(a%i==0){
                System.out.print(i + ", ");
            }
        }
    } 

}

