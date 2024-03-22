import java.util.*;

class Lecture {
    int start, end;
    String name;

    public Lecture(int start, int end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public String getTimeFromInt(int time) {
        if (time < 1000)
            return String.format("0%d:00", time / 100, time % 100);
        else
            return String.format("%d:00", time / 100, time % 100);
    }

    public String toString() {
        return name + " (" + getTimeFromInt(start) + " - " + getTimeFromInt(end) + ")";
    }
}

public class Interval_Partitioning {

    public static void main(String[] args) {
        List<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(900, 1030, "Lecture 1"));
        lectures.add(new Lecture(1000, 1045, "Lecture 2"));
        lectures.add(new Lecture(1030, 1130, "Lecture 3"));
        lectures.add(new Lecture(1200, 1300, "Lecture 4"));
        lectures.add(new Lecture(1230, 1330, "Lecture 5"));
        lectures.add(new Lecture(1400, 1500, "Lecture 6"));
        lectures.add(new Lecture(1500, 1600, "Lecture 7"));

        System.out.println("Optimal Schedule:");
        System.out.println("-----------------");
        int numRooms = intervalPartitioning(lectures);
        System.out.println("Number of rooms required: " + numRooms);
        System.out.println();

        for (int i = 0; i < numRooms; i++) {
            System.out.println("Room " + (i + 1));
            System.out.println("----------");
            for (Lecture lecture : lectures) {
                if (lecture.room == i + 1) {
                    System.out.println(lecture);
                }
            }
            System.out.println();
        }
    }

    private static int intervalPartitioning(List<Lecture> lectures) {
        // Sort lectures by start time
        Collections.sort(lectures, new Comparator<Lecture>() {
            public int compare(Lecture l1, Lecture l2) {
                return Integer.compare(l1.start, l2.start);
            }
        });

        // Initialize room assignments
        int numRooms = 1;
        int endTime = lectures.get(0).end;

        for (int i = 1; i < lectures.size(); i++) {
            if (lectures.get(i).start >= endTime) {
                numRooms--;
                endTime = lectures.get(i).end;
            }
            lectures.get(i).room = numRooms;
            endTime = Math.max(endTime, lectures.get(i).end);
            numRooms = Math.max(numRooms, lectures.get(i).room);
        }

        return numRooms;
    }

    static class Lecture {
        int start, end;
        int room;
        String name;

        public Lecture(int start, int end, String name) {
            this.start = start;
            this.end = end;
            this.name = name;
        }

        public String toString() {
            return room + " " + name;
        }
    }
}

/*OUTPUT
................................
Optimal Schedule:
-----------------
Number of rooms required: -2 */