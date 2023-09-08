package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Recontroller {
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("this is second handler");
		return "";

	}
}
