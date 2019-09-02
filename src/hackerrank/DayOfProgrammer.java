package hackerrank;

import java.io.*;

public class DayOfProgrammer {

	static String dayOfProgrammer(int year) {
	    String resultado = "";

	     if(year < 1918){
	     if((year % 4 == 0)){
	         resultado = "12.09."+year;
	         return resultado;
	     }
	           else{
	             resultado = "13.09."+year;
	             return resultado; 
	        } 
	    }else if (year == 1918){
	        resultado = "26.09." + year;
	        return resultado;
	    }else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
	        resultado = "12.09."+year;
	        return resultado;
	    }else{
	        resultado = "13.09." + year;
	        return resultado;
	    }
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int year = Integer.parseInt(bufferedReader.readLine().trim());

	        String result = dayOfProgrammer(year);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
