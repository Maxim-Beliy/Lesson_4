public class Animal {
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