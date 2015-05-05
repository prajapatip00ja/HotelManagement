import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WeekendRateTest {
    @Test
    public void getRateIsGivingRateForRegularCustomerTypeAndWeekend(){
        WeekendRate daysRate = new WeekendRate(110,80);
        assertEquals(daysRate.getRate("sat","Regular"),110);
    }

    @Test
    public void getRateIsGivingRateForRewardCustomerTypeAndWeekDay(){
        WeekendRate daysRate = new WeekendRate(110,80);
        assertEquals(daysRate.getRate("sun","Reward"),80);
    }

}
