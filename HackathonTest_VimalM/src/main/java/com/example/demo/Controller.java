package com.example.demo;

import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	
	@Autowired
	Billrepo repo;
	
	@RequestMapping(path="" ,method=RequestMethod.GET)
     public ModelAndView ind(Model model){
			//ModelAndView model=new ModelAndView("index.html.txt");
			return new ModelAndView("index2.html");
		}
		
	/*	return "Welcome to Bill  Maintenance Project by Vimal.M"+"\n"+
	           "Use /get to fetch all bills"+"\n"+
	          "Use /get/id to fetch  bill by ID"
	          +"\n"+
	          "Use /get/due/date to fetch  bill by date";
	          */
	
	@RequestMapping(path="/bills" ,method=RequestMethod.GET)
	public List<BillPOJO> GetAll() {
		return repo.findAll();
	}
	@RequestMapping(path="/bills/{id}" ,method=RequestMethod.GET)
	public BillPOJO Get(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	@RequestMapping(path="/bills/due/data/{BilledDate}" ,method=RequestMethod.GET)
	public List<BillPOJO> Get(@PathVariable String BilledDate) {
		return repo.findByBilledDate(BilledDate);
	}

}
