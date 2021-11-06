package com.example.demo;

import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Billrepo repo;
	@RequestMapping(path="/bills" ,method=RequestMethod.GET)
	public List<BillPOJO> GetAll() {
		return repo.findAll();
	}
	@RequestMapping(path="/bills/{id}" ,method=RequestMethod.GET)
	public BillPOJO Get(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	@RequestMapping(path="/bills/due/date/{BilledDate}" ,method=RequestMethod.GET)
	public List<BillPOJO> Get(@PathVariable String BilledDate) {
		return repo.findByBilledDate(BilledDate);
	}

}
