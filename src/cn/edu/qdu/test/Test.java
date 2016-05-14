package cn.edu.qdu.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			// ���class
			Class clazz = Class.forName("Dog ");
			// ��ù��췽��
			Constructor con = clazz.getConstructor(Integer.TYPE);
			// ���ù��췽��
			Object obj = con.newInstance(23);// ʵ�����൱��Dog d=new Dog()
			System.out.println(obj.toString());
			// ��÷���
			Method sleep = clazz.getMethod("sleep");
			Method eat = clazz.getMethod("eat", String.class);// clazz.getMethod(������,
																// ����)
			// ���÷���
			sleep.invoke(obj);
			eat.invoke(obj, "��ͷ");
			//�������
			Field name=clazz.getDeclaredField("name");
			Field age=clazz.getDeclaredField("age");
			//��������
			name.set(obj, "wangwang");
			age.set(obj, 34);
			//������Ȩ����˽������
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
