package kosta.mvc.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kosta.mvc.model.domain.Student;

public interface StudentMapper {
  
	/**
	 * ��ü�˻�
	 * */
	@Select("select * from student")
	List<Student> selectAll();
	/**
	 * ����ϱ�
	 * */
	@Insert("insert into student \r\n" + 
			"values(#{stNo},#{stName},#{stAge},#{stAddr},#{stPhone})")
	int insert(Student student);
	
	/**
	 * �ߺ�üũ
	 * */
	@Select("<script>select * from student\r\n" + 
			"    <where>\r\n" + 
			"      <if test=\"_parameter!=null\">\r\n" + 
			"         st_no = #{stNo}\r\n" + 
			"      </if>\r\n" + 
			"    </where></script>")
	Student selectByStNo(String stNo);
	
	/**
	 * �����ϱ� 
	 * */
	@Delete("delete from student where st_no=#{stNo}")
	int delete(String stNo);
}

