import java.util.ArrayList;
import java.util.List;

/**
 * 从一个集合里面拿出来，放到另一个有序集合中，在另一个有序集合中找到合适的位置
 * O(n2)
 */
public class InsertSort implements AppRun.Sort {
    @Override
    public List<Integer> run(List<Integer> data) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (result.size() == 0) {
                result.add(data.get(i));
            } else {
                int minIndexThisPart = -1;
                for (int j = 0; j < result.size(); j++) {
                    if (result.get(j) < data.get(i)) {
                        minIndexThisPart = j + 1;
                    }
                }

                if (minIndexThisPart != -1) {
                    result.add(minIndexThisPart, data.get(i));
                } else {
                    result.add(data.get(i));
                }
            }
        }
        return result;
    }
}
