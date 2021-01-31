package kuznichenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {


    private Date date;
    private String number;

    static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");


    Order(Date date, String number, Customer customer){

        this.date = date;
        this.number = number;

    }

    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    public void sendOrder(){
        System.out.println("1. " + "Cделан заказ ");
        System.out.println("                                   ");

    }

    public void recieveOrder(){
        System.out.println("2. " + "Заказ получен ");
        System.out.println("                                   ");

    }

    public void confirm(){
        System.out.println("3. " + "Подтверждено " + sdf.format(getDate()));
        orderData();
        System.out.println("                                   ");

    };

    public void close(){
        System.out.println("4. " + "Оплачено " + sdf.format(getDate()));
        orderData();
        System.out.println("                                   ");

    };
    public void orderData(){

        System.out.println(getNumber() + " - номер заказа");

    }
}
