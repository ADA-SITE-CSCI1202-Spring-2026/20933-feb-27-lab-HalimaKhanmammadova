public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", "Male");
        Person p2 = new Person("John", "Doe", "Male");

        System.out.println(p1);
        System.out.println(p1.equals(p2));

        Teacher t1 = new Teacher("Jane", "Smith", "Female", "CS", new String[]{"Java", "Python"});
        Teacher t2 = new Teacher("Jane", "Smith", "Female", "CS", new String[]{"Java", "Python"});

        System.out.println(t1);
        System.out.println(t1.equals(t2));
    }
}