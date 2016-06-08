package oop.get_private_field;
import java.lang.reflect.*;

public class TestPrivateAccess {
	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		try {
			Field reflectFieldString = SomeClass.class.getDeclaredField("name"); //NoSuchFieldException e
			Field reflectFieldInt = SomeClass.class.getDeclaredField("x"); //NoSuchFieldException e
			/* Если не дать доступ, то будет ошибка
			 java.lang.IllegalAccessException: Class .. .TestPrivateAccess
			 can not access a member of class .. .SomeClass with modifier
			 s "private"
			 */
			reflectFieldString.setAccessible(true);
			reflectFieldInt.setAccessible(true);
			String fieldValueString = (String) reflectFieldString.get(someClass); //IllegalAccessException ex
			Integer fieldValueInt = (Integer) reflectFieldInt.get(someClass); //IllegalAccessException ex
			System.out.println(reflectFieldString); //private java.lang.String ru.javastudy.interview.oop.privateFieldAccess.SomeClass.name
			System.out.println(fieldValueString); //SomeNameString
			System.out.println(reflectFieldInt); //private java.lang.Integer ru.javastudy.interview.oop.privateFieldAccess.SomeClass.x
			System.out.println(fieldValueInt); //25
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		}
	}
}
