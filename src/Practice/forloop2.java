package Practice;

public class forloop2 {
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i++)
//        if(i%2==0){                     //divisible by 2
//            System.out.println(i);
        {
            if (i % 3 == 0)                    //Divisible by 3
            {
                System.out.println(i);
            }
        }

    }
}
