package com.simpleWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simpleWorld.Creatures.ACharacter;
import com.simpleWorld.Creatures.IMoveActions;

@RestController
@Component
public class HelloController {

	@Autowired HelloProperties props;
	@Autowired @Qualifier("Human") 	ACharacter postac;
	@Autowired @Qualifier("Monster") ACharacter potwor;
	@Value("${human.name}") private String name;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {

		/**Poniżej jak uruchomic apkę testującą inicjalizwanie obiektów przez interfejsy
		 * http://localhost:8888/hello?name=yourname
		 */
		
		String przywitanie = props.getGreeting() + name + ". My name is " + name + ".";	
		System.out.println(przywitanie);
		return przywitanie + postac.move("Przód") ;
	}
}
