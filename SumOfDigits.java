public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(4356);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n%10==n){
            return n;
        }
        return sum(n/10)+n%10;
    }
    
}
