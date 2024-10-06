import java.util.*;

//finding gcd/hcf and lcm

//method 1
public class FindingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int HCF= find(num1,num2);
        System.out.println(HCF);
        System.out.println(findLCM(num1,num2));
    }
    static int findLCM(int a ,int b){
        int HCF= find(a, b);
        int LCM = (a*b)/HCF;
        return LCM;
    }
    static int find(int a , int b){
        if(a==b){
            return a;
        }
        if(a>b){
            return find(a-b,b);
        }
        return find(a,b-a);
    }

    

}
