package sist.co.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sist.co.model.SistBBSDTO;
import sist.co.service.SistBBSDao;
import sist.co.service.SistBBSService;


@Service



public class SistBBSImpl implements SistBBSService{
	
	@Autowired
	private SistBBSDao sistBBSDao;

	@Override
	@Transactional(readOnly=true)
	public List<SistBBSDTO> getBBSList() throws Exception {
		// TODO Auto-generated method stub
		return sistBBSDao.getBBSList();
	}

	@Override
	public boolean InputBBS(SistBBSDTO bbs) throws Exception {
		
		return sistBBSDao.InputBBS(bbs);
	}
	@Override
	@Transactional(readOnly=true)
	public SistBBSDTO getBBS(int seq) throws Exception {
	   return sistBBSDao.getBBS(seq);
	}


	@Override
	@Transactional
	public boolean readcount(int seq) throws Exception {
	   return sistBBSDao.readcount(seq);
	}


}
