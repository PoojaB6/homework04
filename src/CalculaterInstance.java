public class CalculaterInstance {
    public static void main(String[] args){
        // make first instance
        Calculator firstCalculator = new Calculator();
        System.out.println("first calculation:"+firstCalculator.calculatePercentage(2,5)+"and"+firstCalculator.isGreater(3,4));

        //make second instance
        Calculator secondCalculator = new Calculator();
        System.out.println("second calculation:" + secondCalculator.calculatePercentage(3.5, 9.9)+ "and" + secondCalculator.isGreater(7.8, 5.6));
    }
}
