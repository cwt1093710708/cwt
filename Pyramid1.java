/**
*program: cwt
*Description:
*author:
*data: 2019-9-18
*/
import java.util.Scanner;

public class Pyramid{
    public static void main(String[] arge){
	
	System.out.print("请输入金字塔的层数：")；
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	for(int j = 1; j <= n; j++){
		int times = j;
		while(times != 0){
			System.out.printf("*");
			times--;
		    }
		System.out.printf("\n");	
	    }
	}
}