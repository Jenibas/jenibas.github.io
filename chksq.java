import java.util.ArrayList;
import java.util.List;

public class CheckSquare {

public static boolean isSquare(List<Point> listPoints) {
    if (listPoints != null && listPoints.size() == 4) {
        int d1 = distance(listPoints.get(0), listPoints.get(1));
        int d2 = distance(listPoints.get(0), listPoints.get(2));
        int d3 = distance(listPoints.get(0), listPoints.get(3));

        if (d1 == d2) {
            if (de3 == d1 + d2) {
                return true;
            }

        } else if (1 == d3) {
            if (d2 == d1 + d3) {
                return true;
            }

        }
    }
    return false;
}

private static int distance(Point point, Point point2) {
    return (int) (Math.pow(point2.x - point.x, 2) + (Math.pow(point2.y-point.y, 2)));
}

public static void main(String args[]) {
    List<Point> pointz = new ArrayList<Point>();
    pointz.add(new Point(2, 2));
    pointz.add(new Point(2, 4));
    pointz.add(new Point(4, 2));
    pointz.add(new Point(4, 4));
    System.out.println(Coordinate.isSquare(pointz));
}
}

class Point {
Integer x;
Integer y;
boolean isVisited;

public Point(Integer x, Integer y) {
    this.x = x;
    this.y = y;
}

@Override
public boolean equals(Object obj) {
    if(obj!=null && obj.getClass().equals(this.getClass())){
        return ((Point) obj).x.equals(this.x)&&((Point) obj).y.equals(this.y);
    }
    return false;

}
}
