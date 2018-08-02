package proxyDemo01;
/**
 * 动态代理
 * @author jqk
 *
 */
/*
 * 总结：
 * 	jdk的代理让我们在不直接访问某些对象的情况下，通过代理机制也可以访问被代理对象的方法，
 * 	这种技术可以应用在很多地方比如RPC框架，Spring AOP机制，
 * 	但是我们看到jdk的代理机制必须要求被代理类实现某个方法，
 * 	这样在生成代理类的时候才能知道重新那些方法。
 * 	这样一个没有实现任何接口的类就无法通过jdk的代理机制进行代理，
 * 	当然解决方法是使用cglib的代理机制进行代理。
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class reflectAndProxy implements InvocationHandler{
	//需要重写方法invoke
	
	
	private Object object;
	
	public reflectAndProxy(Object object){
		this.object=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("reflectAndProxy invoke begin");
		System.out.println("proxy: "+ proxy.getClass().getName());
		System.out.println("method: "+ method.getName());
		for(Object o : args){
			System.out.println("arg: "+ o);
		}
		//通过反射调用 被代理类的方法
		method.invoke(object, args);
		System.out.println("reflectAndProxy invoke end");

		return null;
	}
	
	public static void main(String[] args) {
		//创建需要被代理的类
		Student s = new Student();
		//这一句是生成代理类的class文件，前提是你需要在工程根目录下创建com/sun/proxy目录，不然会报找不到路径的io异常
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
		//获得加载被代理类的 类加载器
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		//指明被代理类实现的接口
		Class<?>[] interfaces = s.getClass().getInterfaces();
		// 创建被代理类的委托类,之后想要调用被代理类的方法时，都会委托给这个类的invoke(Object proxy, Method method, Object[] args)方法
		reflectAndProxy h = new reflectAndProxy(s);
		//生成代理类
		Person proxy = (Person)Proxy.newProxyInstance(loader, interfaces, h);
		//通过代理类调用 被代理类的方法
		proxy.sayHello("hello", 20);
		proxy.sayGoodBye(true, 100);
		System.out.println("end");
	}

}
