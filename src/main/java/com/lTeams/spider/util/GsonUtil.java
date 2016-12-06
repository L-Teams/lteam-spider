package com.lTeams.spider.util;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class GsonUtil {
	
	/**
	 * function:将json object转换成string
	 * author  :huangguicheng 
	 * @param type
	 * @return
	 */
	public static <T> String parseStringWithObject(T object) {
		Gson gson = new Gson();
		return gson.toJson(object);
	}
	
	
	/**
	 * function:将json object<包括泛型>转换成string
	 * author  :huangguicheng 
	 * @param type
	 * @return
	 */
	public static <T> String parseStringWithObject(T object,Class<T> type) {
		Gson gson = new Gson();
		return gson.toJson(object,new TypeToken<List<T>>() {}.getType());
	}
	
	
	/**
	 * function:将json string转换成object
	 * author  :huangguicheng
	 * @param jsonData
	 * @param type
	 * @return
	 */
	public static <T> T parseObjectWithStr(String jsonData, Class<T> type) {
        Gson gson = new Gson();
		return gson.fromJson(jsonData, type);
    }
	

	/**
	 * function:将json string转换成list
	 * author  :huangguicheng
	 * @param jsonData
	 * @param type
	 * @return
	 */
	public static <T> List<T> parseArrayWithStr(String jsonData,Class<T> type) {
	    Gson gson = new Gson();
	    return gson.fromJson(jsonData, new TypeToken<List<T>>() {}.getType());
    }
	
	
	
	/**
	 * function:将json string转换成map
	 * author  :huangguicheng
	 * @param jsonData
	 * @param type
	 * @return
	 */
	public static <T1,T2> Map<T1,T2> parseMapWithStr(String jsonData,Class<Map<T1,T2>> type) {
	    Gson gson = new Gson();
	    return gson.fromJson(jsonData, new TypeToken<List<Map<T1, T2>>>() {}.getType());
    }
	
}
