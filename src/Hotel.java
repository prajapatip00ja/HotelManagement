import java.util.ArrayList;
import java.util.List;

public class Hotel implements Comparable<Hotel>{
    private String name;
    private int rating;
    private DaysRate daysRate;

    public Hotel(String name, int rating,DaysRate daysRate) {
        this.name = name;
        this.rating = rating;
        this.daysRate = daysRate;
    }

    public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getRate(String customerType, String[] days) {
        List rates = new ArrayList();
        for (String day : days) {
            rates.add(daysRate.getRate(day,customerType));
        }
        return getMinRate(rates);
    }

    private int getMinRate(List<Integer> rates){
        int min = rates.get(0);
        for (int rate : rates) {
            if(min>rate)
                min = rate;
        }
        return min;
    }


    @Override
    public int compareTo(Hotel hotel) {
        if(this.rating == hotel.rating)
        return 0;
        else
        return this.rating > hotel.rating ? -1 : 1;

    }
}
