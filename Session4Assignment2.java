import java.util.Arrays;

public class Session4Assignment2 {

	public static void main(String[] args) {
		int[] array;
		array = new int[6];
		array[0]= 30;
		array[1]= 10;
		array[2]= 20;
		array[3]= 50;
		array[4]= 40;
		array[5]= 60;
		Arrays.sort( array );
		int i;
		for(i=0;i<array.length; i++){
		System.out.println("num: "+ array[i]);
		}

	}
}
