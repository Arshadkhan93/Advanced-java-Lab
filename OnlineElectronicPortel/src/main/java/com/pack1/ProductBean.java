package com.pack1;

import java.io.Serializable;

public class ProductBean implements Serializable
{
	private String pCode,pName,pCom,pPrice,pQty;

	public ProductBean() 
	{
		
	}
	
	
	
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCom() {
		return pCom;
	}

	public void setpCom(String pCom) {
		this.pCom = pCom;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpQty() {
		return pQty;
	}

	public void setpQty(String pQty) {
		this.pQty = pQty;
	}
	
	
	

}
