// if number is even then divide it by 2 and if the number is odd then subtract the number by 1 . Find the no. of steps upto which numbers becomes 0.

public class Steps {
    public static void main(String[] args) {
        System.out.println(count(14));
    }
    static int count(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return helper(n/2,s+1);
        }
        return helper(n-1,s+1);
    }
    
}
