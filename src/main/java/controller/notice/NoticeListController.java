package controller.notice;

import controller.Controller;
import controller.HttpUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeListController implements Controller{

	@Override
	public void Execute(HttpServletRequest req, HttpServletResponse resp) {
		//
		//
		//
		//
		//View이동
		HttpUtil.Forword(req, resp, "/WEB-INF/View/notice/list.jsp");
		
	}

}
