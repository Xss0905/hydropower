package com.xyh.Service;

import com.xyh.domain.Detailed;
import com.xyh.domain.User;
import com.xyh.domain.UserExample;
import com.xyh.domain.Userbuy;
import com.xyh.mapper.DetailedMapper;
import com.xyh.mapper.UserMapper;
import com.xyh.mapper.UserbuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DetailedMapper detailedMapper;
    @Autowired
    private UserbuyMapper userbuyMapper;


    /*
     * @Author Xss
     * @Description  添加用户
     * @Date 18:03 2021/7/21
     * @Param
     * @return
     **/
    public int adduser(User user) {
        Detailed detailed = new Detailed();
        Integer usercount = detailed.getUsercount();
        int  usercounts= usercount+1;
        detailed.setUsercount(usercounts);
        detailedMapper.updateByPrimaryKeySelective(detailed);
        return userMapper.insertSelective(user);
    }

    /*
     * @Author Xss
     * @Description 用户登录
     * @Date 19:30 2021/7/21
     * @Param
     * @return
     **/
    public User login(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andPwdEqualTo(user.getPwd());
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0) {
            return null;
        } else {
            return users.get(0);
        }
    }

    /*
     * @Author Xss
     * @Description 根据用户名查询用户信息
     * @Date 8:37 2021/7/22
     * @Param
     * @return
     **/
    public User selbyname(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }

    /*
     * @Author Xss
     * @Description  查询用户全部信息
     * @Date 10:27 2021/7/22
     * @Param
     * @return
     **/
    public List<User> selall() {
        return userMapper.seluserinfo();
    }


    /*
     * @Author Xss
     * @Description  查询用户详细信息
     * @Date 17:19 2021/7/22
     * @Param
     * @return
     **/
    public List<User> seluser(){
        return userMapper.selectByExample(null);
    }


    /*
     * @Author Xss
     * @Description  根据主键查询用户
     * @Date 17:41 2021/7/22
     * @Param
     * @return
     **/
    public User selbyid(int id){
        return userMapper.selectByPrimaryKey(id);
    }


    /*
     * @Author Xss
     * @Description  修改用户信息
     * @Date 8:59 2021/7/23
     * @Param
     * @return
     **/
    public int updu(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }


    /*
     * @Author Xss
     * @Description  删除用户
     * @Date 9:05 2021/7/23
     * @Param
     * @return
     **/
    public int deluser(int id){
        return userMapper.deleteByPrimaryKey(id);
    }



    /*
     * @Author Xss
     * @Description  修改用户信息
     * @Date 12:05 2021/7/23
     * @Param
     * @return
     **/

    public int upduser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /*
     * @Author Xss
     * @Description 查看当前用户购买列表
     * @Date 15:04 2021/7/23
     * @Param
     * @return
     **/
    public List<Userbuy> selbuynow(String name){
        return userbuyMapper.selbyname(name);
    }

    /*
     * @Author Xss
     * @Description  购买流程！！！
     * @Date 15:36 2021/7/23
     * @Param
     * @return
     **/
    public void buybuybuy(User user,String name){
        Integer ele = user.getEle();//获取用户想要购买的电量
        Integer water = user.getWater();//获取用户想要购买的水量
        if(ele==null){
            ele=0;
        }else if(water==null){//若只买电或只买水
            water=0;
        }
        List<Detailed> detaileds = detailedMapper.selectByExample(null);
        Detailed detailed = detaileds.get(0);//获取明细表内容
        Integer elemoney = detailed.getElemoney();//获取每度电的价格
        Integer watermoney = detailed.getWatermoney();//获取每kg水的价格
        Integer income = detailed.getIncome();//获取当前收入
        Integer surele = detailed.getSurele();//获取当前剩余电量
        Integer surwater = detailed.getSurwater();//获取当前剩余水量
        Integer id1 = detailed.getId();//获取当前明细表id


        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(name);
        List<User> users = userMapper.selectByExample(userExample);
        User user1 = users.get(0);//获取当前用户的基本信息
        Integer water1 = user1.getWater();//获取用户的当前水量
        if(water1==null){
            water1=0;
        }
        Integer ele1 = user1.getEle();//获取用户的当前电量
        if(ele1==null){
            ele1=0;
        }
        Integer money = user1.getMoney();//获取用户的当前余额

        Integer id = user1.getId();//获取当前用户的id


        Userbuy userbuy = new Userbuy();//用户购买记录表
        Date date = new Date();
        userbuy.setBuytime(date);//购买时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        userbuy.setBuytimestring(format);//购买时间的String
        userbuy.setUserid(id);//用户id存入userid
        userbuy.setEle(ele);//用户买的电量
        userbuy.setEle(water);//用户买的水量
        userbuyMapper.insertSelective(userbuy);//用户购买信息表添加一条信息

        int elenow = ele1+ele;//当前电量+购买电量
        int waternow = water1+water;//当前水量+购买水量
        int elecount = elemoney*ele;//电量总价
        int moneycount = watermoney*water;//水量总价
        int moneynow = money-elecount-moneycount;//获得当前余额

        User user2 = new User();//进入修改用户信息
        user2.setEle(elenow);
        user2.setWater(waternow);
        user2.setMoney(moneynow);
        user2.setId(id);
        userMapper.updateByPrimaryKeySelective(user2);



        int deincome = income+elecount+moneycount;//当前收入+电量总价+水量总价
        int desurele = surele-ele;//当前剩余电量-购买电量
        int desurwater = surwater-water;//当前剩余水量-购买水量

        Detailed detailed1 = new Detailed();//进入修改明细信息
        detailed1.setIncome(deincome);
        detailed1.setSurele(desurele);
        detailed1.setSurwater(desurwater);
        detailed1.setId(id1);
        detailedMapper.updateByPrimaryKeySelective(detailed1);



    }

}
