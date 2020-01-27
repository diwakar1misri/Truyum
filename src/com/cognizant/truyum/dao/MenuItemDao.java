package com.cognizant.truyum.dao;
import java.util.List;
import com.cognizant.truyum.model.MenuItem;
public interface MenuItemDao 
{
	public List<MenuItem> getMenuItemListAdmin();
	public List<MenuItem> getMenuItemListCustomer();
	public MenuItem getMenuItem(long menuItemId);
	public void modifyMenuItem(MenuItem menuitem);
}