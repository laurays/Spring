package sist.co.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sist.co.model.SistMemberDTO;
import sist.co.service.SistMemberDao;
import sist.co.service.SistMemberService;

@Service
public class SistMemberImpl implements SistMemberService{

	@Autowired SistMemberDao SistMemberDao;
	
	@Override 
	@Transactional(readOnly=true)
	public SistMemberDTO login(SistMemberDTO member) throws Exception {
		// TODO Auto-generated method stub
		return SistMemberDao.login(member);
	}

	@Override
	@Transactional
	public boolean addMember(SistMemberDTO member) throws Exception {
		// TODO Auto-generated method stub
		return SistMemberDao.addMember(member);
	}

}
