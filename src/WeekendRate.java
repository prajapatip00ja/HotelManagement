import java.util.ArrayList;
import java.util.List;

/**
 * Created by poojap on 30/04/15.
 */
public class WeekendRate{
    private int weekendRateForRegular;
    private int weekendRateForReward;
    List<String> weekend = new ArrayList<String>();


    public WeekendRate(int weekendRateForRegular, int weekendRateForReward) {
        this.weekendRateForRegular = weekendRateForRegular;
        this.weekendRateForReward = weekendRateForReward;
        putDays();
    }

    public void putDays(){
        weekend.add("sat");
        weekend.add("sun");
    }

    public int getRate(String day,String customerType){
        if(weekend.contains(day) && customerType.equals("Regular"))
            return weekendRateForRegular;
        else if(weekend.contains(day) && customerType.equals("Reward")){
            return weekendRateForReward;
        }
        else
            return 0;
    }
}
