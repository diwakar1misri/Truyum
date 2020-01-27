package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.cognizant.truyum.model.Card;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao 
{
	private static HashMap<Long,Card> userCarts;
	CartDaoCollectionImpl()
	{
		if(userCarts==null)
		{
			userCarts=new HashMap<Long, Card>();
			}
	}
	@Override
	public void addCartItem(long userId, long menuItemId) throws ParseException {
		Long id=(Long)menuItemId;
		if(userCarts.containsKey(id))
		{
			Card card=userCarts.get(id);
			List<MenuItem> newlist=card.getmenuItemList();
			newlist.add(new MenuItemDaoCollectionImpl().getMenuItem(menuItemId));
			card.setmenuItemList(newlist);
			double total=card.getTotal()+(new MenuItemDaoCollectionImpl().getMenuItem(menuItemId)).getprice();
			card.setTotal(total);
			userCarts.put(id,card);
		}
		else
		{
			Card card=new Card();
			List<MenuItem> newlist=new ArrayList<>();
			newlist.add(new MenuItemDaoCollectionImpl().getMenuItem(menuItemId));
			card.setmenuItemList(newlist);
			card.setTotal(new MenuItemDaoCollectionImpl().getMenuItem(menuItemId).getprice());
			userCarts.put(id,card);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub

	}

}
