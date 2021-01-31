package kuznichenko;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Виктория",  "Харьков");


        Date date = new Date();
        SpecialOrder specialOrder = new SpecialOrder(date, "124", customer);
        specialOrder.sendOrder();
        specialOrder.recieveOrder();
        specialOrder.confirm();
        specialOrder.close();
        specialOrder.dispatch();
        CustomerService customerService = new CustomerService(customer,specialOrder );
        customerService.customerService();
        System.out.println("*********************************");


        NormalOrder normalOrder = new NormalOrder(date, "999", customer);
        normalOrder.sendOrder();
        normalOrder.recieveOrder();
        normalOrder.confirm();
        normalOrder.close();
        normalOrder.dispatch();
        normalOrder.recieve();
        CustomerService customerService1 = new CustomerService(customer,normalOrder );
        customerService1.customerService();
        System.out.println("*********************************");
    }
}
