import java.util.Collections;
import java.util.List;

/**
 * 第一轮每个元素都和第一个比较，把小的放在第一位
 * O(n2)
 */
public class SelectSort implements AppRun.Sort {

    @Override
    public List<Integer> run(List<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = i; j < data.size(); j++) {
                if (data.get(j) < data.get(i)){
                    Collections.swap(data, i, j);
                }
            }
        }

        return data;
    }
}
