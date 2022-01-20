import java.util.Scanner;

public class food {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String veg = "V";
        String non = "N";
        System.out.println("Place your order ");
        System.out.println("Enter  for VEGETARIAN_COMBO and N for NON-VEGETARIAN_COMBO");
        String orderType = sc.nextLine(); // enter oder type veg or non veg
        if (orderType.equals(veg)) {
            System.out.println("You choose VEGETARIAN_COMBO");
            System.out.println("Enter the quantiy of plates: 1 plate price is Rs.120");
            int quantity = sc.nextInt();   // how many plate you wants to order
            if (quantity >= 1) {
                System.out.println("you order is for :" + quantity + " plate");
                System.out.println("enter your distance");
                System.out.println("For 1st 3 km is Rs.0 delivery charges");
                System.out.println("For next 3 km is Rs.3 delivery charges");
                System.out.println("For next km is 6 Rs.delivery charges");
                int distance = sc.nextInt();  // distance of your place in km
                if (distance >= 3) {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + 120 * quantity + " only");
                } else if (distance >= 4 && distance <= 6) {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + (120 * quantity + 3) + " only");
                } else {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + (120 * quantity + 6) + " only");
                }
            } else {
                System.out.println("sorry, you have to select at least one plate");
            }

        } else if (orderType.equals(non))
        {
            System.out.println("You choose NON_VEGETARIAN_COMBO");
            System.out.println("Enter the quantiy of plates: 1 plate price is Rs.150");
            int quantity = sc.nextInt();
            if (quantity >= 1) {
                System.out.println("you order is for :" + quantity + " plate");
                System.out.println("enter your distance");
                System.out.println("For 1st 3 km is Rs.0 delivery charges");
                System.out.println("For next 3 km is Rs.3 delivery charges");
                System.out.println("For next km is 6 Rs.delivery charges");
                int distance = sc.nextInt();
                if (distance >= 3) {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + 150 * quantity + " only");
                } else if (distance >= 4 && distance <= 6) {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + (150 * quantity + 3) + " only");
                } else {
                    System.out.println("YOUR ORDER IS PLACED");
                    System.out.println("your Total bill Amount=Rs." + (150 * quantity + 6) + " only");
                }
            } else {
                System.out.println("sorry, you have to select at least one plate");
            }

        }
        else
        {
            System.out.println("You press worng key. Please check your key again");
        }


    }


}
