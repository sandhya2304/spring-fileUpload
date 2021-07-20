package springmvcupload;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

public class Student 
{
	@NonNull
	Long id;
	
	
	String name;
	@DateTimeFormat(pattern="dd/mm/yyyy")
	Date date;
	String gender;
	String mytype;
	List<String> courses;
	
	
	Address address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Student(Long id, String name, Date date, String gender, String mytype, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.mytype = mytype;
		this.courses = courses;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMytype() {
		return mytype;
	}


	public void setMytype(String mytype) {
		this.mytype = mytype;
	}


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + date + ", gender=" + gender + ", mytype=" + mytype
				+ ", courses=" + courses + ", address=" + address + "]";
	}





	

}
