package sampleProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("qa")

public class sampleQaController {

	@Autowired
	Profile1 pro;
	
	@RequestMapping("/welcome")
	public String welcomepage()
	{
		return "welcome from qa"+" "+pro.getTitle() ;
	}
	
	
	
	
	
}
