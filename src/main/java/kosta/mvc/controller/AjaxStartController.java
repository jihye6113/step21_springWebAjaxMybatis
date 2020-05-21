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
		return "Have a nice Day! - 배고프다..";
	}
	
	@PostMapping(value = "/ajax",produces = "text/html;charset=UTF-8")
	public String ajax(String name) {
		return name+"님 방가방가~~~";
	}
	
	/**
	 * jackson LIB가 있으면 응답객체가 자바의 객체 타입인경우에
	 *  중간에 JSON의 형태로 만들어서 브라우져에서 응답해준다.
	 * */
	@RequestMapping(value = "/array")
	public  List<String> array(){
		
		List<String> menus = 
				Arrays.asList(new String [] {"짜장","짬뽕","탕수육","짬짜면"});
		
		return menus;
	}
	
	@RequestMapping("/jsonDTO")
	public Member test() {
		
		return new Member("jang", 20,"판교","1111");
	}
	
	@RequestMapping("/jsonList")
	public List<Member> list(){
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("kim", 18, "대구", "111-2222"));
		list.add(new Member("queen", 25, "제주도", "333-2222"));
		list.add(new Member("king", 15, "부산", "444-2222"));
		list.add(new Member("girl", 19, "서울", "555-2222"));
		list.add(new Member("bbb", 20, "대구", "666-2222"));
		list.add(new Member("ccc", 21, "성남", "777-2222"));
		
		return list;
	}
	
	@RequestMapping("/jsonMap")
	public Map<String, Object> map(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("message", "밥먹으로 고고..");
		map.put("pageNum", 10);
		
       List<Member> list = new ArrayList<Member>();
		list.add(new Member("kim", 18, "대구", "111-2222"));
		list.add(new Member("queen", 25, "제주도", "333-2222"));
		list.add(new Member("king", 15, "부산", "444-2222"));
		list.add(new Member("girl", 19, "서울", "555-2222"));
		list.add(new Member("bbb", 20, "대구", "666-2222"));
		list.add(new Member("ccc", 21, "성남", "777-2222"));
		
		map.put("memberList", list);
		map.put("dto", new Member("jang", 20,"판교","1111"));
		
		return map;
	}
	

}












