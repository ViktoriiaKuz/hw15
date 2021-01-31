package kuznichenko;

import java.util.Date;

public class NormalOrder extends Order {

    NormalOrder(Date date, String number, Customer customer) {
        super(date, number, customer);
    }

    public void dispatch(){
        System.out.println("5. " + "Товар отправлен! " + Order.sdf.format(getDate()));
        orderData();
        System.out.println("                                   ");


    }

    public void recieve() {
        System.out.println("6. " + "Товар получен! " + Order.sdf.format(getDate()));
        orderData();
        System.out.println("                                   ");


    }
}
