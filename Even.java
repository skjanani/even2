package janani;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		n1=ja.nextInt();
//for(int i=1;i<=10;i++){
	if((n*n1)%2==0){
		System.out.println("even");
	}
	else{
		System.out.println("odd");
	}
	
}
	}


