package springmvcupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

import jdk.nashorn.internal.ir.RuntimeNode.Request;



@Controller
public class HomeController
{
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello()
	{
		System.out.println("hello sandy");
		return "index";
	}
	
	
	
	
	
}
