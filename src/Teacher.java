import java.sql.Array;
import java.util.Arrays;

public class Teacher extends Person{
    Student[] students;
    public Teacher(){
        students = new Student[0];
    }
    public Teacher(String _name, String _surname, int _age){
        this.name = _name;
        this.surname = _surname;
        this.age = _age;
        setPosition();
    }
    public Teacher(String _name, String _surname, int _age, Student[] _students) {
        this.name = _name;
        this.surname = _surname;
        this.age = _age;
        students = _students;
        setPosition();
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    @Override
    public Position getPosition() {
        return Position.Teacher;
    }
    public void setPosition(){
        position = Position.Teacher;
    }
    public void addStudent(Student student){
        Student[] _students = Arrays.copyOf(students, students.length +1);
        _students[_students.length -1] = student;
        setStudents(_students);
    }
    public String toStringStudents(){
        return Arrays.toString(students);
    }
    @Override
    public String toString() {
        return super.toString() + ". My position is Teacher\n" + students != null ? this.toStringStudents() : "I don`t have any students";
    }
}



