// TODO: Create a new branch called students-tests and read carefully the next instructions.
// TODO: Create a StudentTest.java class file inside of src/test/java (you might have to create these folders yourself) and remember to write the test before the actual production code.
//       We will simulate the C(reate) R(ead) from the CRUD functionality in our grades application, you should be able to test and create the following requirements:

import java.util.ArrayList;

public class Student {

    public ArrayList<Integer> grades;
    private String name;
    private long id;
    public static long studentCounter = 0;

    // TODO: The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    public Student(String name) {

        studentCounter++;

        this.name = name; // set the student name

        id = studentCounter;

        grades = new ArrayList<>(); // initialize a new grade ArrayList

    }

    // TODO: The Student class should have the following methods:

    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){

        grades.add(grade);

    }

    // returns the average of the students grades
    public long getGradeAverage(){

        long total = 0;

        for (Integer grade : grades) total += grade;

        long average = total / grades.size();

        return average; // returns the average of the students grades

    }

    // TODO: As always, commit and push all your changes once you're done.
    // TODO: At the end of the exercise you will ended up with a Student.java and a StudentTest.java class.
}
