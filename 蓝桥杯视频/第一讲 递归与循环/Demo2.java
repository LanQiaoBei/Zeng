public class Demo2
{
	// 递归打印从begin到end
	public static void f(int begin,int end){
		if(begin>end)	return;
		System.out.println(begin);
		f(begin+1,end);		// 在这里begin能不能写为begin++
							// 不能，因为begin++，是先运行然后再加1，结果不会有任何变化，但是这里却可以写成++begin
		//f(begin++,end);	错误
		//f(++begin,end);	正确
	}

	public static void main(String[] args) {
		f(0,9);
	}
}