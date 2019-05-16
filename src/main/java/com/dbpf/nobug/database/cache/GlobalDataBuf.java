package com.dbpf.nobug.database.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 *
 * Description:全局数据缓冲区
 *
 * @author showersx
 * @version 1.0
 * 
 *          <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2016年3月17日      showersx       1.0         1.0 Version
 * </pre>
 */
public class GlobalDataBuf {
	private static Map<String, Map<String, String>> dictCacheData = new HashMap<String, Map<String, String>>();

	/**
	 * 
	 * Description: 数据字典缓存
	 *
	 * @param dictType
	 *          字典类型
	 * @param dictName
	 *          字典名称
	 * @param dictCode
	 *          字典编码
	 * @Author showersx
	 * @Create Date: 2016年3月17日 下午10:19:47
	 */
	public static void putDictCacheData(String dictType, String dictCode, String dictName) {
		if (null == dictCacheData.get(dictType)) {
			Map<String, String> data = new TreeMap<String, String>();
			data.put(dictCode, dictName);
			dictCacheData.put(dictType, data);
		} else {
			Map<String, String> data = dictCacheData.get(dictType);
			data.put(dictCode, dictName);
			dictCacheData.put(dictType, data);
		}
	}

	/**
	 * 
	 * Description: 获取字典缓存
	 *
	 * @param dictType
	 * @return
	 * @Author showersx
	 * @Create Date: 2016年3月17日 下午10:23:08
	 */
	public static Map<String, String> getDictCacheData(String dictType) {
		return dictCacheData.get(dictType);
	}

	/**
	 * 
	 * Description: 获取字典名称
	 *
	 * @param dictType
	 *          字典类型
	 * @param dictCode
	 *          字典编码
	 * @return
	 * @Author showersx
	 * @Create Date: 2016年4月2日 下午9:48:17
	 */
	public static String getDictNameCache(String dictType, String dictCode) {
		Map<String, String> dictMap = dictCacheData.get(dictType);
		if (null != dictMap) {
			return dictMap.get(dictCode);
		} else {
			return null;
		}
	}

	/**
	 * 
	 * Description: 删除字典数据的键值
	 *
	 * @param dictType
	 * @param dictCode
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午11:11:47
	 */
	public static void removeDictCacheData(String dictType, String dictCode) {
		Map<String, String> dictMap = dictCacheData.get(dictType);
		if (null != dictMap) {
			System.out.println(dictType + "|" + dictType);
			dictMap.remove(dictCode);
			dictCacheData.put(dictType, dictMap);
		} else {
			dictCacheData.remove(dictType);
		}
	}

	/**
	 * 
	 * Description: 获取所有的字典缓存数据
	 *
	 * @return
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午11:16:01
	 */
	public static Map<String, Map<String, String>> getAllDictCacheData() {
		return dictCacheData;
	}

	private static Map<String, String> configCacheData = new HashMap<String, String>();

	/**
	 * 
	 * Description: 添加配置
	 *
	 * @param key
	 * @param value
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午10:40:07
	 */
	public static void putConfigCacheData(String key, String value) {
		configCacheData.put(key, value);
	}

	/**
	 * 
	 * Description: 获取配置文件的值
	 *
	 * @param key
	 * @return
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午10:40:23
	 */
	public static String getConfigCacheData(String key) {
		return configCacheData.get(key);
	}

	/**
	 * 
	 * Description: 删除配置文件数据的键值
	 *
	 * @param key
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午11:05:59
	 */
	public static void removeConfigCacheData(String key) {
		configCacheData.remove(key);
	}

	/**
	 * 
	 * Description: 获取所有的配置文件键值缓存数据
	 *
	 * @return
	 * @Author showersx
	 * @Create Date: 2016年4月17日 上午11:06:54
	 */
	public static Map<String, String> getAllConfigCacheData() {
		return configCacheData;
	}

	
}
