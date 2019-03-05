package notice.model.vo;

import java.util.Comparator;

public class NoticeNoAsc implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		return n1.compareTo(n2);
	}

}
