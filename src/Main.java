public class Main {
    public static void main(String[] args) {
        Teacher olya = new Teacher("Olya", "Fedorchuk", 30);
        Student alex = new Student("Alex", "Yaremych", 18);
        Student yura = new Student("Yura", "Globa", 17);
        Student yarik = new Student("Yaroslav", "Yarovyi", 21);
        System.out.println(olya.toString());
        System.out.println("##################");
        olya.toStringStudents();
        System.out.println("##################");
        olya.setStudents(new Student[] {alex, yura, yarik,
                new Student("Mykola", "Bartenyev", 21),
                new Student("Sofiya", "Nechytaylo", 44),
                new Student("Slava", "Ukraini", 31)
        });
        System.out.print(olya.toString());
        System.out.println("##################");
    }

}


