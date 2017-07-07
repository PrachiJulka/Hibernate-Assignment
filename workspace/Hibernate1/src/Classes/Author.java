package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name="Author")
public class Author {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="authID")
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date")
	private Date date;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Transient
	@Column(name="LastName")
	private String lastName;
	
	
	@Embedded
	private Address add;
	
	
	@OneToMany(mappedBy="auth",cascade=CascadeType.PERSIST)
	List<Book> buk=new ArrayList<>();
	
	public List<Book> getBuk() {
		return buk;
	}
	public void setBuk(List<Book> buk) {
		this.buk = buk;
	}
	@Column(name="Age")
	private int age;

	
	@ElementCollection
	private List<String> ls=new ArrayList<>();
	public Address getAdd() {
		return add;
	}
	public List<String> getLs() {
		return ls;
	}
	public void setLs(List<String> ls) {
		this.ls = ls;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
