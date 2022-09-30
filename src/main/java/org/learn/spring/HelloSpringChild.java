package org.learn.spring;

public class HelloSpringChild {
	private String message;
	private String messageChild;
	public void getMessage() {
		System.out.println("your child inherited message is "+ message);
	}

	 public void setMessage(String message) {
		this.message = message;
	}
	 public void getMessageChild() {
		System.out.println("your child message is "+ messageChild);
	}

	 public void setMessageChild(String message) {
		this.messageChild = message;
	}

	 public void init(){
	    System.out.println("Bean is going through init.");
	 }
	 public void destroy() {
	    System.out.println("Bean will destroy now.");
	 }
}
