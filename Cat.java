class Cat extends Animal {
    boolean satiety;
    int eat;

    public Cat(String name, int eat){
        this.animalType = "Кот";
        this.name = name;
        this.satiety = false;
        this.eat = eat;
    }

    public int eating(int eat_count, int eat, String name) {
        if (eat>eat_count){
            System.out.println("В миске не осталось еды для котика " + name + ". Он остался голодным :(");
            System.out.println("Но вы можете вызвать метод addEat чтобы добавить еще еды");
        }
        if (eat <= eat_count){
            eat_count = eat_count - eat;
            System.out.println("Котик " + name + " поел");
            System.out.println("В миске осталось " + eat_count + " еды");
        }
        return eat_count;
    }

    public void checkSatiety(String name, boolean satiety){
        if (satiety){
            System.out.println("Котик " + name + ". теперь сыт!");
        }
        else {
            System.out.println("Котик " + name + "все еще голоден. Накорми его");
        }
    }
}
