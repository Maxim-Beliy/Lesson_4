public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Корица", 6);
        cats[1] = new Cat("Лавруша", 13);
        cats[2] = new Cat("Элли", 8);

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Бобик");
        dogs[1] = new Dog("Шарик");


        dogs[0].swim(-1);
        dogs[1].run(200);

        Misca plate = new Misca(20);
        for (int i = 0; i < cats.length; i++){
            if (plate.eat_count >= cats[i].eat){
                plate.eat_count = cats[i].eating(plate.eat_count, cats[i].eat, cats[i].name);
                cats[i].satiety = true;
            }
            else cats[i].eating(plate.eat_count, cats[i].eat, cats[i].name);
        }

        for (int i = 0; i < cats.length; i++){
            cats[i].checkSatiety(cats[i].name, cats[i].satiety);
        }

        plate.eat_count = plate.addEat(plate.eat_count, 15);

        for (int i = 0; i < cats.length; i++){
            if (!cats[i].satiety){
                if (plate.eat_count >= cats[i].eat){
                    plate.eat_count = cats[i].eating(plate.eat_count, cats[i].eat, cats[i].name);
                    cats[i].satiety = true;
                }
                else cats[i].eating(plate.eat_count, cats[i].eat, cats[i].name);
            }
        }

        for (int i = 0; i < cats.length; i++){
            cats[i].checkSatiety(cats[i].name, cats[i].satiety);
        }

        System.out.println("Количество собак: " + dogs.length);
        System.out.println("Количество котов: " + cats.length);
    }
}


class Animal {
    public String name;
    public String animalType;

    public Animal() {
    }

    public void animalInfo(){
        System.out.println("__________________________________________");
        System.out.println(("Вид животного: " + animalType));
        System.out.println("Кличка: " + name);
        System.out.println();
    }

    public void run(int distance){
        System.out.println("__________________________________________");

        if (distance < 0){
            System.out.println("Такого расстояния не существует. Введите корректные данные");
        }

        if (distance == 0){
            System.out.println(animalType + " " + name + " Не бежал(-а)");
        }

        if (animalType.equals("Собака")){
            if (distance > 0 && distance <= 500) {
                System.out.println(animalType + " " + name + " Пробежал(-а) " + distance + " метров");
            }
            if ( distance > 500) {
                System.out.println(animalType + " " + name + " Пробежал(-а) 500 метров, он(она) устал(-а).");
                System.out.println("Оставшиеся " + (distance-500) + " метров добежит позже");
            }
        }

        if (animalType.equals("Кот")){

            if (distance > 0 && distance <= 200) {
                System.out.println(animalType + " " + name + " Пробежал(-а) " + distance + " метров");
            }
            if ( distance > 200) {
                System.out.println(animalType + " " + name + " Пробежал(-а) 200 метров, он(а) устал(-а).");
                System.out.println("Оставшиеся " + (distance-200) + " метров добежит позже");
            }
        }
        System.out.println();
    }

    public void swim(int distance){
        System.out.println("__________________________________________");
        if (distance < 0){
            System.out.println("Такого расстояния не существует. Введите корректные данные");
        }
        if (animalType.equals("Кот")){
            System.out.println("Алло! Коты не умеют плавать");
            if (distance == 0){
                System.out.println("Коты все равно не умеют плавать!!! Даже 0 метров!!!");
            }
        }
        if (animalType.equals("Собака")){
            if (distance == 0){
                System.out.println(animalType + " " + name + " Не плыл(-а)");
            }
            if (distance > 0 && distance <= 10) {
                System.out.println(animalType + " " + name + " Проплыл(-а) " + distance + " метров");
            }
            if ( distance > 10) {
                System.out.println(animalType + " " + name + " Проплыл(-а) 10 метров, он(а) устал(-а).");
                System.out.println("Оставшиеся " + (distance-10) + " метров проплывёт позже");
            }
        }
        System.out.println();
    }
}

class Dog extends Animal {
    public Dog(String name){
        this.animalType = "Собака";
        this.name = name;
    }
}

class Cat extends Animal {
    public int eat;
    public boolean satiety;

    public Cat(String name, int eat){
        this.animalType = "Кот";
        this.name = name;
        this.eat = eat;
        this.satiety = false;
    }

    public int eating(int eat_count, int eat, String name) {
        if (eat_count < eat){
            System.out.println("В миске не осталось еды для котика " + name + ". Он остался голодным :(");
            System.out.println("Но вы можете вызвать метод addEat чтобы добавить еще еды");
        }
        if ((eat_count - eat) >= 0){
            eat_count = eat_count - eat;
            System.out.println("Котик " + name + " поел");
            System.out.println("В миске осталось " + eat_count + " еды");
        }
        return eat_count;
    }

    public void checkSatiety(String name, boolean status) {
        if (status){
            System.out.println("Котик " + name + " теперь сыт");
        }
        else System.out.println("Котик " + name + " не поел. Покорми его!");
    }
}

class Misca {
    int eat_count;

    public Misca(int eat_count) {
        this.eat_count = eat_count;

        if (eat_count < 0); {
            System.out.println("В миске не может быть отрицательного количества еды");
        }
    }

    public int addEat(int leftover_eat, int eat_count){
        int all_eat = leftover_eat + eat_count;
        System.out.println("В миску добавили " + eat_count + " еды");
        return all_eat;
    }
}