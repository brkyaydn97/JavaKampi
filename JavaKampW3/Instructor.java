public class Instructor extends User {
    private String department;
private String lectures;

    public Instructor(int id, String name, String lastName, String email, String department, String lectures) {
        super(id, name, lastName, email);
        this.department = department;
        this.lectures = lectures;
    }

    public Instructor(String department, String lectures) {
        this.department = department;
        this.lectures = lectures;
    }
public Instructor(){

}
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLectures() {
        return lectures;
    }

    public void setLectures(String lectures) {
        this.lectures = lectures;
    }
}
