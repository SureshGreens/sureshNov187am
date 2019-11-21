package org.cts.tester.login;

public class Employee {
private void empID()
{
	System.out.println("Employee Id is 123");
}
private void empName()
{
	System.out.println("Employee Name is Suresh");
}
private void empDOB()
{
	System.out.println("Employee DOB is 21/02/1988");
}
private void empPhone()
{
	System.out.println("Employee Phone no is 123456");
}
private void empEmail()
{
	System.out.println("Employee Email is 123@gmail.com");
}
private void empAddress()
{
	System.out.println("Employee Address is Chennai 97");
}

public static void main(String[] args) {
	Employee e  = new Employee();
	e.empID();
	e.empName();
	e.empDOB();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
