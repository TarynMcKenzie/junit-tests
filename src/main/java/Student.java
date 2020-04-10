import java.util.ArrayList;

public class Student {


    // ------------ INITIALIZE -----------
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    // ------------ CONSTRUCTOR METHOD -----------
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // ------------ GET AND SET -----------
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // ------------ ADD A GRADE -----------
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // ------------ GET AVERAGE -----------
    public double getGradeAverage() {
        double sum = 0;

        for (int grade: this.grades) sum += grade;

        return sum / this.grades.size() ;

    }

}
