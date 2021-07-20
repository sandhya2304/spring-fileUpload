package springmvcupload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController 
{
	
	@RequestMapping(value="/file",method=RequestMethod.GET)
	public String uploadForm()
	{
		System.out.println("helo");
		
		String s  = null;
		System.out.println(s.charAt(0));
		
		return "imageupload";
	}
	

	
	
	@RequestMapping(value="/uploadImage",method=RequestMethod.POST)
	public String image(@RequestParam ("file") CommonsMultipartFile file,HttpSession session,Model m) 
	{
		System.out.println("image uplaod");
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		
		
		 byte[] b =  file.getBytes();
		 
		 //save this to server
		 
		 String path =  session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+
		                                                  File.separator+"image"+File.separator+file.getOriginalFilename();
		 System.out.println(path);
		 
		 try
		 {
		 
		 FileOutputStream out = new FileOutputStream(path);
		 out.write(b);
		 
		 out.close();
		 
		 System.out.println("file uploaded");
		 }catch(IOException ie)
		 {
			 System.out.println(ie.getMessage());
		 }
		 
		 //model tos end data
		 m.addAttribute("name",file.getOriginalFilename());
		 
		 
		 
		return "success";
	}

}
