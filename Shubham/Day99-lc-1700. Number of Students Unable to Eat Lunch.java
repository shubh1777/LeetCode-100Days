import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleStudentCount = 0, squareStudentCount = 0;
        for (int student : students) {
            if (student == 1)
                squareStudentCount++;
            else
                circleStudentCount++;
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 1) {
                if (squareStudentCount > 0)
                    squareStudentCount--;
                else
                    break;
            }
            if (sandwich == 0) {
                if (circleStudentCount > 0)
                    circleStudentCount--;
                else
                    break;
            }
        }
        return squareStudentCount + circleStudentCount;
    }
}
