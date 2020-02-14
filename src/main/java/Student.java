
import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private static long counter;
    private ArrayList<Integer> grades;


    Student(String name) {
        this.name = name;
        counter++;
        this.id = counter;
        this.grades = new ArrayList<>();
    }
    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    //ADDED THIS GETTER TO ACCESS GRADES FOR TESTING
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
