package com.dbpf.nobug.database.constants;

/**
 * 
 *
 * Description:系统模块数据常量
 *
 * @author showersx
 * @version 1.0
 * 
 *          <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2016年3月30日      showersx       1.0         1.0 Version
 * </pre>
 */
public class SystemConstant {
	// 以内部类的方式区分
	/** 系统标识 */
	public static final String SYSTEM_TAG = "SYSTEM_TAG";

	/** 页面相关 */
	public static class Page {
		/** 默认分页页码 */
		public static final int DEFAULT_PAGE_NO = 1;
		/** 默认分页大小 */
		public static final int DEFAULT_PAGE_SIZE = 20;
		/** 每页条数KEY */
		public static final String PAGE_SEIZ_KEY = "rows";
		/** 页码KEY */
		public static final String PAGE_NO_KEY = "page";

	}

	/** 验证码 */
	public static final class VerifyCode {
		/** 验证码KEY */
		public static final String VERIFY_CODE = "VERIFY_CODE";
	}

	/** 系统相关 */
	public static class System {
		/** 系统用户 */
		public static final String CURRENT_USER = "CURRENT_USER";
	}

	public static class Date {
		/** yyyy-MM-dd HH24:mm:ss */
		public static final String FORMAT_1 = "yyyy-MM-dd HH24:mm:ss";
		/** yyyy-MM-dd HH24:mi:ss */
		public static final String FORMAT_2 = "yyyy-MM-dd HH24:mi:ss";

		/** yyyy-MM-dd */
		public static final String FORMAT_3 = "yyyy-MM-dd";
	}
}
