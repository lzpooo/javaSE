package com.briup.ware;

public class Ware {

	private Long id;
	private String7 name;//房间号
	private Integer number;
	private Integer date;
	private Double price;
	
	@Override
	public String toString() {
		return "Ware [id=" + id + ", name=" + name + ", number=" + number
				+ ", date=" + date + ", price=" + price + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Ware(Long id, String name, Integer number, Integer date, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.date = date;
		this.price = price;
	}
}
