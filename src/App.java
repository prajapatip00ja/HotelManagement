import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("enter your type and name--");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String customerType = input.split(":")[0];
        String[] days   = input.split(":")[1].split(",");
        App app =new App();
       System.out.println(app.getCheapestHotelName(customerType, days));
    }

    private Hotel findCheapestHotel(TreeMap<Hotel, Integer> sortedHotels) {
        List<Hotel> hotels = new ArrayList<Hotel>(sortedHotels.keySet());
        if(hasDuplicates(sortedHotels)){
            Collections.sort(hotels);
        }
        return hotels.get(0);
    }

    public String getCheapestHotelName(String customerType, String[] days) {
        HashMap<Hotel, Integer> hotels = getHotelsWithRates(customerType, days);
        RateComparator rateComparator =  new RateComparator(hotels);
        TreeMap<Hotel,Integer> sortedHotels = new TreeMap<Hotel,Integer>(rateComparator);
        sortedHotels.putAll(hotels);
        return findCheapestHotel(sortedHotels).getName();
    }

    private  HashMap<Hotel, Integer> getHotelsWithRates(String customerType, String[] days) {
        Hotel hotel1 = new Hotel("LakeWood",3,new WeekDaysRate(110,80),new WeekendRate(90,80));
        Hotel hotel2 = new Hotel("BrideWood",4,new WeekDaysRate(160,110),new WeekendRate(60,50));
        Hotel hotel3 = new Hotel("RidgeWood",5,new WeekDaysRate(220,100),new WeekendRate(150,40));
        HashMap<Hotel,Integer> map = new HashMap<Hotel,Integer>();
        map.put(hotel1,hotel1.getRate(customerType,days));
        map.put(hotel2,hotel2.getRate(customerType,days));
        map.put(hotel3,hotel3.getRate(customerType,days));
        return map;
    }

    private  boolean hasDuplicates(Map<Hotel,Integer> datamap){
        Set valueSet=new HashSet(datamap.values());
        if(datamap.values().size()!=valueSet.size())
            return true;
        return false;
    }


    
}
