package sist.co.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sist.co.model.SistBBSDTO;

@Repository
public class SistBBSDao {
	
	
	@Autowired // DI(의존성 주입)
	private SqlSession sqlSession; //new생략가능
	private String ns ="SistBBS.";
	
	public List<SistBBSDTO> getBBSList()throws Exception{
		List<SistBBSDTO> list = new ArrayList<SistBBSDTO>();
		list = sqlSession.selectList(ns+"getBBSList");
		return list;
	}
	
	public boolean InputBBS(SistBBSDTO bbs)throws Exception{
		
		sqlSession.insert(ns+"InputBBS",bbs);
		return true;
	}
	public SistBBSDTO getBBS(int seq)throws Exception{
	      SistBBSDTO bbs = null;
	      bbs = sqlSession.selectOne(ns+"getBBS",seq);
	      String temp = bbs.getContent().replaceAll("\n", "<br>");
	      bbs.setContent(temp);
	      return bbs;
	  }
	 
	public boolean readcount(int seq)throws Exception{
	      sqlSession.update(ns+"readcount",seq);
	      
	      return true;
	   }
	
}
