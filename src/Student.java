public class Student extends Person {
    Teacher teacher;
    public Student(){
        teacher = new Teacher();
    }
    public Student(String _name, String _surname, int _age){
        this.name = _name;
        this.surname = _surname;
        this.age = _age;
        setPosition();
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @Override
    public Position getPosition() {
        return Position.Student;
    }
    public void setPosition(){
        position = Position.Student;
    }
    @Override
    public String toString() {
        return super.toString() + ". My position is Student\n";
    }
}
