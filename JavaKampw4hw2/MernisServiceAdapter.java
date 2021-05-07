public class MernisServiceAdapter implements IUserCheckService {

    @Override
    public boolean checkIfRealPerson(User user) {
        return true;
    }
}
