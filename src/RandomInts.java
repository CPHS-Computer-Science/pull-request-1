public class RandomInts {

    protected int[] numbers;

    public RandomInts(){
        numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

    }

    public int[] getNumbers() {
        return numbers;
    }


}
