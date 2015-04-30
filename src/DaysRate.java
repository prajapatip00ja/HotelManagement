import java.util.ArrayList;
import java.util.List;

/**
 * Created by poojap on 30/04/15.
 */
public class DaysRate {
    private int weekRateForRegular;
    private int weekendRateForRegular;
    private int weekRateForReward;
    private int weekendRateForReward;
    List<String> weekDays = new ArrayList<String>();
    List<String> weekend = new ArrayList<String>();

    public DaysRate(int weekRateForRegular, int weekendRateForRegular, int weekRateForReward, int weekendRateForReward) {
        this.weekRateForRegular = weekRateForRegular;
        this.weekendRateForRegular = weekendRateForRegular;
        this.weekRateForReward = weekRateForReward;
        this.weekendRateForReward = weekendRateForReward;
        pudDays();
    }

    public void pudDays(){
        weekDays.add("mon");
        weekDays.add("tues");
        weekDays.add("wed");
        weekDays.add("thurs");
        weekDays.add("fri");
        weekend.add("sat");
        weekend.add("sun");
    }

    public int getRate(String day,String customerType){
        if(weekDays.contains(day) && customerType.equals("Regular"))
            return weekRateForRegular;
        else if(weekDays.contains(day) && customerType.equals("Reward"))
            return weekRateForReward;
        else if(weekend.contains(day) && customerType.equals("Regular"))
            return weekendRateForRegular;
        else if(weekend.contains(day) && customerType.equals("Reward")){
            return weekendRateForReward;
        }
        else
            return 0;
    }
}
