package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.GoodsMapper;
import com.demo.pojo.Goods;
import com.demo.pojo.Items;
import com.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> getItemList() {
		
		return goodsMapper.getItemList();	
	}

	@Override
	public void insertItem(Goods goods) {
		
		goodsMapper.insertItem(goods);
	}

	@Override
	public void addItems(Items.Item item) {
		
		goodsMapper.addItem(item);
	}

}
