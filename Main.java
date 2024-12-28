public class Main {

    public static class Employee {
        String name;
        String position;
        String email;
        String phone_number;
        int salary;
        int age;


        public Employee(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }


        public void print() {
            System.out.println(this);
        }

        public void main(String[] args) {

            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Иван Иванов", "Генеральный директор", "iv@mail.ru", "+79996665544", 250000, 55);
            persArray[1] = new Employee("Петр Петрович", "Директор по развитию", "pt@mail.ru", "+79998884455", 127000, 42);
            persArray[2] = new Employee("Эдуард Эдуардович", "Охранник", "ed@mail.ru", "+79997771234", 19000, 21);
            persArray[3] = new Employee("Павел Павлович", "Ведущий разработчик", "pv@mail.ru", "+79995554789", 120000, 28);
            persArray[4] = new Employee("Софья Сергеевна", "Директор по работе с клиентами", "ss@mail.ru", "+79994445896", 138000, 48);
        }

    }
}