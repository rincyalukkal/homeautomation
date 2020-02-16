package com.uttara.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uttara.services.ServiceInterface;





@Controller
public class ControllerServlet {

	@Autowired
	ServiceInterface service;

	
	
	//*******************************************************
	@RequestMapping({"/","/home"})
	public String ShowHome()
	{
		return "Home";
		
	}
	//********************************************************
	@RequestMapping("/adddevice")
	public String Showadddevice()
	{
		
		return "Add_devices";
	}

	//*********************************************************
	
	
	@RequestMapping("/add_device_name")
	public String Showadd_device_name(@ModelAttribute("devices") @Valid Device bean,Operations bean1,BindingResult result, Model model)
	{
		System.out.println("device = "+bean);
		bean1.setStatus("OFF");
		bean1.setDv(bean);
		System.out.println(bean);
		System.out.println(bean1);
			String msg = service.createDevice(bean,bean1);
			model.addAttribute("msg", msg);
			
			return "Success";
	
		
		
	}
	
	//**********************************************************
	
	
	@RequestMapping("/listdevice")
	public String showDevices(Model m)
	{
		List<Device> d = service.listDevices();
		m.addAttribute("listd", d);
		return "Display";
	}
	
	
	

	//**********************************************************
	
	
		@RequestMapping("/setop")
		public String showoppage(Model m)
		{
			List<Device> d = service.listDevices();
			m.addAttribute("listd", d);
			
			return "Operations";
		}
	
		
		
		//**********************************************************
		
		
			@RequestMapping("/onstatus")
			public String showoppage(Long sl,Model m)
			{     
				System.out.println(sl);
				String msg = service.SetDevicestatus(sl);
				
				m.addAttribute("msg", msg);
				
				return "Success";
		
			}
			
			
			@RequestMapping("/offstatus")
			public String showoppage1(Long sl,Model m)
			{     
				System.out.println(sl);
				String msg = service.SetDevicestatusoff(sl);
				
				m.addAttribute("msg", msg);
				
				return "Success";
		
			}
			
			@RequestMapping("/delete")
			public String delete(Model m)
			{     
				List<Device> d = service.listDevices();
				m.addAttribute("listd", d);
				return "Displaydel";
		
			}
			
			
			
			@RequestMapping("/deletedevice")
			public String deldevice(Long sl,Model m)
			{     
				
				String msg = service.delete(sl);
				
				m.addAttribute("msg", msg);
				
				return "Success";
		
			}
			
			
			
			
			
}
