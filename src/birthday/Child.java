package birthday;

public class Child extends Parent{
	protected void speak(String wish) {   //愿望只有在生日那天说出口才会实现
		System.out.print(wish);   //说出自己的愿望
	}
}
