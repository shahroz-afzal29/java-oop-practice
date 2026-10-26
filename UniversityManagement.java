class UniversityMember {
    String fullName;
    int age;
    String gender;

    UniversityMember(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    void showDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class UniStudent extends UniversityMember {
    String program;
    double gpa;
    int currentSemester;

    UniStudent(String fullName, int age, String gender, String program, double gpa, int currentSemester) {
        super(fullName, age, gender);
        this.program = program;
        this.gpa = gpa;
        this.currentSemester = currentSemester;
    }

    void showStudentDetails() {
        System.out.println("===== Student Details =====");
        super.showDetails();
        System.out.println("Program: " + program);
        System.out.println("GPA: " + gpa);
        System.out.println("Semester: " + currentSemester);
    }
}

class Teacher extends UniversityMember {
    String department;
    String jobTitle;
    double monthlySalary;

    Teacher(String fullName, int age, String gender, String department, String jobTitle, double monthlySalary) {
        super(fullName, age, gender);
        this.department = department;
        this.jobTitle = jobTitle;
        this.monthlySalary = monthlySalary;
    }

    void showTeacherDetails() {
        System.out.println("===== Teacher Details =====");
        super.showDetails();
        System.out.println("Department: " + department);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        UniStudent s1 = new UniStudent("Hassan", 21, "Male", "BS Computer Science", 3.45, 3);
        Teacher t1 = new Teacher("Mr. Usman", 38, "Male", "Computer Science", "Lecturer", 85000.0);

        s1.showStudentDetails();
        System.out.println();
        t1.showTeacherDetails();
    }
}