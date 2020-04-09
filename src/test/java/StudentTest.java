
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class StudentTest {

    Student studentOne;
    Student studentTwo;

    @Before
    public void setUp(){
        studentOne = new Student("Sam"); // create a new student, should initialize a new ArrayList for grades
        studentOne.addGrade(95);
        studentOne.addGrade(85);
        studentOne.addGrade(75);

        studentTwo = new Student("Sal"); // create a new student, should initialize a new ArrayList for grades
        studentTwo.addGrade(95);
        studentTwo.addGrade(85);
        studentTwo.addGrade(75);
    }

    @Test
    public void testIfStudentIsInitialized() {
        assertNotNull("student Object is not null", studentOne);
        assertNotNull("student Object is not null", studentTwo);
    }

    @Test
    public void testIfStudentIdIsCounted(){
        assertEquals(1, studentOne.getId());
        assertEquals(2, studentTwo.getId());
    }

    @Test
    public void testIfStudentNameIsSet(){
        assertEquals("Sam", studentOne.getName());
        assertEquals("Sal", studentTwo.getName());
    }

    @Test
    public void testIfGradeArrayListIsInitialized() {
        assertNotNull("Grades ArrayList is not null", studentOne.getGrades());
        assertNotNull("Grades ArrayList is not null", studentTwo.getGrades());
    }

    @Test
    public void testIfAGradeCanBeAdded() {
        assertEquals(3, studentOne.getGrades().size());
        studentOne.addGrade(95);
        studentOne.addGrade(85);
        studentOne.addGrade(75);
        assertEquals(6, studentOne.getGrades().size());
    }

    @Test
    public void testIfGradeAverageIsCorrect(){
        assertEquals(85, studentOne.getGradeAverage() );
        assertEquals(85, studentTwo.getGradeAverage() );
    }

}
