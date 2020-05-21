package kosta.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.domain.Member;

@RestController //@Controller + @ResponseBody
public class AjaxStartController {
	
	//@RequestMapping("/load")
	@RequestMapping(value = "/load", produces = "text/html;charset=UTF-8")
	public String load() {
		return "Have a nice Day! - �������..";
	}
	
	@PostMapping(value = "/ajax",produces = "text/html;charset=UTF-8")
	public String ajax(String name) {
		return name+"�� �氡�氡~~~";
	}
	
	/**
	 * jackson LIB�� ������ ���䰴ü�� �ڹ��� ��ü Ÿ���ΰ�쿡
	 *  �߰��� JSON�� ���·� ���� ���������� �������ش�.
	 * */
	@RequestMapping(value = "/array")
	public  List<String> array(){
		
		List<String> menus = 
				Arrays.asList(new String [] {"¥��","«��","������","«¥��"});
		
		return menus;
	}
	
	@RequestMapping("/jsonDTO")
	public Member test() {
		
		return new Member("jang", 20,"�Ǳ�","1111");
	}
	
	@RequestMapping("/jsonList")
	public List<Member> list(){
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("kim", 18, "�뱸", "111-2222"));
		list.add(new Member("queen", 25, "���ֵ�", "333-2222"));
		list.add(new Member("king", 15, "�λ�", "444-2222"));
		list.add(new Member("girl", 19, "����", "555-2222"));
		list.add(new Member("bbb", 20, "�뱸", "666-2222"));
		list.add(new Member("ccc", 21, "����", "777-2222"));
		
		return list;
	}
	
	@RequestMapping("/jsonMap")
	public Map<String, Object> map(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("message", "������� ���..");
		map.put("pageNum", 10);
		
       List<Member> list = new ArrayList<Member>();
		list.add(new Member("kim", 18, "�뱸", "111-2222"));
		list.add(new Member("queen", 25, "���ֵ�", "333-2222"));
		list.add(new Member("king", 15, "�λ�", "444-2222"));
		list.add(new Member("girl", 19, "����", "555-2222"));
		list.add(new Member("bbb", 20, "�뱸", "666-2222"));
		list.add(new Member("ccc", 21, "����", "777-2222"));
		
		map.put("memberList", list);
		map.put("dto", new Member("jang", 20,"�Ǳ�","1111"));
		
		return map;
	}
	

}












