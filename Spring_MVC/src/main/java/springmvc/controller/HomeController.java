package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@RequestMapping("/home")
    public String home(Model model){
	//how to add the data in controller with the help of VIEW
	model.addAttribute("name","yashi sharma");	
	model.addAttribute("id",123);
		
    System.out.println("this is home url");
    return"index";
		    }	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help url");
		//creating model and view object
		ModelAndView mav=new ModelAndView();
		//setting the data
		mav.addObject("name","jahnvi");
		mav.addObject("rollno",12345678);
		//setting the view name
		mav.setViewName("help");
		return mav;
		
	}
	
}
	
	

