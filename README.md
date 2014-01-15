MyLog
=====

A Simple Util that makes turning logging on and off fairly simple

My Log is a Util that adds a boolean to the android.util.log.

How its used.

```java
boolean actuallyLog = true;

...
 MyLog.i("title","message",actuallyLog);
 MyLog.v("title","message",actuallyLog);
 MyLog.d("title","message",actuallyLog);
 MyLog.w("title","message",actuallyLog);
 MyLog.wtf("title","message",actuallyLog);
 ect.
```

Methods currently implemented
```java
  public static void i(String tag, String msg, Boolean actuallyLog)
	public static void d(String tag, String msg, Boolean actuallyLog) 
	public static void v(String tag, String msg, Boolean actuallyLog)
	public static void e(String tag, String msg, Boolean actuallyLog)
	public static void w(String tag, String msg, Boolean actuallyLog)
	public static void wtf(String tag, String msg, Boolean actuallyLog)
	public static void i(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void d(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void v(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void e(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void w(String tag, String msg, Throwable tr, Boolean actuallyLog) 
	public static void wtf(String tag, String msg, Throwable tr, Boolean actuallyLog) 
```
