import java.util.Collections;
import java.util.List;

/**
 * 每一轮都得出一个最小的index， 把它和这轮首个元素交换位置
 * O(n2)
 */
public class SelectSortV2 implements AppRun.Sort {
    @Override
    public List<Integer> run(List<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            int minIndexThisPart = i;
            for (int j = i; j < data.size(); j++) {
                if (data.get(j) < data.get(minIndexThisPart)){
                    minIndexThisPart = j;
                }
            }

            if (minIndexThisPart != i){
                Collections.swap(data, i, minIndexThisPart);
            }
        }

        return data;
    }
}
