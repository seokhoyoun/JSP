package notice.model.vo;

import java.util.Comparator;

public class NoticeNoDesc implements Comparator<Notice>{

	@Override
	public int compare(Notice o1, Notice o2) {
		return (o1.getNoticeNo() < o2.getNoticeNo()) ? 1 : -1;
	}



}
