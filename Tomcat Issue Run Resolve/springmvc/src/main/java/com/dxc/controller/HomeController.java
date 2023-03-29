package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Ankit Rajvanshi");
		model.addAttribute("id",2012);

		List<String> friends= new ArrayList<String>();
		friends.add("ankita");
		friends.add("sagar");
		friends.add("abhishek");
		model.addAttribute("f",friends);
		return "index";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		System.out.println("this is about page controller");
		return "about";
	}

	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public ModelAndView help(){
		System.out.println("Help page");
		//creating object
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("roll","234");
		modelAndView.addObject("name","BoB is here");

		/*LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);*/

		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(28);
		modelAndView.addObject("marks",list);

		//setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}

	@Entity
	public static class User {
	@Id
	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
		private String email;
		private String userName;
		private String password;
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User{" +
					"email='" + email + '\'' +
					", userName='" + userName + '\'' +
					", password='" + password + '\'' +
					'}';
		}

	}

	}

