package kosta.mvc.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.mvc.model.domain.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SqlSession session;

	@Override
	public List<Student> selectAll() {
		List<Student> list = session.selectList("studentMapper.selectAll");
		return list;
	}

	@Override
	public Student selectByStNo(String stNo) {
		
		return session.selectOne("studentMapper.selectAll", stNo);
	}

	@Override
	public int insert(Student student) {
		
		return session.insert("studentMapper.insert" , student);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String stNo) {
		return session.delete("studentMapper.delete", stNo);
	}

}



