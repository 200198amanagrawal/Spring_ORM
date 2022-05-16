package com.spring.ORM.dao;

import java.util.List;

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

	/*
	 * CRUD based functions which will allow to create,read,update and delete.
	 * */
	@Transactional
	//save student
	public int insert(Student student)
	{
		//inserts student
		return (Integer) hibernateTemplate.save(student);
	}
	
	public Student getStudent(int id)
	{
		return hibernateTemplate.get(Student.class, id);
	}
	
	public List<Student> getAllStudents()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getStudent(id));
	}
	
	@Transactional
	public void update(Student student)
	{
		hibernateTemplate.update(student);
	}
}
