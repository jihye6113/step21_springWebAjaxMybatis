package kosta.mvc.service;

import java.util.List;

import kosta.mvc.model.domain.Student;

public interface StudentService {
	
  /**
   * ��ü�˻�
   * */
	List<Student> selectAll();
	
	/**
	 * �й� �ߺ� üũ
	 * @return : ���� stNo�� �����Ѵٸ� "����Ҽ� �����ϴ�."
	 *                       ���ٸ�  "��밡���մϴ�." ����
	 * */
	String  stNoCheck(String stNo);
	
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





