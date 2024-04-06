public class threeDarey
{
    public static void main(String[] args) 
    {

        int nums [] [] [] [] = new int[5][7][9][10];
        

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println("i = " +i); 
            for(int j=0 ; j < 7 ; j++)
            {
                System.out.println("  j = " + j); 
                for (int k=0 ; k < 9 ; k++ ) 
                {
                    System.out.print("    "); 
                    for(int l=0 ; l < 10 ; l++)
                    {
                        nums [i][j][k][l] = (int)(Math.random() * 10 );
                        System.out.print(nums [i][j][k][l]+" ");
                    }  
                    System.out.println(); 
                }
                System.out.println();
            }
            System.out.println();
        }
 
System.out.println("------------------------------------------------------------------------------------------------");

// enhanced for loop 
        for (int a[][][] : nums)
        {
            for (int b[][] : a)
            {
                for (int c []: b )
                {
                    System.out.println("    ");
                    for ( int d : c )
                    {
                        System.out.print( "       "+d + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
 
    }

}
