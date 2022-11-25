package mypackage;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,k;
		j = 10; // j gets the value 10.
		j = 5;// j gets the value 5. The previous value is overwritten.
		k = j;// k gets the value 5.
System.out.println("j is : " + k);
System.out.println("k is : " + k);



//              Multiple Assignments
k = j =10;
System.out.println("j is : " + k);
System.out.println("k is : " + k);



	}

}
