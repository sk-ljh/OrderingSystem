package sk.com.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class logincontroller {
	
	 @RequestMapping("/index")
	 public String index() {
		 		System.out.println( "user index. . ..dsadasdad.." );
		 		return "index";
	 }
}

