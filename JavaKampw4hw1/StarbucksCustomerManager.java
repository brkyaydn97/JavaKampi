public class StarbucksCustomerManager extends BaseCustomerManager{
    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    public void save(Customer customer) {
if(_customerCheckService.checkIfRealPerson(customer)){
    this.save(customer);
}
else System.out.println("Kullanıcı geçerli değil");

}
}
