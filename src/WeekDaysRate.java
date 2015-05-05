import java.util.ArrayList;
import java.util.List;

public class WeekDaysRate {
    private int weekRateForRegular;
    private int weekRateForReward;

    List<String> weekDays = new ArrayList<String>();

    public WeekDaysRate(int weekRateForRegular, int weekRateForReward) {
        this.weekRateForRegular = weekRateForRegular;
        this.weekRateForReward = weekRateForReward;
        pudDays();
    }

    public void pudDays(){
        weekDays.add("mon");
        weekDays.add("tues");
        weekDays.add("wed");
        weekDays.add("thurs");
        weekDays.add("fri");
    }

    public int getRate(String day,String customerType){
        if(weekDays.contains(day) && customerType.equals("Regular"))
            return weekRateForRegular;
        else if(weekDays.contains(day) && customerType.equals("Reward"))
            return weekRateForReward;
        else
            return 0;
    }

    public boolean has(String day) {
        return weekDays.contains(day);
    }
}
