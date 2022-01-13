package Assignment_101_AnhNT241;

import java.util.Scanner;

public class LogicalExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int s1;
		int s2;
		System.out.println("Nhập số nguyên đầu tiên: ");
		s1=sn.nextInt();
		System.out.println("Nhập số nguyên thứ 2: ");
		s2=sn.nextInt();
		if(s1>s2 && s1!=s2 && s1>=s2)
		{
			System.out.println(s1+"!="+s2);
			System.out.println(s1+">"+s2);
			System.out.println(s1+">="+s2);
		}
		else if(s1<s2 && s1!=s2 && s1<=s2)
		{
			System.out.println(s1+"!="+s2);
			System.out.println(s1+"<"+s2);
			System.out.println(s1+"<="+s2);
		}
		else {
			System.out.println("Vui lòng nhập lại");
		}

	}

}
