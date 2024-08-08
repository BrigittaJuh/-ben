package ÜbStream12;

import java.util.List;
import java.util.stream.Collectors;

public class Time {
    public List<Double> ConvertMinuteToHours (List<Integer> minutesList){
        return minutesList.stream()
                .map(minutes -> minutes / 60.0)
                .collect(Collectors.toList());
    }
}
