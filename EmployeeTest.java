class Employee
{
    private String name;          // hidden from other classes
    private double salary;        // hidden from other classes

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary)
    {
        if (salary >= 0)          // the class controls what values are allowed
            this.salary = salary;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setName("Grace");
        emp.setSalary(50000);
        emp.setSalary(-100);      // rejected by the set method
        // emp.salary = -100;     would NOT compile: salary is private
        System.out.println(emp.getName() + " earns " + emp.getSalary());
    }
}