package controller.board;

import controller.Controller;
import controller.HttpUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BoardService;

public class BoardPostController implements Controller {

	@Override
	public void Execute(HttpServletRequest req, HttpServletResponse resp) {
		String flag=req.getParameter("flag");
		if(flag.equals("true")) {
			//View이동
			HttpUtil.Forword(req, resp, "/WEB-INF/View/board/post.jsp");
		}
		else //폼에 입력한 다음 Post처리요청
		{
			//
			
			//서비스실행
			BoardService service=BoardService.getInstance();
			service.BoardPost(req);
			
			try {
				resp.sendRedirect("/Board/list.do");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
