import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by poojap on 30/04/15.
 */
public class WeekDaysRateTest {
    @Test
    public void getRateIsGivingRateForRegularCustomerTypeAndWeekDay(){
        WeekDaysRate daysRate = new WeekDaysRate(110,80);
        assertEquals(daysRate.getRate("tues","Regular"),110);
    }

    @Test
    public void getRateIsGivingRateForRewardCustomerTypeAndWeekDay(){
        WeekDaysRate daysRate = new WeekDaysRate(110,80);
        assertEquals(daysRate.getRate("tues","Reward"),80);
    }


}
