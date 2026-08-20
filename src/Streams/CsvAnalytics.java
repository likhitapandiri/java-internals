package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CsvAnalytics {
    public List<Employee> readCsv() throws IOException {
        List<Employee> employees = Files.readAllLines(
                        Path.of("Streams/employee.csv")
                ).stream()
                .skip(1)
                .map(line -> {
                    String[] data = line.split("\\|");
                    return new Employee(
                            Integer.parseInt(data[0].trim()),
                            data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim()
                    );                })
                .toList();
        return employees;
    }

    public List<Employee> filterByAge(
            List<Employee> employees,
            int age
    ) {

        return employees.stream().
                filter(employee -> employee.getAge()>age).
                toList();
    }

    public List<Employee> sortByAge(
            List<Employee> employees
    ) {
        return employees.stream().sorted(
                Comparator.comparingInt(employee -> employee.getAge())
        ).toList();
    }

    public Map<String, List<Employee>> groupByCity(
            List<Employee> employees
    ) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getCity));
    }

    public Map<String, Long> countByCity(
            List<Employee> employees
    ) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
    }

    public List<String> getEmployeeNames(
            List<Employee> employees
    ) {
        return employees.stream().map(employee -> employee.getName()).toList();
    }




}
