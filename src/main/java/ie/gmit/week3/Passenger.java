package ie.gmit.week3;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private long phone;
    private int age;

    public Passenger(String title, String name, String id, long phone, int age) {
        this.title = title;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }


    public String getTitle() { return title; }


}
