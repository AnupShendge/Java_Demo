package Variables;

public class LoopVariables1 {
	public static void main(String args[])
    {
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
 
        // Will produce error
        //System.out.println(x);
    }
}
//Above program after correcting the error
/*class Test
{
 public static void main(String args[])
 {
     int x;
     for (x = 0; x < 4; x++)
     {
         System.out.println(x);
     }

    System.out.println(x);
 }
}*/