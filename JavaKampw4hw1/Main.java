public class Main {

    public static void main(String[] args) {
BaseCustomerManager customerManager=new NeroCustomerManager();
customerManager.save(new Customer(1,"Berkay","Aydın",1997,1234123412));


    }
}
