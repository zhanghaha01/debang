package com.yidu.fz.bean;
/**
 * 
 * @author 范柱
 * CRM地址库
 *
 */
public class Address_the_library {
	private String province;//dsadasd
	private String city;
	private String district;
	private String address_coding;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress_coding() {
		return address_coding;
	}
	public void setAddress_coding(String address_coding) {
		this.address_coding = address_coding;
	}
	public Address_the_library(String province, String city, String district, String address_coding) {
		super();
		this.province = province;
		this.city = city;
		this.district = district;
		this.address_coding = address_coding;
	}
	public Address_the_library() {
		super();
	}
	
}
