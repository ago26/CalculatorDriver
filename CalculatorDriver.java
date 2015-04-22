

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] num = new double [3];
		num[0] = 0.0;
		num[1] = 15.0;
		num[2] = 20.0;
		System.out.println("The average of the two numbers are " + Calculator.getAverage(num));
		System.out.println("The sum of the two numbers are " + Calculator.getSum(num));
		System.out.println("The product of the two numbers are " + Calculator.getProduct(num));
		

		Calculator calculator = new Calculator();
		
