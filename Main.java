

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Our store option :");
        System.out.println("Number \t Vehicle Type \tExtra Services \t Accessories ");
        System.out.println("======================================================================");
        System.out.println("1      \tSedan    \t  Waxing     \t  Car cover");
        System.out.println("2        Pickup       Full checkup    Jumper Cable");
        System.out.println("3        Van          None            Floor matt");
        System.out.println("4        Coupe        None            Air Freshner");
        System.out.println("5                                     Light Bulb");
        System.out.println("========================================================================");
        int num, sedan=4, van=7, waxing=50,  checkup=10, vehicle=0, cable=15, bullb=1,matt=7, none=0,light=1;
                double coupe=4.5, cover=25.5, air=1.8, pickup=5.5, tax=0.12, discount=0.03, total=0;
                //vehicle car wash
        System.out.println("Please enter your type of vehicle");
        num=s1.nextInt();
        switch (num)
        {
            case 1:total+=sedan; break;
            case 2:total+=pickup; break;
            case 3:total+=van; break;
            case 4:total+=coupe; break;
        }
        //accessories options
        System.out.println("Please enter your choice of Extra services");
        num=s1.nextInt();
        switch (num)
        {
            case 1:total+=waxing; break;
            case 2:total+=checkup; break;
            case 3:total+=none;
            break;
            }
            //accessories option
            System.out.println("Please enter your choice of the accessories 1,2,3,4,5 or any other value to stop reading accessories");
            num =s1.nextInt();
            while(num > 0 && num <6)
            {
                switch ((num))
                {
                    case 1:total+=cover; break;
                    case 2:total+=cable; break;
                    case 3:total+=matt; break;
                    case 4:total+=air; break;
                    case 5:total+=light; break;
                }
                //print output
                System.out.println("Please enter your choice of the accessories 1,2,3,4,5 or any other value to stop reading accessories");
                num=s1.nextInt();

            }
            total = total + (total * tax);
            System.out.println(total);
            if(total > 45)
                total = total - (total * discount);
            System.out.println("Your total bill after tax and discount is:" + total);

 System.out.println("========================================================================");
            System.out.println("Made by : Nagham,Shahed,Tala");
        }
        }