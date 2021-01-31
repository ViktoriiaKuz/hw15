package kuznichenko;

public class Customer {

    private String name;
    private String location;

    Customer(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void customerData(){
        System.out.println("Имя покупателя: " + name + "\n"+ "город: " + location);
        System.out.println("                                   ");
    }
}
