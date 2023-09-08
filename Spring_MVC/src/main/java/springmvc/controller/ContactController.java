package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Registration Page");
		m.addAttribute("Desc ","Home for Programmer");
		
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model){
		
		System.out.println(user);
		
		
		
		return "success";
	}
}

/*
 * public class ContactController {
 * 
 * @RequestMapping("/contact") public String showForm() { return "contact"; }
 */
	
	
/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(@RequestParam("useremail") String
 * Userkaemail, @RequestParam("username") String Userkaname,
 * 
 * @RequestParam("userpass") String Userkapassword,Model model){
 * 
 * System.out.println("useremail :"+Userkaemail);
 * System.out.println("usename :"+Userkaname);
 * System.out.println("userpassword :"+Userkapassword);
 * 
 * 
 * User user =new User(); user.setUseremail(Userkaemail);
 * user.setUsername(Userkaname); user.setUserpass(Userkapassword);
 * 
 * System.out.println(user); // model.addAttribute("name",Userkaname); //
 * model.addAttribute("email",Userkaemail); //
 * model.addAttribute("password",Userkapassword); //
 * 
 * 
 * model.addAttribute("user",user); return "success"; } }
 */
