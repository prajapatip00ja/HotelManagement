import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AppTest {

    @Test
    public void getCheapestHotelShouldGiveLakeWoodWhenCustomerTypeIsRegularAndDaysAreMonTuesWed(){
        String[] days = {"mon","tues","wed"};
        App app = new App();
        assertEquals(app.getCheapestHotelName("Regular", days),"LakeWood");
    }

    @Test
    public void getCheapestHotelShouldGiveBrideWoodWhenCustomerTypeIsRegularAndDaysAreFriSatSun(){
        String[] days = {"fri","sat","sun"};
        App app = new App();
        assertEquals(app.getCheapestHotelName("Regular", days),"BrideWood");
    }

    @Test
    public void getCheapestHotelShouldGiveRidgeWoodWhenCustomerTypeIsRewardAndDaysAreThurFriSat(){
        String[] days = {"thur","fri","sat"};
        App app = new App();
        assertEquals(app.getCheapestHotelName("Reward", days),"RidgeWood");
    }
}
