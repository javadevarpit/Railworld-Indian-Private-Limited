package Task;

public class Employee {
    private String name;
    private int street_no;
    private String city;
    private int pin;

    public String getName(){
        return name;
    }
    public int getStreet_No(){
        return street_no;
    }
    public String getCity(){
        return city;
    }
    public int getPin(){
        return pin;
    }
    public void setName(String name , int street_no , String city, int pin) {
        this.name = name;
        this.street_no = street_no;
        this.city = city;
        this.pin = pin;
    }


    }


