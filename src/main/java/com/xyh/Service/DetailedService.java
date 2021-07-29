package com.xyh.Service;

import com.xyh.domain.Detailed;
import com.xyh.mapper.DetailedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailedService {
    @Autowired
    private DetailedMapper detailedMapper;


    /*
     * @Author Xss
     * @Description  查询明细表
     * @Date 11:42 2021/7/22
     * @Param
     * @return
     **/
    public Detailed selde(){
        List<Detailed> detaileds = detailedMapper.selectByExample(null);
        return  detaileds.get(0);
    }


    /*
     * @Author Xss
     * @Description  修改明细表
     * @Date 16:02 2021/7/22
     * @Param
     * @return
     **/
    public int updde(Detailed detailed){
       return detailedMapper.updateByPrimaryKeySelective(detailed);
    }
}
