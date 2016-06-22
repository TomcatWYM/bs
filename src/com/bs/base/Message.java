package com.bs.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 * controller如果返回json用Message封装
 * @ClassName: Message 
 * @Description: TODO
 * @author wu.yw
 * @date 2014年12月2日 下午5:11:27 
 * @version V1.0
 */
public class Message implements Serializable{
	private static final long serialVersionUID = 8365911840761722263L;
	private MessageType code;
	private	String name;
	private String content;
	private Map<String, Object> map = new HashMap<String, Object>();

	public Message(MessageType type) {
		this.code = type;
		this.name = type.toString();
	}

	public Message(MessageType type, String content) {
		this.code = type;
		this.name = type.toString();
		this.content = content;
	}

	public Message(MessageType type, String content, Map<String, Object> map) {
		this.code = type;
		this.name = type.toString();
		this.content = content;
		this.map = map;
	}
	public static Message success() {
		return new Message(MessageType.SUCCESS);
	}
	public static Message success(String content) {
		return new Message(MessageType.SUCCESS, content);
	}

	public static Message warning(String content) {
		return new Message(MessageType.WARNING, content);
	}

	public static Message systemError(String content) {
		return new Message(MessageType.SYSTEMERROR, content);
	}

	public static Message buinessError(String content) {
		return new Message(MessageType.BUSINESSERROR, content);
	}
	public void putInfo(String name, Object val) {
		this.map.put(name, val);
	}

	public MessageType getCode() {
		return code;
	}

	public String getName(){
		return name;
	}
	public String getContent() {
		return content;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
