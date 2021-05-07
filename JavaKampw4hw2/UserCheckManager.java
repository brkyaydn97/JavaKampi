public class UserCheckManager implements IUserCheckService {
    public boolean checkIfRealPerson(User user){
System.out.println("Kullanıcı doğrulandı : "+user.getName());
        return true;
    }
}
