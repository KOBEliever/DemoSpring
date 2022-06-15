import com.cqu.spring.hello.A;
import com.cqu.spring.hello.HelloSpring;
import com.cqu.spring.print.Printer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    //1.创建springIOC容器/读取核心配置文件
    public static ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void testHello() {
        //2.从IOC容器中获取对象 指定id
        HelloSpring helloSpring = (HelloSpring) classPathXmlApplicationContext.getBean("helloSpring");
        System.out.println(helloSpring.getHello() + "," + helloSpring.getSpring());
    }

    @Test
    public void testA() {
        A bean = classPathXmlApplicationContext.getBean(A.class);
        System.out.println(bean.getHelloSpring().getHello() + "," + bean.getHelloSpring().getSpring());
    }

    /**
     * 测试spring组装打印机
     */
    @Test
    public void printWork() {
        Printer bean = classPathXmlApplicationContext.getBean(Printer.class);
        bean.work();
    }

}
