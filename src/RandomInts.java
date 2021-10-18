public class RandomInts {

    protected int[] numbers;

    public RandomInts(){
        numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10)+1;
        }

    }

    public int[] getNumbers() {
        return numbers;
    }


}
