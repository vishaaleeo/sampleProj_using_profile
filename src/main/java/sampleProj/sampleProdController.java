package sampleProj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("prod")
public class sampleProdController {

	@Autowired
	Profile1 pro;
	@RequestMapping("/welcome")
	public String welcomeProd()
	{
		return "welcome from prod"+" "+pro.getTitle();
	}
}