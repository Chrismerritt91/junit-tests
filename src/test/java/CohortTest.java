import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort = new Cohort();

    @Before
    public void setup(){
        Student jerry = new Student(1L, "jerry");
        Student jody = new Student(2L, "jody");
        Student john = new Student(3L, "john");

        cohort.addStudent(jerry);
        cohort.addStudent(jody);
        cohort.addStudent(john);
    }

    @Test
    public void testCohortAddStudentToList(){

        assertSame(3,cohort.getStudents().size());
    }

    @Test
    public void testCohortCanGetCurrentListOfStudents(){


        assertSame("jerry", cohort.getStudents().get(0).getName());
        assertSame("jody", cohort.getStudents().get(1).getName());

    }

    @Test
    public void testCohortGetAverageCalculateCorrectly(){
        assertEquals(0D, cohort.getCohortAverage(), 0);
        Student jason = new Student(4L, "jason");

        jason.addGrade(100);
        jason.addGrade(50);
        jason.addGrade(50);

        cohort.addStudent(jason);

        assertEquals(66.6, jason.getGradeAverage(), .07);
        assertEquals(16.66,cohort.getCohortAverage(),0.07);

    }

    @Test
    public void testCohortFindStudentsById(){
        Student student = cohort.findStudentById(1L);
        assertSame("jerry", student.getName());

    }


}
