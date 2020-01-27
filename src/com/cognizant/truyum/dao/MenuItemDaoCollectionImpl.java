package com.cognizant.truyum.dao;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private static List<MenuItem> menuItemList;
	MenuItemDaoCollectionImpl() throws ParseException
	{
		if(menuItemList==null)
		{
			menuItemList=new ArrayList<MenuItem>();
		menuItemList.add(new MenuItem(000001, "Sandwich", 99.00f, true,
				DateUtil.convertToDate("15/03/2017"), "Main Course",
				true));
		menuItemList.add(new MenuItem(000002, "Burger", 129.00f, true,
				DateUtil.convertToDate("23/12/2017"), "Main Course",
				false));
		menuItemList.add(new MenuItem(000003, "Pizza", 149.00f, true,
				DateUtil.convertToDate("21/08/2018"), "Main Course",
				false));
		menuItemList.add(new MenuItem(000004, "French Fries", 200.00f,
				true, DateUtil.convertToDate("02/07/2017"),
				"Main Course", false));
		menuItemList.add( new MenuItem(000005, "Choclate Brownie", 32.00f,
				true, DateUtil.convertToDate("02/11/2022"), "Dessert",
				true));
		}
	}
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return this.getMenuItemList();
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer()
	{
		 List<MenuItem> menuItemListCust=new ArrayList<>();

			for (MenuItem menuItem : menuItemList) {
				Date today=new Date();
				if (menuItem.getDate_of_launch().getTime() <= today.getTime()
						&& menuItem.isActive()) {
					menuItemListCust.add(menuItem);
				}
			}
			return menuItemListCust;
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for(MenuItem obj:this.menuItemList)
		{
			if(menuItemId==obj.getId())
			{
				return obj;
			}
		}
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuitem)
	{
		int i=0;
		for(MenuItem obj:this.menuItemList)
		{
			if(obj.getId()==menuitem.getId())
			{
				this.menuItemList.set(i, menuitem);
				break;
			}
			i++;
		}
	}

	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

}
