package proxyDemo01;
/**
 * 讨论CGlib与jdk的动态代理区别
 * @author jqk
 *
 */
public class CGlibWithProxy {
	/*
	 * Spring AOP，是通过动态代理实现的。
	 */
	//1.区别
	/*
	 * 	JDK动态代理只能对实现了接口的类生成代理，而不能针对类
	 * 	CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法（继承）
	 */
	//2.Spring使用动态代理
	/*
	 * (1)当Bean实现接口时，Spring就会用JDK的动态代理
	 * (2)当Bean没有实现接口时，Spring使用CGlib是实现
	 * (3)可以强制使用CGlib（在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>）
	 */
	//3.CGlib比JDK快？
	/*
	 * 	(1)	使用CGLib实现动态代理，CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，比使用Java反射效率要高。
	 * 		唯一需要注意的是，CGLib不能对声明为final的方法进行代理，因为CGLib原理是动态生成被代理类的子类。
	 * 	(2)	在对JDK动态代理与CGlib动态代理的代码实验中看，1W次执行下，JDK7及8的动态代理性能比CGlib要好20%左右。
	 */
	//简书作者的结论：
	//https://www.jianshu.com/p/1aaacf92e2cd
	/*
	 * 1.同样情况下,cglib两种实现方式，invokeSuper + setSuperClass 永远比 invoke + setInterfaces慢
	 * 2.cglib invoke + setInterfaces 在方法数量较少的时候,在函数平均调用的情况下 比jdkProxy快,随着函数增多，优势越来越不明显,到达某个数量级一定比jdk动态代理慢
	 * 3.cglib invoke + setInterfaces 在调用特定函数(在switch中靠后的case) 会比jdk动态代理慢
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
