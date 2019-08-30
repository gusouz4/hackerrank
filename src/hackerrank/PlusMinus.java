package hackerrank;

import java.util.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	double zero = 0;
    	double pos = 0;
    	double neg = 0;
    	
        for(int i = 0; i<arr.length;i++) {
        	if(arr[i] > 0){
                pos++;
            }else if(arr[i] < 0){
                neg++;
            }else{
                zero++;
            }
        }
        pos = (pos/arr.length);
        neg = (neg/arr.length);
        zero = (zero/arr.length);
        
        System.out.println(String.format("%.6g%n", pos));
        System.out.println(String.format("%.6g%n", neg));
        System.out.println(String.format("%.6g%n", zero));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

