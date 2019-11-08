package Package01;

/*
Given int variables k and total that have already been declared, use a do...while loop 
to compute the sum of the squares of the first 50 counting numbers, and store this value 
in total. Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total. 
Use no variables other than k and total. Print out value of variable total. 
 * 
 */
public class Q104_Compute {

	public static void main(String[] args) {

		int k = 1;
		int total = 0;
		int kk = 1;
		do {
			kk = k * k;
			total = total + kk;
			k++;
		} while (k < 51);
		System.out.println(total);
	}
}
