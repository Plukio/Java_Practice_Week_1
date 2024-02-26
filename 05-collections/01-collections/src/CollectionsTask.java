import java.util.*;

public class CollectionsTask {

    // rewrite this as List<Double>
    public static List<Double> temperatures = List.of(19.2, 20.1, 22.5, 25.4, 28.2,
            26.1, 24.0, 21.9, 25.0, 27.2);

    // rewrite this as Set<String>
    public static List<String> dates1 = List.of("2024-02-19", "2024-02-20", "2024-02-21", "2024-02-22", "2024-02-23",
            "2024-02-24", "2024-02-25", "2024-02-26", "2024-02-27", "2024-02-28");

    // implement getTemperatures

    public static Map<String, Double> getTemperatures() {
        Map<String, Double> map =  new HashMap<>();
        for (int i = 0; i < temperatures.size() ; i++){
            map.put(dates1.get(i), temperatures.get(i));
        }
        return map;
    }


    // implement getTemperaturesBetween
    public static Map<String, Double> getTemperaturesBetween(Map<String, Double> temperatures, Double min, Double max) {
        Map<String, Double> map =  new HashMap<>();
        for (Map.Entry<String, Double> object : temperatures.entrySet()){
            if ((object.getValue() >= min && object.getValue() <= max)){
                map.put(object.getKey(), object.getValue());
            }
        }
        return map;
    }


}
