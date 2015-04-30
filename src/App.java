import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by poojap on 26/04/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("enter your type and name--");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String customerType = input.split(":")[0];
        String[] days   = input.split(":")[1].split(",");
        List<Hotel> hotelChain = new ArrayList<Hotel>();
        hotelChain.add(new Hotel("LakeWood",3,new DaysRate(110,90,80,80)));
        hotelChain.add(new Hotel("BrideWood",4,new DaysRate(160,60,110,50)));
        hotelChain.add(new Hotel("RidgeWood",5,new DaysRate(220,150,100,40)));
        List<Integer> rates = new ArrayList<Integer>();
        for (Hotel hotel : hotelChain) {
            System.out.println(hotel.getRate(customerType, days));
        }
    }
}
