import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
		System.out.print("请输入年龄");
	    int ages = scan.nextInt();
		if(ages <= 15){
			a=1;
		}
		if(ages > 15){
			a=2;
		}	
		switch(a){
		    case 1:
			    System.out.println("小姐姐");
				break;
			default:
			    System.out.println("大姐姐");
				break;
		}
	}
}