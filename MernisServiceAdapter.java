public class MernisServiceAdapter implements ICustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
