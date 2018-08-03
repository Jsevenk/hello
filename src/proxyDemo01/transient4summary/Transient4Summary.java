package proxyDemo01.transient4summary;
/**
 * 关键字transient总结
 * @author jqk
 *
 */
public class Transient4Summary {
	/*
	 * 作用：让某些被修饰的成员属性变量不被序列化
	 */
	/*
	 * 1、类中的字段值可以根据其它字段推导出来，如一个长方形类有三个属性：长度、宽度、面积（示例而已，一般不会这样设计），那么在序列化的时候，面积这个属性就没必要被序列化了；
	 * 2、其它，看具体业务需求吧，哪些字段不想被序列化；
	 * PS1，记得之前看HashMap源码的时候，modCount这个字段是用transient修饰的，
	 * 没必要对这个modCount字段进行序列化，因为没有意义，modCount主要用于判断HashMap是否被修改
	 * （像put、remove操作的时候，modCount都会自增），对于这种变量，一开始可以为任何值，0当然也是可以
	 * （new出来、反序列化出来、或者克隆clone出来的时候都是为0的），没必要持久化其值。
	 * PS2，ArrayList源码中也有 对象数组
	 * private transient Object[] elementData;
	 * 
	 * PS3 目的：节省存储空间
	 * 
	 * oracle将取消序列化功能
	 * 因为它带来了许多严重的安全问题（如序列化存储安全、反序列化安全、传输安全等），据统计，至少有3分之1的漏洞是序列化带来的（反序列化漏洞）
	 * 但是  现在的持久化框架和分布式技术中，都需要利用序列化来传输对象，如：Hibernate、Mybatis、Java RMI、Dubbo等。
	 * 
	 * 未来：
	 * 据悉，在未来的 Java 版本中，将会有一个迷你序列化框架来替代现在的古董序列化技术。
	 * 这个新框架将会支持开发者值入序列化引擎，并支持如 JSON、XML 格式，以一个更安全的方式来序列化对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
