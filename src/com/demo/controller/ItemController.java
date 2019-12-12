package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.pojo.Goods;
import com.demo.service.GoodsService;

@Controller
public class ItemController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Goods> itemList = goodsService.getItemList();
		
		for (Goods goods : itemList) {
			System.out.println(itemList);
		}
		//model.addAttribute("itemList", itemList);
		return "item";
		
	}
	@RequestMapping("add")
	public String additem(Model model ,@ModelAttribute Goods goods) {
		System.out.println("---------------------------"+goods);
		goodsService.insertItem(goods);
		return "item";
	}
	
}
