package com.dmm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmm.model.User;
import com.dmm.service.UserService;

@RestController
@RequestMapping("/SpringBoot")
public class IndexController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/index")
	public String index(){
		return "SUCCESS";
	}
	@RequestMapping("/index1")
	public String index1(){
		return "SUCCESS";
	}
	@RequestMapping("/listIndex")
	public List<String> listIndex(){
		List<String> list = new ArrayList<>();
		list.add("index1");
		list.add("index2");
		list.add("index3");
		list.add("index4");
		return list;
	}
	@RequestMapping("/exception")
	public Integer ff(HttpServletRequest request,String id1){
		String id = request.getParameter("id");
		Integer id2 = Integer.parseInt(id);
		return id2;
		}
	@RequestMapping("findAll")
	public User findAll(Long userid){
		return userService.getUser(userid);
	}
}