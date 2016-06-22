package com.bs.base;
/**
 * 异常类型
 * @ClassName: MessageType 
 * @Description: TODO
 * @author wu.yw
 * @date 2014年12月2日 下午5:11:59 
 * @version V1.0
 */
public enum MessageType {
	SUCCESS(1, "成功"), 
	WARNING(0,"警告"),
	ARGUMENTERROR(-997, "参数错误"),
	BUSINESSERROR(-998, "业务异常"),
	SYSTEMERROR(-999, "系统错误");
	private int code;
	private String name;
	MessageType(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println(MessageType.SUCCESS);
	}
}
