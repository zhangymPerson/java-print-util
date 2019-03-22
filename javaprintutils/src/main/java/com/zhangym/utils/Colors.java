package com.zhangym.utils;

/**
 * @author zhang
 * @version 1.0
 * @classname Colors
 * @descriptionclass 1.****************
 * 2.****************
 * @createdate 2019/3/7
 * @since 1.0
 */
public enum  Colors {

	READ("RED"),
	GREEN("GREEN"),
	BLUE("BLUE"),
	DEFAULT("DEFAULT");

	private String colors;

	private Colors(String colors){
		this.colors = colors;
	}

	public String  getColors(){
		return colors;
	}

	public void setColors(String colors){
		this.colors =colors;
	}


}
