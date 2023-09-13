public class oops4{
    public static void main(String args[]){
        employee e = new employee();
        e.set();
    }
}
class employee{
    int id = 1;
    String name = "abc";
    String de = "programar";
    long salary = 90000;

    void set() {
        System.out.println("Employ Id = " + id);
        System.out.println("Employ Name = " + name);
        System.out.println("Employe Designation = " + de);
        System.out.println("Employe Salary = " + salary);

    }
}