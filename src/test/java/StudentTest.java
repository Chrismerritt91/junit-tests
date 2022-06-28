import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student name = new Student(1L, "James");
        Student otherPerson = null;

        assertNull(otherPerson);
        assertNotNull(name);
    }

    @Test
    public void testAllFieldsGetUpdated() {
        Student name = new Student(1L, "Justin");

        assertSame(1L, name.getId());
        assertSame("Justin", name.getName());
        assertSame(0, name.getGrades().size());

        Student name2 = new Student();
        assertSame(0, name2.getGrades().size());
    }

    @Test
    public void testAddingGradesWorks() {
        Student name = new Student(1L, "Jasmine");

        name.addGrade(100);

        assertSame(100, name.getGrades().get(0));
        name.addGrade(80);
        assertSame(2, name.getGrades().size());
    }

    @Test
    public void testAverageGradeWorks() {
        Student name = new Student(1L, "Jared");
        name.addGrade(100);
        name.addGrade(100);

        assertEquals(100, name.getGradeAverage(), 0);

        name.addGrade(50);

        assertEquals(83.3, name.getGradeAverage(), 0.04);
    }

}
