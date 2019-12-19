package com.demo.service;

import java.util.List;

import com.demo.pojo.*;

/**
 *  商品数据业务逻辑接口
 * @author 
 *
 */
public interface GoodsService {
	
	List<Goods> getItemList();
	void insertItem(Goods goods);
	int getItemCount();
	List<Goods> getItemListByPage(MyShopBean myShopBean);


	List<BannerDataList> getBannerDataList(Stores stores);

	List<ClassifyDataList> getClassifyDataList(Stores stores);

	List<SingleItem_1_DataList> getSingleItem_1_DataList(Stores stores);

	List<SingleItem_2_DataList> getSingleItem_2_DataList(Stores stores);

	List<UnionClassifyDataList> getUnionClassifyDataList(Stores stores);
	List<UnionItemDataList> getUnionItemDataList(Stores stores);
}
