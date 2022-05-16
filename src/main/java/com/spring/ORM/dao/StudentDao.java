package com.spring.ORM.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.ORM.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	//save student
	public int insert(Student student)
	{
		//inserts student
		return (Integer) hibernateTemplate.save(student);
	}
}
