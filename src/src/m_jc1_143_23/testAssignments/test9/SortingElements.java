package m_jc1_143_23.testAssignments.test9;

import java.util.Comparator;

public class SortingElements implements Comparator<HomeDevice> {
    @Override
    public int compare(HomeDevice o1, HomeDevice o2) {
        int compare = Integer.compare(o1.getPower(), o2.getPower());
        if (compare == 0) {
            return Integer.compare(o1.getPower(), o2.getPower());
        } else {
            return 0;
        }
    }
}