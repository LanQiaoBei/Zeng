public class Demo1
{
	// 递归打印从0到9
	public static void f(int n){
		if(n>0) f(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		f(9);
	}
}