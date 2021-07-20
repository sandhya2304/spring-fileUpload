package springmvcupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.RedirectView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;



@Controller
public class HomeController
{
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String hello()
	{
		System.out.println("hello sandy");
		return "home";
	}
	
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public RedirectView search(@RequestParam ("query") String query)
	{
		String url = "https://www.google.com/search?q="+query;
		
		RedirectView view = new RedirectView();
		view.setUrl(url);
		
		return view;
	}
	
	
	
	
}
