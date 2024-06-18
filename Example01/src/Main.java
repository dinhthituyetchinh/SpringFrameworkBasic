public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Tuyet Chinh");
        emp.setAddress("Gia Lai");
        emp.output();
        Employee emp2 = new Employee(2,"Ngọc Văn", "Phú Yên");
        emp2.output();
    }
}