package hackerrank;

	import java.io.*;
	import java.util.*;

	public class TimeConversion {

	    static String timeConversion(String s) {
	         String listTime[] = s.split(":");
	         String hour = listTime[0];
	         String minutes = listTime[1];
	         String secounds = listTime[2].substring(0, 2);
	         String horario = listTime[2].substring(2, 4);
	         if(horario.equals("AM")){
	             if(hour.equals("12"))
	                    hour="00";
	 
	             return hour+":"+minutes+":"+secounds;
	         }else{
	             if(!hour.equals("12")){
	                 int h = Integer.parseInt(hour); 
	                 h = h +12; 
	                 hour =""+h; 
	             }
	             return hour+":"+minutes+":"+secounds;
	         }
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scan.nextLine();

	        String result = timeConversion(s);

	        bw.write(result);
	        bw.newLine();

	        bw.close();
	    }
	}
