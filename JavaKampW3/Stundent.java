public class Stundent extends User{
    private String enrolledCourses;
    private  int attandance;


    public String getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public int getAttandance() {
        return attandance;
    }

    public void setAttandance(int attandance) {
        this.attandance = attandance;
    }



    public Stundent(int id, String name, String lastName, String email, String enrolledCourses, int attandance) {
        super(id, name, lastName, email);
        this.enrolledCourses = enrolledCourses;
        this.attandance = attandance;
    }

    public Stundent(String enrolledCourses, int attandance) {
        this.enrolledCourses = enrolledCourses;
        this.attandance = attandance;
    }


}
