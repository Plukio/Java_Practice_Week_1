import java.util.*;
import java.util.stream.Collectors;

public class HomeworkTask {

    public static List<String> getNotNull(List<String> data) {
        List<String> nonNullData = new ArrayList<>();
        for (String item : data) {
            if (item != null) {
                nonNullData.add(item);
            }
        }
        return nonNullData;
    }

    public static Map<String, List<String>> aggregateByLetter(List<String> data) {
        List<String> notNull = getNotNull(data);

        return notNull.stream().collect(
                Collectors.groupingBy(name -> name.substring(0,1), Collectors.toList())
        );
    }

}
