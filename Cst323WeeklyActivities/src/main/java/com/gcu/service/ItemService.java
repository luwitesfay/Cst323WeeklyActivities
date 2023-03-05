package com.gcu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.bussiness.ItemTable;
import com.gcu.bussiness.ItemsInterface;

@Service
public class ItemService {

	@Autowired
	private ItemsInterface items;
	
	public  void save(ItemTable T) {
		items.save(T);
	}
	
	public List<ItemTable> getAllItems(){
		return items.findAll();
	}

}
