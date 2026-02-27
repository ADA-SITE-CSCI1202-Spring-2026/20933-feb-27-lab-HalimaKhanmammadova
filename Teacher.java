public class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String fn, String ln, String gen, String dept, String[] crs) {
        super(fn, ln, gen);
        this.department = dept;
        this.courses = crs;
    }

    public String getDepartment() { return department; }
    public String[] getCourses() { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String[] courses) { this.courses = courses; }

    public String toString() {
        return "Teacher [" + super.toString() + ", department=" + department + ", courses=" + java.util.Arrays.toString(courses) + "]";
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
               this.department.equals(t.department) &&
               java.util.Arrays.equals(this.courses, t.courses);
    }
}