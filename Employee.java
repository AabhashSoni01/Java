public class Employee {
    String name;
    int id;
    double salary;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "employee1";
        e1.salary = 65000;

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "employee2";
        e2.salary = 85000;

        Employee e3 = new Employee();
        e3.id = 3;
        e3.name = "employee3";
        e3.salary = 95000;

        System.out.println("Details of employees : ");
        System.out.println("id : " + e1.id + "\n" + "name : " + e1.name + "\n" + "salary : " + e1.salary + "\n");
        System.out.println("id : " + e2.id + "\n" + "name : " + e2.name + "\n" + "salary : " + e2.salary + "\n");
        System.out.println("id : " + e3.id + "\n" + "name : " + e3.name + "\n" + "salary : " + e3.salary + "\n");
    }
}
