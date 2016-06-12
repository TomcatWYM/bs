package com.bs.base;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.util.StringUtils;

/**
 * 生成主键
 * @author Administrator
 *
 */
public class PrimaryKeyUtil {
	public static String getPrimaryKey(){

		Calendar now=Calendar.getInstance();
		now.setTime(new Date());
        return String.format("%d%d%d%d%d%d%d_%s",
                now.get(now.YEAR),
                now.get(now.MONTH)+1,
                now.get(now.DAY_OF_MONTH),
                now.get(now.HOUR_OF_DAY),
                now.get(now.MINUTE),
                now.get(now.SECOND),
                now.get(now.MILLISECOND),
                UUID.randomUUID().toString().replace("-", ""));
	}
	
	public static boolean isStudent(String userID){
		if(StringUtils.isEmpty(userID)) return false;
		String s=userID.split("_")[0];
		if(s.equals("stu")) return true;
		else return false;
	}
	public static void main(String[] args){
		PrimaryKeyUtil pk = new PrimaryKeyUtil();
		System.out.println(pk.getPrimaryKey());
	}
}
