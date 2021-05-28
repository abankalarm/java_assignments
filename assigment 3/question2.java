public class question2 {
    public static void main(String[] args) {
        Employee karen = new Employee();
        karen.assign("karen", 19, 2222222, "homeless", 10000);
        karen.assignlow("icecream dispenser");
        Manager bob = new Manager();
        bob.assign("bob", 40, 333333, "palm springs", 20000);
        bob.assignlow("food");
        System.out.println("salary of karen is "+karen.printsalary()+"\n salary of her boss is "+bob.printsalary());
    }
}
/* declared properly in question number 3 since both in same folder
class Person{
    String name; int age; int phone; String address; int salary;
    public int assign(String name, int age, int phone, String address, int salary){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        return 0;
    }
    public int printsalary(){
        return salary;
    }
}

class Employee extends Person{
    String Spec;
    public int assignlow(String Spec){
        this.Spec = Spec;
        return 0;
    }
    public String show(){
        return this.Spec;
    }
} 

class Manager extends Person{
    String department;
    public int assignlow(String department){
        this.department = department;
        return 0;
    }
    public String show(){
        return this.department;
    }
} 
*/