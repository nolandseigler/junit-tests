import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void testGetId() {
        long expected = 0L;
        long actual = withoutGrades.getId();
        assertTrue("Student ID is must be greater than zero.", actual > expected);
        expected = actual;
        actual = withGrades.getId();
        assertTrue("IDs should increase with as students are added.", actual > expected);
    }
//    // returns the student's name
//    public String getName();
    @Test
    public void testGetName() {
        String expected = "Bob";
        String actual = withoutGrades.getName();
        assertEquals("getName() should return the String name instance field.", expected, actual);
    }
//    // adds the given grade to the grades list
//    public void addGrade(int grade);
    @Test
    public void testAddGrade() {
        ArrayList<Integer> blankGrades = withoutGrades.getGrades();
        ArrayList<Integer> hasGrades = withGrades.getGrades();
        assertTrue("Adding grades should increase the List size.", hasGrades.size() > blankGrades.size());
    }
//    // returns the average of the students grades
//    public double getGradeAverage();
    @Test
    public void testGetAverage() {
        double expected = (90 + 80 + 100) / 3;
        double actual = withGrades.getGradeAverage();
        assertEquals(expected, actual, 0);
    }
}
