package calculatorpak;

import java.util.Scanner;

public class Calculator{

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter Two Number:");
        num1 = obj.nextInt();
        num2 = obj.nextInt();

        Test2 cal=new Test2();
        cal.add(num1,num2);
        cal.sub(num1,num2);
        cal.mul(num1,num2);
        cal.div(num1,num2);
    }

	public static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	
}
class Test2{

    void add(int num1, int num2)
    {
        System.out.println("Addition:"+(num1+num2));
    }
    void sub(int num1,int num2)
    {
        System.out.println("Subtraction:"+(num1-num2));
    }
    void mul(int num1,int num2)
    {
        System.out.println("Multipication:"+(num1*num2));
    }
    void div(int num1, int num2)
    {
        System.out.println("Dividation:"+(num1/num2));
    }
}
