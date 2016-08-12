package sist.co.service;

import java.util.List;

import sist.co.model.SistBBSDTO;

public interface SistBBSService {
	List<SistBBSDTO> getBBSList()throws Exception;
	boolean InputBBS(SistBBSDTO bbs) throws Exception;
	  SistBBSDTO getBBS(int seq)throws Exception;
	     boolean readcount(int seq)throws Exception;
}
