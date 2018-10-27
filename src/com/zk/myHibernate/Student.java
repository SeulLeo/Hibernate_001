package com.zk.myHibernate;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sno;
	private String sname;
	private Integer sgrade;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Student(Integer sno, String sname, Integer sgrade) {
		this.sno = sno;
		this.sname = sname;
		this.sgrade = sgrade;
	}

	// Property accessors

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSgrade() {
		return this.sgrade;
	}

	public void setSgrade(Integer sgrade) {
		this.sgrade = sgrade;
	}

}