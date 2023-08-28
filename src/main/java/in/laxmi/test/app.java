package in.laxmi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.laxmi.AppConfig;

public class app {

	public static void main(String[] args) {
		ApplicationContext cnxt = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
