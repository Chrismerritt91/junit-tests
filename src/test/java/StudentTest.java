import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student fer;
    @Before
    public void setup(){
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }

    @Test
    public void testCreateStudent(){
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(2, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        assertSame(100, fer.getGrades().get(0));
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        assertEquals(90, fer.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade(){

        fer.updateGrade(1, 100);

        int grade = fer.getGrades().get(1);

        assertEquals(100, grade, 0);

    }

    @Test
    public void testDeleteGrade(){

    }
}