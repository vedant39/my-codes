public class arey
{
    public static void main (String[] args)
    {
        int ar1[] = { 2 , 5 , 8 , 3 };
          // index no 0^,1^ ,2^ ,3^

        ar1[3] = 11;
        System.out.println(ar1[3]);

        System.out.println("--------------------");

        int ar2[] = new int[4];
        ar2[0] = 3;
        ar2[1] = 6;
        ar2[2] = 9;
        ar2[3] = 12;

        for ( int i = 0 ; i <= 3 ; i ++)
        {
            System.out.println(ar2[i]);
        }

    }
}
