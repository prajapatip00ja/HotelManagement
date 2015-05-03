import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by poojap on 30/04/15.
 */
public class DaysRateTest {
    @Test
    public void getRateIsGivingRateForRegularCustomerTypeAndWeekDay(){
        DaysRate daysRate = new DaysRate(110,90,80,80);
        assertEquals(daysRate.getRate("tues","Regular"),110);
    }

    @Test
    public void getRateIsGivingRateForRewardCustomerTypeAndWeekDay(){
        DaysRate daysRate = new DaysRate(110,90,80,80);
        assertEquals(daysRate.getRate("tues","Reward"),80);
    }

    @Test
    public void getRateIsGivingRateForRegularCustomerTypeAndWeekend(){
        DaysRate daysRate = new DaysRate(110,90,80,80);
        assertEquals(daysRate.getRate("sat","Regular"),90);
    }

    @Test
    public void getRateIsGivingRateForRewardCustomerTypeAndWeekend(){
        DaysRate daysRate = new DaysRate(110,90,80,80);
        assertEquals(daysRate.getRate("sun","Reward"),80);
    }

}
