package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SysUser;
import com.example.demo.mapper.SysUserMapper;
import com.example.demo.serviceinter.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserMapper sysUserMapper;
	@Override
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}

	@Override
	public SysUser findById(Long sysuserId) {
		return sysUserMapper.findById(sysuserId);
	}

}
