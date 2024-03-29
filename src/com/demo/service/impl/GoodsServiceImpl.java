package com.demo.service.impl;

import java.util.List;

import com.demo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.GoodsMapper;
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
	public int getItemCount() {
		return goodsMapper.getItemCount();
	}

	@Override
	public List<Goods> getItemListByPage(MyShopBean myShopBean) {
		return goodsMapper.getItemListByPage(myShopBean);
	}


	@Override
	public List<BannerDataList> getBannerDataList(Stores stores) {
		return goodsMapper.getBannerDataList(stores);
	}

	@Override
	public List<ClassifyDataList> getClassifyDataList(Stores stores) {
		return goodsMapper.getClassifyDataList(stores);
	}

	@Override
	public List<SingleItem_1_DataList> getSingleItem_1_DataList(Stores stores) {
		return goodsMapper.getSingleItem_1_DataList(stores);
	}

	@Override
	public List<SingleItem_2_DataList> getSingleItem_2_DataList(Stores stores) {
		return goodsMapper.getSingleItem_2_DataList(stores);
	}

	@Override
	public List<UnionClassifyDataList> getUnionClassifyDataList(Stores stores) {
		return goodsMapper.getUnionClassifyDataList(stores);
	}

	@Override
	public List<UnionItemDataList> getUnionItemDataList(Stores stores) {
		return goodsMapper.getUnionItemDataList(stores);
	}


}
