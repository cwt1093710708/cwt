/**
*@program:
*@Description:
*@author:
*@date:
*/
//Age.java
import java .until.Scanner;
public class Age{
    public static void main(String[] args){
	    int MINOR = 35;
		System.out.println("请输入你的年龄")
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.println("你的年龄是"+age);
		if(age < MINOR)
		    System.out.println("年龄是美好的，");
			System.out.println("年龄决定了你的精神世界，好好珍惜吧！")；
	}
}