package ans6;

public class Employee {
int eid;
String Name;
int age;
public Employee(int eid, String name, int age) {
	super();
	this.eid = eid;
	Name = name;
	this.age = age;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", Name=" + Name + ", age=" + age + "]";
}

}
