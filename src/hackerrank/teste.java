package hackerrank;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		int zero = 0;
    	int pos = 0;
    	int neg = 0;
    	int arr[] = {1,0,3,-1,0};
    	int divpos;
    	
    	
    	for(int i = 0; i<arr.length;i++) {
        	if(arr[i] > 0){
                pos++;
            }else if(arr[i] < 0){
                neg++;
            }else{
                zero++;
            }
        }
    	divpos = pos / arr.length;
    	
    	JOptionPane.showMessageDialog(null, pos);
	}
}