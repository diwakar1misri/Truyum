package com.cognizant.truyum.model;
import java.util.List;
public class Card 
{
	private List<MenuItem> menuItemList;
	double total;
	public Card(List<MenuItem> obj, double total) {
		super();
		this.menuItemList = obj;
		this.total = total;
	}
	public Card()
	{
		menuItemList=null;
		total=0;
	}
	public List<MenuItem> getmenuItemList() {
		return menuItemList;
	}

	public void setmenuItemList(List<MenuItem> obj) {
		this.menuItemList = obj;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Card [obj=" + menuItemList + ", total=" + total + "]";
	}
	
}
