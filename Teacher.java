public class Teacher {
   private String subject;
    private String name;
    private double salary;
    private int age;

    // constructor default (tanpa parameter)
    public Teacher() {
    }

    // constructor dengan parameter
    public Teacher(String subject, String name, double salary, int age) {
        this.subject = subject;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // getter dan setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method print
    public void print() {
        System.out.println("Name    : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : " + salary);
        System.out.println("Age     : " + age);
    }
}

