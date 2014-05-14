MyLog
=====

Logging is very easy this is a simple util that makes turning logging on and off even more simple.
MyLog is a Util that adds a boolean to the android.util.log. So you no longer have to throw an if statment or something around your log statement to have an easy toggle on and off. 


##Usage
```java 
//changes 
if(actuallyLog){
	Log.i("title","message")
}

//into
MyLog.i("title","Message",actuallyLog);

```


Also handles throwables. 
```java
	public static void i(String tag, String msg, Throwable tr, Boolean actuallyLog);
```

How its used.

```java
boolean actuallyLog = true;
...
 MyLog.d("title","message",actuallyLog);
 MyLog.i("title","message",actuallyLog);
 MyLog.v("title","message",actuallyLog);
 MyLog.e("title","message",actuallyLog);
 MyLog.w("title","message",actuallyLog);
 MyLog.wtf("title","message",actuallyLog);
 ect.
```


Methods currently implemented
```java
	public static void d(String tag, String msg, Boolean actuallyLog) 
  	public static void i(String tag, String msg, Boolean actuallyLog)
	public static void v(String tag, String msg, Boolean actuallyLog)
	public static void e(String tag, String msg, Boolean actuallyLog)
	public static void w(String tag, String msg, Boolean actuallyLog)
	public static void wtf(String tag, String msg, Boolean actuallyLog)
	
	public static void d(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void i(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void v(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void e(String tag, String msg, Throwable tr, Boolean actuallyLog)
	public static void w(String tag, String msg, Throwable tr, Boolean actuallyLog) 
	public static void wtf(String tag, String msg, Throwable tr, Boolean actuallyLog) 
```

##LICENSE
----------------------------------------------------------------------------

Copyright 2013 Aaron Fleshner

"THE BEER-WARE LICENSE" (Revision 42):
<phk@FreeBSD.ORG> wrote this file. As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me a beer in return Poul-Henning Kamp

----------------------------------------------------------------------------
