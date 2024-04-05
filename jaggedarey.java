public class jaggedarey
{
    public static void main(String[] args)
    {
        int nums [][] = new int [3][]; // jagged array

        nums [0] = new int [4];
        nums [1] = new int [5];
        nums [2] = new int [6];

        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                num[j] = (int)(Math.random() *10);
            }
        }

        for (int n[]: nums)
        {
            for (int m : n)
            {
                System.out.print( m + " ");
            }
            System.out.println();
        }
    }
}
