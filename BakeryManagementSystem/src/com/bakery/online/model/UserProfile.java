package com.bakery.online.model;

import javax.persistence.*;

import com.bakery.online.model.stock.Item;
import java.util.*;

@Entity
@Table(name = "bms_user_profile", catalog = "bmsdb")
@TableGenerator(name = "prof_tab_gen", allocationSize = 1, initialValue = 100, catalog = "bmsdb", table = "bms_table_gen", pkColumnName = "name", valueColumnName = "value", pkColumnValue = "prof_id")
public class UserProfile  {

	@Id
	@Column(name = "prof_id")
	@GeneratedValue(generator = "prof_tab_gen", strategy = GenerationType.TABLE)
	private Integer id;
	@Column(name = "first_name", nullable = false, length = 100)
	private String firstName;
	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;
	@Column(name = "mobile_no", nullable = false, length = 50)
	private String mobileNo;
	private Address address;
	private UserCredential credential;
	@OneToMany
	@JoinColumn(name="item_id")
    private Set<Item> item=new HashSet<>() ;
	
	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "email_id")
	public UserCredential getCredential() {
		return credential;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCredential(UserCredential credential) {
		this.credential = credential;
	}

}
