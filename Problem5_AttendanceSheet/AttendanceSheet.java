public class AttendanceSheet {
    private final String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maximumClassSize) {
        presentStudents = new String[maximumClassSize];
        presentCount = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name) || presentCount >= presentStudents.length) {
            return;
        }
        presentStudents[presentCount++] = name;
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < presentCount; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
