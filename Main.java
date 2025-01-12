public class Main {
    public static void main(String[] args) {

        System.out.println("Ниже задание 1");

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

        Rectangle rectangle = new Rectangle(2,4,"Белый", "Черный");
        Triangle triangle = new Triangle(4,6,3, "Голубой", "Желтый");
        Circle circle = new Circle(6, "Красный", "Синий");


        System.out.println();
        System.out.println("Ниже задание 2");
        System.out.println("_________________________________________________");

        rectangle.area();
        rectangle.perimeter();
        rectangle.colorBound(rectangle.boundColor, rectangle.figure_type);
        rectangle.colorLine(rectangle.lineColor, rectangle.figure_type);
        triangle.area();
        triangle.perimeter();
        triangle.colorBound(triangle.boundColor, triangle.figure_type);
        triangle.colorLine(triangle.lineColor, triangle.figure_type);
        circle.area();
        circle.perimeter();
        circle.colorBound(circle.boundColor, circle.figure_type);
        circle.colorLine(circle.lineColor, circle.figure_type);
    }

    static class Rectangle implements Geometry {

        private int a;
        private int b;
        public String figure_type;
        public String lineColor;
        public String boundColor;

        public Rectangle(int a, int b, String lineColor, String boundColor){
            this.a = a;
            this.b = b;
            this.lineColor = lineColor;
            this.boundColor = boundColor;
            this.figure_type = "Прямоугольник";
        }

        @Override
        public void perimeter() {
            int perimeter = (a + b)* 2;
            System.out.println("Периметр заданного прямоугольника равен: " + perimeter);
            System.out.println("___________________________________________________________");
            System.out.println();
        }

        @Override
        public void area() {
            int area = a * b;
            System.out.println("Площадь заданного прямоугольника равна: " + area);
            System.out.println("___________________________________________________________");
            System.out.println();
        }
    }
}
















