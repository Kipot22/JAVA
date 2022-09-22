package school.lesson3;

public class Employee {
    public static void main(String[] args) {
        Employee1[] emp = new Employee1[5];
        emp[0] = new Employee1("Sidorov Sidor", "Devops", "sidorov@mailbox.com", "963258741", 60000, 42);
        emp[1] = new Employee1("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emp[2] = new Employee1("Petrov Petr", "Developer", "petrov@mailbox.com", "147258369", 50000, 27);
        emp[3] = new Employee1("Martov Mark", "Manager", "martov@mailbox.com", "789654123", 40000, 35);
        emp[4] = new Employee1("Fedorov Fedor", "HR", "fedorov@mailbox.com", "852369874", 28000, 36);

        for (Employee1 employee : emp) {
            if (employee.getAge() > 40)
                System.out.println(employee);
        }
    }
    }
class Employee1 {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee1(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return (fullName+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}



