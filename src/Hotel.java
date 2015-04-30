import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int rating;
    private DaysRate daysRate;

    public Hotel(String name, int rating,DaysRate daysRate) {
        this.name = name;
        this.rating = rating;
        this.daysRate = daysRate;
    }

    public int getRates(String customerType, String[] days) {
        List rates = new ArrayList();
        for (String day : days) {
            System.out.println(daysRate.getRate(day,customerType));
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






}
