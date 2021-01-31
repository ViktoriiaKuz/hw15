package kuznichenko;

import java.util.Date;

public class CustomerService {

    Customer customer;

    Order order;


    CustomerService (Customer customer, Order order){
        this.customer = customer;
        this.order = order;
    }

    public void customerService(){
        System.out.println(customer.getName());
        System.out.println(customer.getLocation());
        System.out.println(order.getNumber());
        System.out.println(order.getDate());
    }
}
