package cn.edu.qdu.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			// 获得class
			Class clazz = Class.forName("Dog ");
			// 获得构造方法
			Constructor con = clazz.getConstructor(Integer.TYPE);
			// 调用构造方法
			Object obj = con.newInstance(23);// 实例化相当于Dog d=new Dog()
			System.out.println(obj.toString());
			// 获得方法
			Method sleep = clazz.getMethod("sleep");
			Method eat = clazz.getMethod("eat", String.class);// clazz.getMethod(方法名,
																// 参数)
			// 调用方法
			sleep.invoke(obj);
			eat.invoke(obj, "骨头");
			//获得属性
			Field name=clazz.getDeclaredField("name");
			Field age=clazz.getDeclaredField("age");
			//调用属性
			name.set(obj, "wangwang");
			age.set(obj, 34);
			//允许授权访问私有属性
			name.setAccessible(true);
			age.setAccessible(true);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
