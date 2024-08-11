import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, purchase;
        double dis=0, netamt=0.0;
        System.out.println("Enter purchase Amount ");
        purchase = sc.nextInt();
        System.out.println("Enter 1 for Mill Cloth and 2 for Handloom Cloth ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
            if(purchase >= 1 && purchase <= 100)
                netamt = purchase;

            else if(purchase >= 101 && purchase <= 200)
            {
                dis = (5.0 /100 ) * purchase;
                netamt = purchase - dis;
            }

            else if(purchase >= 210 && purchase <= 300)
            {
                dis = (7.5 /100 ) * purchase;
                netamt = purchase - dis;
            }

            else if(purchase > 300)
            {
                dis = (10.0 /100 ) * purchase;
                netamt = purchase - dis;
            }
        }
        break;
        case 2:
        {
            if(purchase >= 1 && purchase <= 100)
            {
                dis = (5 /100 ) * purchase;
                netamt = purchase - dis;
            }

            else if(purchase >= 101 && purchase <= 200)
            {
                dis = (7.5 /100 ) * purchase;
                netamt = purchase - dis;
            }

            else if(purchase >= 210 && purchase <= 300)
            {
                dis = (10 /100 ) * purchase;
                netamt = purchase - dis;
            }

            else if(purchase > 300)
            {
                dis = (15.0 /100 ) * purchase;
                netamt = purchase - dis;
            }
        }
        break;
        default:
        System.out.println("Wrong Choice ");
        }
        System.out.println("Net Amount to be paid by the coustomer is: " + netamt);
        sc.close();
    }
    
}
