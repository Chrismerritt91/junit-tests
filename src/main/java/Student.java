import java.util.ArrayList;

public class Student {

    private long id;
    private String name;

    private ArrayList<Integer> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }


    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }


    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(int grade: grades){
            total += grade;
        }
        double average = total / grades.size();

        return average;
    }


}
