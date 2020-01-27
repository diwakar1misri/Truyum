package com.cognizant.truyum.model;
import java.util.Date;
public class MenuItem 
{
	private int id;
	private String name;
	private boolean active;
	private Date date_of_launch;
	private String category;
	private boolean freedelivery;
	private float price;
	public MenuItem(int id, String name,float price, boolean active, Date date_of_launch, String category, boolean freedelivery) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.price=price;
		this.date_of_launch = date_of_launch;
		this.category = category;
		this.freedelivery = freedelivery;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDate_of_launch() {
		return date_of_launch;
	}
	public void setDate_of_launch(Date date_of_launch) {
		this.date_of_launch = date_of_launch;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isFreedelivery() {
		return freedelivery;
	}
	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}
	public void setprice(float price)
	{
		this.price=price;
	}
	public float getprice()
	{
		return price;
	}
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", active=" + active + ", date_of_launch=" + date_of_launch
				+ ", category=" + category + ", freedelivery=" + freedelivery + "]";
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof MenuItem && this.id==((MenuItem)obj).id;
	}
}
