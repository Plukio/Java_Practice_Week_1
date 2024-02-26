import java.util.*;
import java.util.stream.Collectors;

public class CollectionsTask {

    public static List<String> getNotNull(List<String> data) {
        List<String> nonNullData = new ArrayList<>();
        for (String item : data) {
            if (item != null) {
                nonNullData.add(item);
            }
        }
        return nonNullData;
    }

    public static List<String> getOrdered(List<String> data, boolean reversed) {
        List<String> notNull = getNotNull(data);

        if (reversed) {
            return notNull.stream()
                    .sorted(Comparator.reverseOrder())
                    .toList();
        } else {
            return notNull.stream()
                    .sorted()
                    .toList();
        }
    }

    public static Set<String> getUniqueOrdered(List<String> data, boolean reversed) {
        return new LinkedHashSet<>(getOrdered(data, reversed));
    }

    public static Map<String, Integer> aggregate(List<String> data) {
        List<String> notNull = getNotNull(data);

        return notNull.stream().collect(
                Collectors.groupingBy(name -> name, Collectors.summingInt(name -> 1))
        );
    }



}
