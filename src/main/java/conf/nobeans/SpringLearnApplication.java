package conf.nobeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
@SpringBootApplication
public class SpringLearnApplication {
// Following is the content of the MainApp.java file. Here you need to register a shutdown hook registerShutdownHook() method 
// that is declared on the AbstractApplicationContext class. This will ensure a graceful shutdown and call the relevant destroy methods.
	public static void main(String[] args) {
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(NoBeanConfig.class);
		   
		      HelloNoBeans1 noBeans1 = ctx.getBean(HelloNoBeans1.class);
		      HelloNoBeans2 noBeans2 = ctx.getBean(HelloNoBeans2.class);
		      noBeans2.setMessage("Sapnadip Baidya");
		      noBeans2.getMessage();
	}

}
