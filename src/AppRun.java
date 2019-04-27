import java.util.ArrayList;
import java.util.List;

public class AppRun {

    private static List<Integer> data = new ArrayList<>();

    static {
        data.add(1);
        data.add(14);
        data.add(22);
        data.add(9);
        data.add(5);
        data.add(68);
        data.add(44);
        data.add(12);
        data.add(28);
    }

    public interface Sort{
        List<Integer> run(List<Integer> data);
    }

    public static void main(String[] args) {
        Sort sort = new InsertSortV2();
        System.out.println(sort.run(data));
    }
}
