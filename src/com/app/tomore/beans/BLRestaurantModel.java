package com.app.tomore.beans;

import java.io.Serializable;

public class BLRestaurantModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7354042242207169365L;
	private String AdID;
	private String Title;
	private String Content;
	private String ServiceRegion;
	private String Address;
	private String DeliverPrice;
	private String Image;
	private String Rating;
	private String Phone;
	private String Special;
	private String Discount;
	private String HotLevel;
	public String getAdID() {
		return AdID;
	}
	public void setAdID(String adID) {
		AdID = adID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getServiceRegion() {
		return ServiceRegion;
	}
	public void setServiceRegion(String serviceRegion) {
		ServiceRegion = serviceRegion;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDeliverPrice() {
		return DeliverPrice;
	}
	public void setDeliverPrice(String deliverPrice) {
		DeliverPrice = deliverPrice;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getSpecial() {
		return Special;
	}
	public void setSpecial(String special) {
		Special = special;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getHotLevel() {
		return HotLevel;
	}
	public void setHotLevel(String hotLevel) {
		HotLevel = hotLevel;
	}
}
