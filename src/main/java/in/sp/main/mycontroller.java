package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller {

	@GetMapping("/hellopage")
public ModelAndView open()
{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
	return mav;
}
}
