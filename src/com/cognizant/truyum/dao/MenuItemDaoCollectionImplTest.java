package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest 
{
	
	public static void testGetMenuItemListAdmin() throws ParseException
	{
		MenuItemDaoCollectionImpl menuItemDao= new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList=menuItemDao.getMenuItemListAdmin();
		for(MenuItem obj:menuItemList)
		{
			System.out.println(obj.toString());
		}
	}
	public static void testGetMenuItemListCustomer() throws ParseException
	{
		MenuItemDaoCollectionImpl menuItemDao= new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList=menuItemDao.getMenuItemListCustomer();
		for(MenuItem obj:menuItemList)
		{
			System.out.println(obj.toString());
		}
		 
	}
	public static void testModifyMenuItem() throws ParseException
	{
		MenuItemDaoCollectionImpl menu_item_modify=new MenuItemDaoCollectionImpl();
		menu_item_modify.modifyMenuItem(new MenuItem(000002, "Burger", 129.00f, true,
				DateUtil.convertToDate("23/12/2017"), "Main Course",
				true));		
	}
	public static void testGetMenuItem() throws ParseException
	{
		System.out.println(new MenuItemDaoCollectionImpl().getMenuItem(000002).toString());
	}
	public static void main(String args[]) throws ParseException
	{
		testGetMenuItemListAdmin();
		System.out.println("\n\n");
		testGetMenuItemListCustomer();
		System.out.println("\n\n");
		testModifyMenuItem();
		testGetMenuItem();
	}
}
