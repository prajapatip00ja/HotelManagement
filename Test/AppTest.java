import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class AppTest {
    @Test
    public void getCheapestHotelShouldGiveLakeWoodWhenCustomerTypeIsRegularAndDaysAreMonTuesWed(){
        String[] days = {"mon","tues","wed"};
        App app = new App();
        assertTrue("LakeWood".equals(app.getCheapestHotel("Regular",days)));
    }
}
