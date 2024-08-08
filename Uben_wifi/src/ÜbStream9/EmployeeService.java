package ÜbStream9;

import java.util.List;

public class EmployeeService {
    public long getEmployee (List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.yearsOfExperience() > 5)
                .count();
    }
}
