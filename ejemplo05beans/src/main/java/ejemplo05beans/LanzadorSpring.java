package ejemplo05beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		MorcillaDeLeon morcilla= (MorcillaDeLeon) applicationContext.getBean("MorcillaDeLeon");
		System.out.println(morcilla);
		morcilla.setColor("Esta q te mueres");
		morcilla.setSabor("Esta es de Villada");
		MorcillaDeLeon otramorcilla= (MorcillaDeLeon) applicationContext.getBean("MorcillaDeLeon");
		System.out.println(morcilla); //bean si no pones nada usa patron Singleton, solo 1 objeto en toda la maquina virtual.
		System.out.println(otramorcilla);
	}
}
