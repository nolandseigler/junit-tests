import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student withoutGrades;
    Student withGrades;

    @Before
    public void setUp() {
        withoutGrades = new Student("Bob");
        withGrades = new Student("Suzie");
        withGrades.addGrade(90);
        withGrades.addGrade(80);
        withGrades.addGrade(100);
    }
//    // returns the student's id
//    public long getId();
    @Test
    public void validId() {
        long expected = 0L;
        long actual = withoutGrades.getId();
        assertTrue("Student ID is greater than zero.", actual > expected);
        expected = actual;
        actual = withGrades.getId();
        assertTrue("IDs should increase with as students are added.", actual > expected);
    }
//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades list
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();
}
