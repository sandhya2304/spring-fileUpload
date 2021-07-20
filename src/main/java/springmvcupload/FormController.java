package springmvcupload;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class FormController
{
	
	
	@RequestMapping(value="/myform")
	public String form()
	{
		
		String s = null;
		System.out.println(s.length());
		return "form";
	}
	
	
	
	
	@RequestMapping(value="/doRegister",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Student student,BindingResult results)
	{
		
		if(results.hasErrors())
		{
			return "form";
		}
		System.out.println(student );
		
		return "success";
	}
	
	
	

}
