package kuznichenko;

import java.util.Date;

public class SpecialOrder extends Order{


     SpecialOrder(Date date, String number, Customer customer) {
          super(date, number, customer);

     }

     @Override
     public void confirm() {
          System.out.println("3. " + "Подтверждено " + Order.sdf.format(getDate()));
          specialOrderData();
          System.out.println("                                   ");

     }
     @Override
     public void close() {
          System.out.println("4. " + "Оплачено " + Order.sdf.format(getDate()));
          specialOrderData();
          System.out.println("                                   ");

     }

     public void dispatch(){
          System.out.println("5. " + "Специальный товар отправлен! " + Order.sdf.format(getDate()));
          specialOrderData();
          System.out.println("                                   ");

     }


     public void specialOrderData() {

          System.out.println(getNumber() + " - номер cпециального заказа");

     }
}
