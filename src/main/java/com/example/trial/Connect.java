package com.example.trial;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/web")
public class Connect {
	
	@GetMapping(value="/print")
	public String world()
	{
		return "Hello World";
	}
	
	@GetMapping(value="/combine/{a}/{b}")
	/*public String combine(@PathVariable String a,@PathVariable String b)
	{
		return a.concat(b);
	}*/
	
	//if path variable is different,should give like given below
	public String combine(@PathVariable("a") String x, @PathVariable("b") String y)
	{
		return x.concat(y);
	}
	
	
	@GetMapping(value="/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
	
	
	
	@GetMapping(value="/prime/{a}")
	public String findPrime(@PathVariable int a)
	{
		boolean count=false;
		boolean count1=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count=true;
			}
			else
			{
				count1=false;
			}
		}
		if(count==true)
		{
		return a+" is not prime num";
		}
		else 
		{
			return a+" is prime num";
		}
	}
	
	@GetMapping(value="/check")
	public String checkLog(@RequestParam("name") String a, @RequestParam("password") String b)
	{
		if(a.equalsIgnoreCase("priya") && b.equalsIgnoreCase("123@98"))
		{
			return "Valid Person";
		}
		else
		{
			return "Invalid Person";
		}
	}
	
	/*@GetMapping(value="/checkthis/{name}/{password}")
	public String checkPathParam(@PathParam("name") String x, @PathParam("password") String y)
	{
		if(x.equalsIgnoreCase("priya") && y.equalsIgnoreCase("123"))
		{
			return "Valid Person";
		}
		else
		{
			return "Invalid Person";
		}
		
		
	}*/

}
