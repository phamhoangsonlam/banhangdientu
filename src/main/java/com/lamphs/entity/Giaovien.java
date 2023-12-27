package com.lamphs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "giaovien")
public class Giaovien {
	@Id
	String maGV;
	String tenGV;
	String diachi;
}
