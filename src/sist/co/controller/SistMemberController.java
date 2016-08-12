package sist.co.controller;

import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sist.co.model.SistMemberDTO;
import sist.co.service.SistMemberService;


@Controller
public class SistMemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(SistMemberController.class);
	
	@Autowired
	SistMemberService sistMemberService;
	
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String login(Model model){
		logger.info("환영합니다 SistMemberController 의 login"+new Date());
		return "login";
	}

	@RequestMapping(value="regi.do",method=RequestMethod.GET)
	public String regi(Model model){
		logger.info("환영합니다 SistMemberController 의 regi"+new Date());
		return"regi";
	}
	
	
	@RequestMapping(value="regiAf.do", method=RequestMethod.POST)
	public String regiAf(SistMemberDTO member, Model model)throws Exception{
		logger.info("환영합니다 SistMemberController 의 regiAf"+new Date());
		sistMemberService.addMember(member);
		//DB이동
		return "redirect:/login.do";
	}
	
	@RequestMapping(value="loginAf.do", method=RequestMethod.POST)
	public String loginAf(HttpServletRequest request, SistMemberDTO member,Model model)throws Exception{
		logger.info("환영합니다 SistMemberController 의 loginAf"+new Date());
		
		SistMemberDTO login = null;
		login=sistMemberService.login(member);
		
		if(login !=null && !login.getId().equals("")){
			request.getSession().setAttribute("login", login);
			return "login";
		}else{
			return "redirect:/login.do";
		}
	}
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest request,Model model){
			logger.info("환영합니다 SistMemberController 의 logout"+new Date());
			request.getSession().invalidate();
			
		return "redirect:/login.do";
	}
	
}








