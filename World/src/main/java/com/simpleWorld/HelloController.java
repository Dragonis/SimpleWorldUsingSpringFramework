package com.simpleWorld;


import java.text.DateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simpleWorld.Api.UsersRepository;
import com.simpleWorld.Creatures.ACharacter;
import com.simpleWorld.Domain.User;

@RestController
@Component
public class HelloController {

	@Autowired HelloProperties props;
	@Autowired @Qualifier("Human") 	ACharacter postac;
	@Autowired @Qualifier("Monster") ACharacter potwor;
	@Value("${human.name}") private String name;
	ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
	User userA = context.getBean("userA", User.class);
	User userB = context.getBean("userB", User.class);


	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {

		/**Poniżej jak uruchomic apkę testującą inicjalizwanie obiektów przez interfejsy
		 * http://localhost:8888/hello?name=yourname
		 */
		
		gregorianCalendar();
		wczytajUsera();
		String przywitanie = props.getGreeting() + name + ". My name is " + name + ".";	
		System.out.println(przywitanie);
		return przywitanie + postac.move("Przód") ;
	}

	private void gregorianCalendar() {
		/*Locale locale = Locale.getDefault();
		Calendar calendar = GregorianCalendar.getInstance(locale);
		DateFormat formatter = SimpleDateFormat.getInstance();
		System.out.println(formatter.format(calendar.getTime()));
		*/
		Calendar calendar = context.getBean("calendar",Calendar.class);
		DateFormat formatter = (DateFormat) context.getBean("formatter");
		System.out.println(formatter.format(calendar.getTime()));
	}

	private void wczytajUsera() {
		
		System.out.println(userA.toString());
		System.out.println(userB.toString());
		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);
		User user = usersRepository.createUser("Łukasz", 22);
		
		/*
		Logger logger = new LoggerImpl();
		UsersRepository userRepository = new UsersRepositoryImpl();
		userRepository.setLogger(logger);
		User user = userRepository.createUser("Janek");
		*/
	}
}
