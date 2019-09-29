/**
*@program:
*@Description:
*@author:
*@date:
*/
public class Array1{
	public static void main(String args[]){
		int x[]=new int[100];
		int sum=0;
		for (int i=0;i<=99;i++){
			x[i]=i+1;
			sum=sum+x[i];
		}
		System.out.println(sum);
		
		for (int i=0;i<=99;i++){
			System.out.println("x["+i+"]="+x[i]);
		}
		
	}
}