package conf.nobeans;

import org.apache.logging.log4j.message.Message;

public class HelloNoBeans2 {
private String message;

public void getMessage() {
	System.out.println("your message inside getter of HelloNoBeans2 is => " +this.message);
}

public void setMessage(String message) {
	this.message = message;
}
}
