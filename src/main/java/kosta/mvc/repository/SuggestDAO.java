package kosta.mvc.repository;

import java.util.List;

public interface SuggestDAO {
  /**
   * ���þ�� ���۵� �ܾ� �˻��ϱ�
   * */
	List<String> suggest(String word);
}
