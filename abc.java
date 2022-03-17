import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class rail 
{
    static int p = 1000;

    int available_seat () throws IOException
    {
        System.out.println("Enter the number of seat you required");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        p=p-n;
        System.out.println("Your "+n+" Seat has been booked");
        return p;
    }
}
class abc
{
    public static void main(String[] args) throws IOException{
        rail ob = new rail();
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("*****//Railway Booking System//*****");
            System.out.println("          By Vivek Raj ");
            System.out.println(" 1) Check Seat Available");
            System.out.println(" 2) Book Seat");
            System.out.println(" 3) Exit");
            

            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                   System.out.println("The available seat is "+ob.p);
                    break;

                case 2:
                    ob.available_seat();
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }

    }
}