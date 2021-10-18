public class RandomInts {

    protected int[] numbers;

    public RandomInts(){
        numbers = new int[(int)(Math.random()*100)];
    }

    public int[] getNumbers() {
        return numbers;
    }


}
