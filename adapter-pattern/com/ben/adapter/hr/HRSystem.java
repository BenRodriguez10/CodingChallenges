package com.ben.adapter.hr;

import java.util.Iterator;
import java.util.stream.Stream;

public class HRSystem implements IHRSystem {

    private static HRSystem instance;

    private HRSystem() {
    }

    public static HRSystem getInstance() {
        if (instance == null) {
            instance = new HRSystem();
        }
        return instance;
    }

    @Override
    public Iterator<IEmployee> getEmployees() {
        return Stream.of(
                new Employee("John", "Smith", 15000, new PaymentDetail("548291", "40192184")),
                new Employee("Jane", "Jones", 17500, new PaymentDetail("548291", "98192184")),
                new Employee("Bill", "Collins", 13751, new PaymentDetail("542491", "18234214")),
                new Employee("Dorothy", "Parker", 31332, new PaymentDetail("242291", "42342184")),
                new Employee("Alice", "Alan", 15407, new PaymentDetail("548342", "23984523")),
                new Employee("Bob", "Smith", 17809, new PaymentDetail("343394", "48192344")),
                new Employee("Charlie", "Taylor", 25000, new PaymentDetail("838291", "21341354")),
                new Employee("Margaret", "Mcdonald", 25750, new PaymentDetail("599291", "43255434")),
                new Employee("Janice", "Juniper", 15400, new PaymentDetail("543228", "48392184")),
                new Employee("Phil", "Smith", 12500, new PaymentDetail("123451", "01943812"))
        ).map(e -> (IEmployee) e).iterator();
    }

}
