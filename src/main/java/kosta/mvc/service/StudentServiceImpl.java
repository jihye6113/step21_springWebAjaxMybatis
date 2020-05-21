package kosta.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.mvc.model.domain.Student;
import kosta.mvc.repository.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDao;

	@Override
	public List<Student> selectAll() {
		return studentDao.selectAll();
	}

	@Override
	public String stNoCheck(String stNo) {
		Student student = studentDao.selectByStNo(stNo);
		if(student==null) return "��밡���մϴ�.";
		else return "�̹̻�����Դϴ�.";
		
	}

	@Override
	public int insert(Student student) {
		return studentDao.insert(student);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String stNo) {
		return studentDao.delete(stNo);
	}

}
