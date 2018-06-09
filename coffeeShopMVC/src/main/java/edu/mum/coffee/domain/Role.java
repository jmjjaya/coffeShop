/**
 * 
 */
package edu.mum.coffee.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author jeewa
 *
 */
@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String name;
  	
	@ManyToMany(mappedBy = "roles")
 	private List<User> users;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}  	
}
