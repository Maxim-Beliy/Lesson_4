class Misca{
    int eat_count;

    public Misca(int eat_count){
        this.eat_count = eat_count;

        if (eat_count<0){
            System.out.println("В миске не может быть отрицательного количества еды");
        }
    }

    public int addEat(int leftover_eat, int eat_count){

        System.out.println("В миску добавили " + eat_count + " еды");
        return leftover_eat + eat_count;
    }
}