class Post {
    private String title;
    private String payScale;
    private double salary;

    public Post() {
        this.title = "Junior Associate";
        this.payScale = "BPS-16";
        this.salary = 0.0;
    }

    public Post(String title, String payScale, double salary) {
        this.title = title;
        this.payScale = payScale;
        this.salary = salary;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getPayScale() { return payScale; }
    public void setPayScale(String payScale) { this.payScale = payScale; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class Employee {
    private String name;
    private int age;
    private Post post;

    public Employee() {
        this.name = "Unknown";
        this.age = 18;
        this.post = new Post();
    }

    public Employee(String name, int age, Post post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }

    public double getSalary() { return post.getSalary(); }
    public void setSalary(double salary) { post.setSalary(salary); }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job Title: " + post.getTitle());
        System.out.println("Pay Scale: " + post.getPayScale());
        System.out.println("Salary: $" + post.getSalary());
    }
}

public class EmployeePostComposition {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Ali Khan");
        emp1.setAge(28);
        emp1.setSalary(5000.0);
        emp1.getPost().setTitle("Software Engineer");
        emp1.getPost().setPayScale("Level-2");

        System.out.println("--- Employee 1 Details ---");
        emp1.displayEmployeeInfo();
        System.out.println();

        Post leadPost = new Post("Team Lead", "Level-4", 8500.0);
        Employee emp2 = new Employee("Sara Ahmed", 34, leadPost);

        System.out.println("--- Employee 2 Details ---");
        emp2.displayEmployeeInfo();
    }
}