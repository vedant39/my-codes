public class logical
{
    public static void main (String[] args)
    {
        int num1 = 2;
        int num2 = 4;
        
        boolean sum = num1 > num2 ;

        System.out.println (!sum);
        
        int a = 10;
        int b = 20;
        int c = 40;
        int d = 50;

        boolean result = a < b && c < d ;
        System.out.println(result); // true because both conditions are satisfied

        int p = 15;
        int q = 25;
        int r = 45;
        int s = 55;

        boolean answer = p < q || r > s ; 
        System.out.println(answer);// false, only one condition is not met



    }
}