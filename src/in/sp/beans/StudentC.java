package in.sp.beans;

public class StudentC {
	String name;
	String  email;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
public void show() {
		
		
		System.out.println(age + "--" + email + "--" +name);
	}
}