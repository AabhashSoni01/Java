// class ATM {
//     private int a;

//     public void setRuppes(int a) {
//         this.a = a;
//     }

//     public int getRuppes() {
//         return a;
//     }
// }

class employee {
    private int id, salary;
    private String name;

    public void setData(int i, int sal, String n) {
        id = i;
        salary = sal;
        name = n;
    }

    public void getData() {
        System.out.println("id : " + id + " name : " + name + " salary : " + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.setData(01, 50000, "Aabhash");
        obj.getData();
    }
}
