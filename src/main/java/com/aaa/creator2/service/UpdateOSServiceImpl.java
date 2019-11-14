package com.aaa.creator2.service;


import com.aaa.creator2.mapper.UpdateOSMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UpdateOSServiceImpl implements UpdateOSService {
    @Resource
    private UpdateOSMapper updateOSMapper;
    @Override
    public int updateOS(Integer oid) {
        return updateOSMapper.updateOS(oid);
    }
}
