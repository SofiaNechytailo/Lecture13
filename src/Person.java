public class Person {
    String name;
    String surname;
    int age;
    Position position;
    public Person(){};
    public Person(String _name, String _surname, int _age, Position _position){
        this.name = _name;
        this.surname = _surname;
        this.age = _age;
        this.position = _position;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public Position getPosition() {
        return position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is "+name+' '+surname+", I am " + age + " years old";
    }
}






