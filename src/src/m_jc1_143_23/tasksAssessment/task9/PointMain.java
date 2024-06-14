package m_jc1_143_23.tasksAssessment.task9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PointMain {
    public static void main(String[] args) {

        int dist = 5;
        List<Point> points = Arrays.asList(
                new Point(9, 8, 7),
                new Point(6, 5, 4),
                new Point(3, 2, 1));

        Point maxPointX = points.stream().max(Comparator.comparing(Point::getX)).orElse(null);
        System.out.println("Point with max value of X: " + maxPointX);

        points.stream().map(Point::distance).forEach(System.out::println);

        List<Point> distantPoints = points.stream().filter(p -> p.distance() > dist).toList();
        System.out.println("Points with distance > " + dist + ": " + distantPoints);

        List<Point> sortedPoints = points.stream().sorted(Comparator.comparing(Point::distance).
                reversed()).toList();
        System.out.println("Points sorted by distance to points to the origin: " + sortedPoints);
    }
}


