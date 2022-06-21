package com.xworkz.login.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "placement")
public class UserEntity {

	@Id
	@Column(name = "User-Name")
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name = "auto", strategy = "increment")
	private int id;
	private String username;
	private String email;
	private String gender;
	private long contactno;
	private String password;
}