import java.util.Comparator;
import java.util.Map;

/**
 * Created by poojap on 03/05/15.
 */
public class RateComparator implements Comparator<Hotel> {
    Map<Hotel,Integer> base;
    public RateComparator(Map<Hotel, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(Integer a, Integer b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }     // returning 0 would merge keys

    @Override
    public int compare(Hotel hotel, Hotel hotel2) {
        if (base.get(hotel) >= base.get(hotel2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
