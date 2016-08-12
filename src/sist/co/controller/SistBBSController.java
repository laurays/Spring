package sist.co.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sist.co.model.SistBBSDTO;
import sist.co.service.SistBBSService;

@Controller
public class SistBBSController {
	
	private static final Logger logger = LoggerFactory.getLogger(SistBBSController.class);
	
	
	@Autowired
	private SistBBSService sistBBSService;
	
	@RequestMapping(value="bbslist.do",method={RequestMethod.GET,RequestMethod.POST})
	public String bbslist(Model model) throws Exception{
		logger.info("SistBBSCOntroller의 bbslist  " + new Date());
		List<SistBBSDTO> bbslist =  sistBBSService.getBBSList();
	      model.addAttribute("bbslist", bbslist);
		return "bbslist";
	}
	

	@RequestMapping(value="bbswrite.do",method={RequestMethod.GET,RequestMethod.POST})
	public String bbswrite(Model model) throws Exception{
		logger.info("SistBBSCOntroller의 bbswrite  " + new Date());
		return "bbswrite";
	}
	
	@RequestMapping(value="bbswriteAf.do",method=RequestMethod.GET)
	public String bbswriteAf(SistBBSDTO bbs, Model model) throws Exception{
		logger.info("SistBBSCOntroller의 bbswriteAf  " + new Date());
		sistBBSService.InputBBS(bbs);
		return "redirect:/bbslist.do";
	}
	
	   @RequestMapping(value="bbsdetail.do",method={RequestMethod.GET,RequestMethod.POST})
	   public String bbsdetail(int seq,Model model)throws Exception{
	      logger.info("환영합니다 SistBBSController 의 bbsdetail"+new Date());   
	      
	      SistBBSDTO bbs = null;
	      sistBBSService.readcount(seq);
	      bbs=sistBBSService.getBBS(seq);
	      
	      model.addAttribute("bbs", bbs);
	      return "bbsdetail";
	   }
}





