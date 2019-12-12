package com.demo.mapper;

import java.util.List;

import com.demo.pojo.Goods;
import com.demo.pojo.Items;

/**
 *  商品数据表持久化接口
 * @author 
 *
 */
public interface GoodsMapper {
	
	List<Goods> getItemList();
	void insertItem(Goods goods);
	void addItem(Items.Item item);
}
