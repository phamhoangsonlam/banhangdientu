package com.lamphs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Student")
public class Student {
	@Id
	String id;
	String name;
	String phone;
}
