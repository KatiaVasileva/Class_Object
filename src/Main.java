public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println(sarah.getName() + " " + sarah.getAge());
        sarah.setAge(31);
        System.out.println(sarah.getName() + " " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println(john.getName() + " " + john.getAge());

    }
}