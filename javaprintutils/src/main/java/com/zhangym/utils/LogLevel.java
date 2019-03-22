package com.zhangym.utils;

/**
 * @author zhang
 * @version 1.0
 * @classname LogFormat
 * @descriptionclass
 * 1.枚举类
 * 2.规范日志中的各种格式
 * @createdate 2019/2/13
 * @since 1.0
 */
public enum LogLevel {


	/**
	 * 日志级别为INFO
	 */
	INFO("INFO"),
	/**INFO
	 * 日志级别为DEBUG
	 */
	DEBUG("DEBUG"),
	/**
	 * 日志级别为EXCEPTION
	 */
	EXCEPTION("EXCEPTION"),
	/**
	 * 日志级别为ERROR
	 */
	ERROR("ERROR");



	private String logFormat;

	private LogLevel(String logFormat){
		this.logFormat = logFormat;
	}


	public String getLogFormat() {
		return logFormat;
	}

	public void setLogFormat(String logFormat) {
		this.logFormat = logFormat;
	}
}
