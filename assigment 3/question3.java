import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Employee karen = new Employee();
        karen.assign("karen", 19, 2222222, "homeless", 10000,3);
        karen.assignlow("icecream dispenser");
        Employee johnny = new Employee();
        johnny.assign("johnny", 19, 2222222, "shacks", 10000,6);
        johnny.assignlow("icecream dispenser");
        Manager bob = new Manager();
        bob.assign("bob", 40, 333333, "palm springs", 20000,8);
        bob.assignlow("food");
        System.out.println("net salary of karen is "+karen.netsalary()+"\n salary of johnny is "+johnny.netsalary()+"\n salary of her boss is "+bob.netsalary());
    }

}
class Person{
    String name; int age; int phone; String address; int salary; int year;
    public int assign(String name, int age, int phone, String address, int salary, int year){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.year = year;
        return 0;
    }
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
    public int netsalaryless(){
        int x = this.salary+this.salary+this.salary*30/100+this.salary;
        return x;
    }
    public int netsalarymore(){
        int x = this.salary+this.salary+this.salary*30/100+this.salary*20/100*this.year;
        return x;
    }
    public int netsalary(){
        if (this.year < 5){
            return netsalaryless();
        }
        else
            return netsalarymore();
    }
} 

class Manager extends Person{
    String department;
    int bonus;
    public Manager(){
        System.out.println("enter the managers bonus(will have no effect on answer of 2nd question)");
        Scanner n = new Scanner(System.in);
        bonus = n.nextInt();
        n.close();
    }
    public int assignlow(String department){
        this.department = department;
        return 0;
    }
    public String show(){
        return this.department;
    }
    public int netsalaryless(){
        int x = this.salary+this.salary+this.salary*30/100+this.salary+this.bonus;
        return x;
    }
    public int netsalarymore(){
        int x = this.salary+this.salary+this.salary*30/100+this.salary*20/100*this.year+this.bonus;
        return x;
    }
    public int netsalary(){

        if (this.year < 5){
            return netsalaryless();
        }
        else
            return netsalarymore();
    }
} 
