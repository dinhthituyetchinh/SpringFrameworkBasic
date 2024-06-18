public class Employee {
    private int id;
    private String name, address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }
    public void output()
    {
        System.out.println("ID: " +getId());
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
    }
}