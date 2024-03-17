package DSA.week1.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    Sort sortee;

    public void setSortee(Sort sortee) {
        this.sortee = sortee;
    }

    public Sort getSortee() {
        return sortee;
    }

    public void sort(List<SinhVien> data) {
        Collections.sort(data, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() != o2.getGpa()) {
                    return Double.compare(o1.getGpa(), o2.getGpa());
                }
                return o1.getId();
            }}

        );
    }
}
