import java.util.Collections;
import java.util.List;

/**
 * 每一轮都是从左到右，相邻元素比较，大的往后排
 * O(n2)
 */
public class BubbleSort implements AppRun.Sort {

    @Override
    public List<Integer> run(List<Integer> data) {
        for(int i = data.size()-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if (data.get(j) > data.get(j+1)){
                    Collections.swap(data, j, j+1);
                }
            }
        }

        return data;
    }
}
