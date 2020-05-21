package kosta.mvc.repository;

import java.util.List;

import kosta.mvc.model.domain.Student;

public interface StudentDAO {
  /**
   * Student ��ü�˻�
   * */
	
	List<Student> selectAll();
	
  /**
   * �й� �ߺ�üũ
   * */
	Student selectByStNo(String stNo);
	
	/**
	 * ����ϱ�
	 * */
	int insert(Student student);
	
	/**
	 * �����ϱ�
	 * */
	int update(Student student);
	
	/**
	 * �����ϱ�
	 * */
	int delete(String stNo);
}


