/**
 * 
 */
package com.vishist.training;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ADMIN
 *
 */
@Controller 
public class AddController {

	  
	 // USING PARENT HttpServletRequest and HttpServletResponse >>>>>just using SOP statement
 	 @RequestMapping("/add")
	public void add(HttpServletRequest request, HttpServletResponse response) {

		int i = Integer.parseInt(request.getParameter("t1"));

		int j = Integer.parseInt(request.getParameter("t2"));

		int k = i + j;

		 System.out.println("this is my first spring mvc programm!!!!!!!!"+k);

		 
	} 
	
	
	
	
	
	// USING PARENT HttpServletRequest and HttpServletResponse>>>>> Returning String directly
	 	/* @RequestMapping("/add")
		public @ResponseBody String add(HttpServletRequest request, HttpServletResponse response) {

			int i = Integer.parseInt(request.getParameter("t1"));

			int j = Integer.parseInt(request.getParameter("t2"));

			int k = i + j;

			 System.out.println("this is my first spring mvc programm!!!!!!!!"+k);

			 return (Integer.toString(k));
			 
		} 
	 	 */
	 	 
	 	 
		   
	
	
	// USING PARENT HttpServletRequest and HttpServletResponse
	 	/*@RequestMapping("/add")
		public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

			int i = Integer.parseInt(request.getParameter("t1"));

			int j = Integer.parseInt(request.getParameter("t2"));

			int k = i + j;

			ModelAndView mv = new ModelAndView();

			mv.setViewName("display.jsp");

			mv.addObject("result", k);

			return mv;
		}*/
	
 	 
 	 
	
	
	 // USING Annotation without using: PARENT HttpServletRequest and HttpServletResponse
	/* @RequestMapping("/add")
	   public ModelAndView add(@RequestParam(value="t1") int firstValue,@RequestParam(value="t2") int secondValue){
					
           int k=  firstValue+secondValue;
		               
           ModelAndView mv=new ModelAndView("display.jsp");// ModelAndView mv=new ModelAndView("viewName.extension");
		                
		   mv.addObject("result", k); // data to be populated to the browser:::result= us in the view page to retrieved the object,K-----is the object to be pass.		               
			    
		   return mv; 
		          
	    } */ 
	
 	 
 	 
	 
	 // USING Annotation without using: PARENT HttpServletRequest and HttpServletResponse
	 /* @RequestMapping(value="/add", method=RequestMethod.POST)
	   public ModelAndView add(@ModelAttribute("student") RequestData requestData){
					
		  System.out.println("FIRST VALUE:--"+requestData.firstValue);
		   System.out.println("SECOND VALUE:--"+requestData.secondValue);
		   
		   int firstRetrievedValue=requestData.firstValue; 
	
		   int secondRetrievedValue=requestData.secondValue; 
		   
		   int k=  firstRetrievedValue+secondRetrievedValue;
		               
           ModelAndView mv=new ModelAndView("display.jsp");// ModelAndView mv=new ModelAndView("viewName.extension");
		                
		   mv.addObject("result", k); // data to be populated to the browser:::result= us in the view page to retrieved the object,K-----is the object to be pass.		               
			    
		   return mv; 
		          
	    }  */
	 
	
	
	 
	 
	
}

