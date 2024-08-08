package ÜbOop3;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, String department, double bonus) {
        super(name, salary, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager [ name = " + getName() + ", salary = " + getSalary() + ", department = " + getDepartment() +", bonus= " + bonus + "]";
    }
}
