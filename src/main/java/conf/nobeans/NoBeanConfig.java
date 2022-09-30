package conf.nobeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoBeanConfig {

	 @Bean
	 public HelloNoBeans1 helloNoBeans1() {
		 return new HelloNoBeans1();
	 }
	 // same as 
	 //<beans>
	 //   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
	 // </beans>
	 @Bean
	 public HelloNoBeans2 helloNoBeans2() {
		 return new HelloNoBeans2();
	 }
	 
	 
}
