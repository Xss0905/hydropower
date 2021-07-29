package com.xyh.Service;

import com.xyh.domain.News;
import com.xyh.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;


    /*
     * @Author Xss
     * @Description  查询公告
     * @Date 12:43 2021/7/22
     * @Param
     * @return
     **/
    public List<News> selnews(){
        return newsMapper.selectByExample(null);
    }

    /*
     * @Author Xss
     * @Description  删除公告
     * @Date 14:28 2021/7/22
     * @Param
     * @return
     **/
    public int delnews(int id){
        return newsMapper.deleteByPrimaryKey(id);
    }

    /*
     * @Author Xss
     * @Description  添加公告
     * @Date 15:03 2021/7/22
     * @Param
     * @return
     **/
    public int addnews(News news){
        Date date = new Date();
        news.setCreatetime(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        news.setCreatetimestring(format);
        return newsMapper.insertSelective(news);
    }
}
