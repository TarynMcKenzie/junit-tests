import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


// TODO: Once you are done with the Student.java class.
//          1. Checkout to the cohorts-feature branch, there you will find a Cohort.java class inside the src/main/java folder, this class has already a lot of methods to calculate the cohort average grade and add a student. Let's go ahead and make sure there's sufficient tests for this class to be deployed to production:
//          2. Start by creating a new branch called: cohorts-tests.
//          3. Then create a CohortTest class and build a test for each of the following requirements:
//                  a. A Cohort instance can add a Student to the List of students.
//                  b. A Cohort instance can get the current List of students.
//                  c. A Cohort instance can get the average and it's being calculated correctly.
//          4. Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases, the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class if you find any code repetition as well.

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithOne.addStudent(fer);
        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
//        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

}