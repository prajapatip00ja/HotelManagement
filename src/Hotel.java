import java.util.ArrayList;
import java.util.List;

public class Hotel implements Comparable<Hotel>{
    private String name;
    private int rating;
    private WeekDaysRate weekDaysRate;
    private WeekendRate weekendRate;

    public Hotel(String name, int rating, WeekDaysRate weekDaysRate,WeekendRate weekendRate) {
        this.name = name;
        this.rating = rating;
        this.weekDaysRate = weekDaysRate;
        this.weekendRate = weekendRate;
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
            if(weekDaysRate.has(day))
                rates.add(weekDaysRate.getRate(day, customerType));
            else
                rates.add(weekendRate.getRate(day,customerType));
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
