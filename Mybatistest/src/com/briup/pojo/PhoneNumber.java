package com.briup.pojo;
/**
 *　自定义的类型
 *  110-119-120
 */
public class PhoneNumber {
	private String countryCode; 
	private String stateCode; 
	private String number;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumber(String countryCode, String stateCode, String number) {
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	public PhoneNumber() {
	}
	
	public PhoneNumber(String str){
		//str:  110-119-120
	//将从数据库查询的结果，拿当前对象接收
		if(str!=null){
		String[] ph = str.split("-");
		countryCode=ph[0];
		stateCode=ph[1];
		number=ph[2];
		}
	}
	
	
	@Override
	public String toString() {
		return countryCode + "-"
				+ stateCode + "-" + number;
	}
	
	public String getAsString(){
		//110-119-120
			return 
	countryCode+"-"+stateCode+"-"+number;
		}
}








