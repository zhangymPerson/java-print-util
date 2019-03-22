package cn.danao.exception;

/**
 * @author zhang
 * @version 1.0
 * @classname SelfException
 * @descriptionclass 1.****************
 * 2.****************
 * @createdate 2019/3/22
 * @since 1.0
 */
public class SelfException extends RuntimeException {
	public SelfException(){
		super();
	}

	public SelfException(String e){
		super(e);
	}

	public SelfException(ExceptionCode exceptionCode){
		super(exceptionCode.getExceptionInfo());
	}
}
