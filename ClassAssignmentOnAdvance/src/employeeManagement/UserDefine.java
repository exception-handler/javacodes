package employeeManagement;

public class UserDefine extends Exception{
private String msg="already exists";

public UserDefine()
{}
public UserDefine(String msg) {
	super();
	this.msg = msg;
}

@Override
public String toString() {
	return "UserDefine [msg=" + msg + "]";
}

}
