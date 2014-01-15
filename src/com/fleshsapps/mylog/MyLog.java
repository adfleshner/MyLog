package com.fleshsapps.mylog;

import android.util.Log;

/**
 * an Extension of log that allows you to put a boolean to actually log or not
 * @author afleshner
 *
 */
public class MyLog {

	public static void i(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.i(tag, msg);
		}
	}

	public static void d(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.d(tag, msg);
		}
	}

	public static void v(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.v(tag, msg);
		}
	}

	public static void e(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.e(tag, msg);
		}
	}

	public static void w(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.w(tag, msg);
		}
	}

	public static void wtf(String tag, String msg, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.wtf(tag, msg);
		}
	}

	public static void i(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.i(tag, msg, tr);
		}
	}

	public static void d(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.d(tag, msg);
		}
	}

	public static void v(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.v(tag, msg);
		}
	}

	public static void e(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.e(tag, msg);
		}
	}

	public static void w(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.w(tag, msg);
		}
	}

	public static void wtf(String tag, String msg, Throwable tr, Boolean actuallyLog) {
		if (actuallyLog) {
			Log.wtf(tag, msg);
		}
	}

}

