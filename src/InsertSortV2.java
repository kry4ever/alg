import java.util.List;

/**
 * 4 1 3 5 7
 * 4 | 1357
 * 14 | 357
 * 134 | 57
 *
 * 每次拿横线后面的数去插入到前面的数中间，为了找出合适的位置，需要O(1)的额外空间
 */
public class InsertSortV2 implements AppRun.Sort {
    @Override
    public List<Integer> run(List<Integer> data) {
        for (int i = 1; i < data.size(); i++) {
            int pre = i - 1;
            int current = data.get(i);
            while (pre >= 0 && current < data.get(pre)) {
                //后面的数需要往前插入。所以每个数依此往后挪
                data.set(pre + 1, data.get(pre));
                pre--;
            }
            data.set(pre + 1, current);
        }

        return data;
    }
}
