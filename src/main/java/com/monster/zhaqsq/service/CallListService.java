package com.monster.zhaqsq.service;

import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.CallListExample;
import com.monster.zhaqsq.dao.CallListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallListService {

    @Autowired
    CallListMapper calllistMapper;

    /**
     * 查询所有任务
     * @return
     */
    public List<CallList> getAll() {
        return calllistMapper.selectByExample(null);
    }

    /**
     * 任务保存
     * @param calllist
     */
    public void saveCall(CallList calllist) {
        calllistMapper.insertSelective(calllist);
    }

    /**
     * 按照任务id查询任务
     * @param id
     * @return
     */
    public CallList getCall(Integer id) {
        CallList calllist = calllistMapper.selectByPrimaryKey(id);
        return calllist;
    }

    /**
     * 任务删除
     * @param id
     */
    public void deleteCall(Integer id) {
        calllistMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids) {
        CallListExample example = new CallListExample();
        CallListExample.Criteria criteria = example.createCriteria();
        criteria.andCallIdIn(ids);
        calllistMapper.deleteByExample(example);
    }
}
