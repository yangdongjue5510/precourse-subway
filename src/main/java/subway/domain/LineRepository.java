package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static Line findLineByName(String name) {
        return lines().stream()
            .filter(line -> line.getName().equals(name))
            .findFirst().orElseThrow();
    }

    public static long countLineByName(String name) {
        return lines.stream()
            .filter(line -> line.getName().equals(name))
            .count();
    }

    public static List<String> getFirstStationNamesInLines() {
        return lines().stream()
            .map(line -> line.getStations().get(0).getName())
            .collect(Collectors.toList());
    }

    public static List<String> getLastStationNamesInLines() {
        return lines().stream()
            .map(line -> line.getStations().get(line.getStations().size()-1).getName())
            .collect(Collectors.toList());
    }

    public static void addSectioninLine(Line line, Station station, int index) {
        line.getStations().add(index-1, station);
    }

    public static void deleteStationInLine(Line line, Station station) {
        int index = line.getStations().indexOf(station);
        line.getStations().remove(index);
    }
}
