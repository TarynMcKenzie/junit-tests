// TODO: Create a new branch called students-tests and read carefully the next instructions.
// TODO: Create a StudentTest.java class file inside of src/test/java (you might have to create these folders yourself) and remember to write the test before the actual production code.
//       We will simulate the C(reate) R(ead) from the CRUD functionality in our grades application, you should be able to test and create the following requirements:

import java.util.ArrayList;

public class Student {

    // TODO: The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    public ArrayList<Integer> grades;

    public Student(ArrayList<Integer> grades){

        this.grades = grades;

    }

    // TODO: The Student class should have the following methods:

    // returns the student's id
    public long getId();
    // returns the student's name
    public String getName();

    // adds the given grade to the grades list
    public void addGrade(int grade);
    // returns the average of the students grades
    public double getGradeAverage();

    // TODO: As always, commit and push all your changes once you're done.
    // TODO: At the end of the exercise you will ended up with a Student.java and a StudentTest.java class.
}
