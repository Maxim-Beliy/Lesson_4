public class Main {
    public static void main(String[] args) {

        String[][] array = {{"1", "2"}, {"р", "4"}};
        Type type = new Type();
        System.out.println("Сумма всех элементов = " + type.changeType(array));



        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(" " + array[x][y] + " ");
            }
        }
    }
}

class Type{

    Type(){
    }

    int changeType(String[][] array){
        int result = 0;
        if (array.length <= 2) {
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {

                    try {
                        result = result + Integer.parseInt(array[x][y]);
                    } catch (NumberFormatException nfe) {
                        System.out.println(nfe.getMessage());
                    }
                }
            }
        }
        return result;
    }
}