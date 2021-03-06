import org.junit.Test;


import static junit.framework.Assert.assertEquals;


public class HotelTest {
    @Test
    public void getRatesShouldGiveMinimumRateFromTheRatesOfDifferentWeekdays(){
        Hotel hotel = new Hotel("LakeWood",3,new WeekDaysRate(110,80),new WeekendRate(90,80));
        String[] days = {"mon","tues","wed"};
        assertEquals(hotel.getRate("Regular", days), 110);
    }

    @Test
    public void getRatesShouldGiveMinimumRateFromTheRatesOfDifferentWeekend(){
        Hotel hotel = new Hotel("LakeWood",3,new WeekDaysRate(110,80),new WeekendRate(90,80));
        String[] days = {"wed","fri","sun"};
        assertEquals(hotel.getRate("Regular", days),90);
    }



}
