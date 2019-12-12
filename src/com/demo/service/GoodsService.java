package com.demo.service;

import java.util.List;

import com.demo.pojo.Goods;
import com.demo.pojo.Items;

/**
 *  商品数据业务逻辑接口
 * @author 小东东
 *
 */
public interface GoodsService {
	
	List<Goods> getItemList();
	void insertItem(Goods goods);
	void addItems(Items.Item item);
}
