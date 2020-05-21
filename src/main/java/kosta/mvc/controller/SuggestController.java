package kosta.mvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.service.SuggestService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SuggestController {
	
	private final SuggestService suggestService;

	/**
	 * jackson lib�� �ֱ� ������ ���ϵǴ� List��ü�� json����
	 * ��ȯ�Ǿ� ����ȴ�.
	 * */
	@RequestMapping("/suggest")
	public List<String> suggest(String word){
		System.out.println("word = " + word);
		return suggestService.suggest(word);
	}
}


