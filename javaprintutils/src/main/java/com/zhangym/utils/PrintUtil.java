package com.zhangym.utils;

import cn.danao.exception.ExceptionCode;
import cn.danao.exception.SelfException;

import java.io.File;

/**
 * @author zhang
 * @version 1.0
 * @classname PrintUtil
 * @descriptionclass 1.****************
 * 2.****************
 * @createdate 2019/3/7
 * @since 1.0
 */
public class PrintUtil {

	public static String println(Object info, String filepath){
		if(isEmpty(info.toString())){
			throw new SelfException(ExceptionCode.ISNULL);
		}else {
			return "";
		}
	}

	public static void print(Object object,Colors colors){

		colors.getColors();

	}

	public static void main(String[] args) {
		println("","");
		println("","");
	}

	public static boolean isEmpty(String info){
		return info==null||"".equals(info);
	}
}
