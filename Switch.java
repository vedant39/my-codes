public class Switch
{
    public static void main (String [] args)
    {
        int n = 6;

        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // code block to be executed if the value of expression doesn't match any label in this statement
                System.out.println("Enter a valid value");
            
        }
    }
} 