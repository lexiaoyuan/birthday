# birthday
将自己的生日愿望用java语言表达会怎么样呢？
>将这些注释连起来就像是一首诗，不，这就是一首诗


>将下面的内容都打包给生日<br>
>把生日愿望写成一个类<br>		
>我是我父母的孩子<br>	
>定义一个属于自己的年龄<br>		
>需要执行的时候<br>				
>想着...<br>			
>回望过去的一年又一年<br>			
>最感谢的就是自己的父母<br>			
>最想说的话就是谢谢<br>			
>即使结束了，仍然想再说一声谢谢<br>
>试着捕获过去的异常<br>			
>想要为过去的异常做点什么，却不知道如何实现<br>			
>只能将其抛出，直面它<br>		
>最后，再对过去说声谢谢<br>		
>时间又回到现在<br>				
>想着...<br>			
>年龄会不断的增长，但不知何时才会再循环<br>			
>对于未来<br>			
>我想说：“你好，世界！”<br>		
>也许能抓住将来的异常<br>			
>那么同样,抛出它，直面它<br>		
>最后，再次说一声谢谢！<br>		


- BirthdayWish.java:
```java
package birthday;   //将下面的内容都打包给生日

public class BirthdayWish {   //把生日愿望写成一个类
	
	private static Child 徐仕成=new Child();   //我是我父母的孩子
	private static int age = 20;   //定义一个属于自己的年龄
	
	public static void main(String[] args) {   //需要执行的时候
		
		try {   //想着...
			do {  
				age--;  //回望过去的一年又一年
				Parent 父母 = new Parent(); //最感谢的就是自己的父母
				徐仕成.speak("谢谢");   //最想说的话就是谢谢
			} while (age!=0);
			徐仕成.speak("谢谢");  //即使结束了，仍然想再说一声谢谢
		} catch (Exception e) {   //试着捕获过去的异常
			//想要为过去的异常做点什么，却不知道如何实现
			throw e;  //只能将其抛出，直面它
		} finally {
			徐仕成.speak("谢谢\n");  //最后，再对过去说声谢谢
		}
		
		age = 20;  //时间又回到现在
		
		try {  //想着...
			age++;  //年龄会不断的增长，但不知何时才会再循环
			//对于未来
			徐仕成.speak("你好，世界！");   //我想说：“你好，世界！”
		} catch (Exception e) { //也许能抓住将来的异常
			throw e;  //那么同样，抛出它，直面它
		} finally {
			徐仕成.speak("谢谢！\n");  //最后，再次说一声谢谢！
		}
	}

}
```
> Child.java和Parent.java代码在这里保密

