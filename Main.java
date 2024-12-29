public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иван Иванов", "Генеральный директор", "iv@mail.ru", "+79996665544", 250000, 55);
        persArray[1] = new Employee("Петр Петрович", "Директор по развитию", "pt@mail.ru", "+79998884455", 127000, 42);
        persArray[2] = new Employee("Эдуард Эдуардович", "Охранник", "ed@mail.ru", "+79997771234", 19000, 21);
        persArray[3] = new Employee("Павел Павлович", "Ведущий разработчик", "pv@mail.ru", "+79995554789", 120000, 28);
        persArray[4] = new Employee(
                "Софья Сергеевна", "Директор по работе с клиентами", "ss@mail.ru", "+79994445896", 138000, 48
        );

        Employee.outputUsers(persArray);

        Park[] attractions = new Park[3];
        attractions[0] = new Park("Колесо обозрения", "Посмотри на город с высока", "9:00 - 18:00", 500);
        attractions[1] = new Park("Центрифуга", "Почувствуй себя космонавтом", "11:00 - 15:00", 500);
        attractions[2] = new Park("Американские горки", "Страшнее пауков", "12:00 - 16:00", 2300);

        Park.outputAttractions(attractions);

    }
}


class Employee {
    public String name;
    public String position;
    public String email;
    public String phone_number;
    public int salary;
    public int age;


    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public static void outputUsers(Employee users[]) {
        System.out.printf("%-3s%-1s%-9s%-1s%-5s%-1s%-14s%-1s%-7s%-1s%-17s%n",
                "Имя", "|",
                "Должность", "|",
                "Email", "|",
                "Номер телефона", "|",
                "Возраст", "|",
                "Заработная плата|"
        );
        System.out.println("___________________________________________________________");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("%-27s%-1s%-40s%-1s%-14s%-1s%-18s%-1s%-10d%-1s%-5d%-1s%n",
                    users[i].name, "|",
                    users[i].position, "|",
                    users[i].email, "|",
                    users[i].phone_number, "|",
                    users[i].salary, "|",
                    users[i].age, "|"
            );
        }
    }
}

class Park{
    public String name;
    public  String description;
    public String time;
    public int price;

    public Park(String name, String description, String time, int price){
        this.name = name;
        this.description = description;
        this.time = time;
        this.price = price;
    }

    public static void outputAttractions(Park attractions[]) {
        System.out.println("Аттракционы");
        System.out.printf("%-12s%-1s%-16s%-1s%-15s%-1s%-16s%n",
                "Название", "|",
                "Описание", "|",
                "Часы работы", "|",
                "Цена|"
        );
        System.out.println("___________________________________________________________");
        for (int i = 0; i < attractions.length; i++) {
            System.out.printf("%-22s%-1s%-30s%-1s%-15s%-1s%-16d%-1s%n",
                    attractions[i].name, "|",
                    attractions[i].description, "|",
                    attractions[i].time, "|",
                    attractions[i].price, "|"
            );
        }
    }
}
