package com.zhangym.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhang
 * @version 1.0
 * @classname LogUtils
 * @descriptionclass
 * 1.日志打印封装
 * 2.****************
 * @createdate 2019/3/7
 * @since 1.0
 */
public class LogUtils {
	/**
	 * 简单包装
	 * 信息前后添加分隔符
	 * @param info 要包装的信息
	 * @param logFormat 包装的格式
	 * @return 包装后的信息
	 */
	public static String importantInfo(Object info,LogFormat logFormat){
		if(info == null){
			info = "";
		}
		if(logFormat==null || "".equals(logFormat.getLogFormat())){
			return info.toString();
		}
		return logFormat.getLogFormat() + "\n" + info.toString() + "\n" + logFormat.getLogFormat();
	}


	/**
	 * 简单包装
	 * @param info 要包装的信息
	 * @return 包装后的信息
	 */
	public static String importantInfo(Object info){
		return importantInfo(info.toString(),LogFormat.NULLS);
	}

	/**
	 * 该方法是:
	 * 		包装要打印得调试信息
	 * @param info 要打印的日志信息
	 * @return
	 */
	public static String addDateForInfo(Object info){
		return addDateForInfo(info.toString(),LogLevel.INFO);
}

	/**
	 *该方法是:
	 * 		包装要打印得调试信息
	 * @param info 要打印的信息
	 * @param infoLevel 要打印的信息级别
	 * @return
	 */
	public static String addDateForInfo(Object info,LogLevel infoLevel){
		return addDateForInfo(info,new Date(),infoLevel,LogFormat.DATEFORMAT,LogFormat.NULLS);
	}


	/**
	 *该方法是:
	 * 		包装要打印得调试信息
	 * @param info 要打印的信息
	 * @param infoLevel 要打印的信息级别
	 * @param lineFormat 指定日志的分隔符
	 * @return
	 */
	public static String addDateForInfo(Object info,LogLevel infoLevel,LogFormat lineFormat){
		return addDateForInfo(info.toString(),new Date(),infoLevel,LogFormat.DATEFORMAT,lineFormat);
	}



	/**
	 * 该方法是:
	 * 		包装要打印得调试信息
	 * @param info 要打印的信息
	 * @param date 自定义要打印的时间
	 * @param infoLevel 要打印的级别
	 * @param lineFormat 分割符的格式
	 * @return
	 */
	public static String addDateForInfo(Object info, Date date,LogLevel infoLevel,LogFormat lineFormat){
		return addDateForInfo(info.toString(),new Date(),infoLevel,LogFormat.DATEFORMAT,lineFormat);
	}

	/**
	 * 该方法是:
	 * 		包装要打印得调试信息
	 * @param info 自定义的调试信息
	 * @param date 日志记录时间 为空则记录当前时间
	 * @param infoLevel 日志记录级别
	 * @param dateFormat 日期格式
	 * @param lineFormat 分割符号格式
	 * @return
	 */
	public static String addDateForInfo(Object info, Date date,LogLevel infoLevel,LogFormat dateFormat,LogFormat lineFormat){
		if(info == null || info.toString().length()==0){
			info = "";
		}
		if(date == null){
			date = new Date();
		}
		if(infoLevel ==  null){
			infoLevel = LogLevel.INFO;
		}
		if(lineFormat == null || "".equals(lineFormat)){
			lineFormat = LogFormat.NULLS;
		}
		String dates = getDate(date,dateFormat);
		String infos = dates + "[" + infoLevel.getLogFormat() +"]" + info.toString();
		return importantInfo(infos,lineFormat);
	}


	/**
	 * 该方法:
	 * 		获取当前时间的指定格式的显示
	 * 		格式yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getDate(){
		return getDate(new Date(),LogFormat.DATEFORMAT);
	}

	/**
	 * 获取指定时间的日期格式
	 *
	 * 格式 yyyy-MM-dd HH:mm:ss
	 *
	 * @param date
	 * @return
	 */
	public static String getDate(Date date){
		return getDate(date,LogFormat.DATEFORMAT);
	}

	/**
	 * 获取指定时间指定格式的日期
	 *
	 * @param date 指定日期
	 * @param dateFormat 指定日期格式
	 * @return
	 */
	public static String getDate(Date date,LogFormat dateFormat){
		if(date == null){
			date = new Date();
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.getLogFormat());
		return sdf.format(date);
	}


	/**
	 * 使用说明
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(LogUtils.addDateForInfo("INFO",LogLevel.INFO));
		System.out.println(LogUtils.addDateForInfo("EXCEPTION",LogLevel.EXCEPTION,LogFormat.LONGLINEFORE));
		System.out.println(LogUtils.addDateForInfo("DEBUGINFO",LogLevel.DEBUG));
		System.out.println(LogUtils.addDateForInfo("ERRORINFO",LogLevel.ERROR,LogFormat.LONGLINEFORE));
	}

}
