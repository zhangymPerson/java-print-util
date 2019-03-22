package cn.danao.exception;

/**
 * @author zhang
 * @version 1.0
 * @classname ExceptionCode
 * @descriptionclass 1.****************
 * 2.****************
 * @createdate 2019/3/22
 * @since 1.0
 */
public enum  ExceptionCode {
	ISNULL(" 参数为空异常 "),
	ISERROR("ERROR:未知异常");

	/**
	 * 枚举的类 属性必须在定义下面
	 */
	private String exceptionInfo;

	private ExceptionCode(String exceptionInfo){
		this.exceptionInfo = exceptionInfo;
	}

	public String getExceptionInfo(){
		return exceptionInfo;
	}


}
