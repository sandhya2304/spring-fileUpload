package springmvcupload;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;




@ControllerAdvice
public class MyException 
{
	
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})	
	public String exceptionHandleNull(Model m)
	{
		m.addAttribute("msg","Something went wrong  like null");
		return "error";
	}
	
	//generalize exception 
    @ExceptionHandler(value=Exception.class)	
	public String exceptiongeneric(Model m)
	{
		m.addAttribute("msg","Something went wrong  like null");
		return "error";
	}

}
