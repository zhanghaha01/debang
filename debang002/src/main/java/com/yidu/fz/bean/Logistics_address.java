package com.yidu.fz.bean;
/**
 * 
 * @author 范柱
 * 物流地址表
 *
 */
public class Logistics_address {
	private String departure_station;
	private String way_station;
	private String destination;
	public String getDeparture_station() {
		return departure_station;
	}
	public void setDeparture_station(String departure_station) {
		this.departure_station = departure_station;
	}
	public String getWay_station() {
		return way_station;
	}
	public void setWay_station(String way_station) {
		this.way_station = way_station;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Logistics_address(String departure_station, String way_station, String destination) {
		super();
		this.departure_station = departure_station;
		this.way_station = way_station;
		this.destination = destination;
	}
	public Logistics_address() {
		super();
	}
	@Override
	public String toString() {
		return "Logistics_address [departure_station=" + departure_station + ", way_station=" + way_station
				+ ", destination=" + destination + "]";
	}
	
}
