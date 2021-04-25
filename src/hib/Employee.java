package hib;

public class Employee {
private int id;
private String name;
private String address;
private float salary;
public Employee(int id, String name, String address, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public Employee() {
	
}
public void setAddress(String address) {
	this.address = address;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}

}
