public class Main {

    public static void main(String[] args) {
    User Ahmet = new User();
    Ahmet.setName("Ahmet");
    Ahmet.setId(1);
    Ahmet.setEmail("Ahmet@mail.com");
    Instructor Engin=new Instructor();
    Engin.setName("Engin");
    Engin.setId(2);
    Engin.setLectures("Java");
    System.out.println(Engin.getId());
    InstructorManager instructorManager= new InstructorManager();
    instructorManager.add(Engin);

    }
}
