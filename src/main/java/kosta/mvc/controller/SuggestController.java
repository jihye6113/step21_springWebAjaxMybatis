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
	 * jackson lib가 있기 때문에 리턴되는 List객체를 json으로
	 * 변환되어 응답된다.
	 * */
	@RequestMapping("/suggest")
	public List<String> suggest(String word){
		System.out.println("word = " + word);
		return suggestService.suggest(word);
	}
}


