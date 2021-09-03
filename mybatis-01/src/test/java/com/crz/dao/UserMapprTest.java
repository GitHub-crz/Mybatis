package com.crz.dao;

import com.crz.poji.User;
import com.crz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapprTest {
    @Test
    public void test(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try {
            UserMappr usermappr=sqlSession.getMapper(UserMappr.class);
            List<User> userlist=usermappr.getUserList();
            for(User user :userlist){
                System.out.println(user);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try {
            UserMappr usermappr=sqlSession.getMapper(UserMappr.class);
            User user=usermappr.getUserByid(1);
            System.out.println(user);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void testdelete(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMappr userMappr=sqlSession.getMapper(UserMappr.class);
        int num=userMappr.deleteUser(5);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testadd(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try {
            UserMappr usermappr=sqlSession.getMapper(UserMappr.class);
            int num=usermappr.addUser(new User(5,"赵六","789"));
            System.out.println(num);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testupdata(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try {
            UserMappr usermappr=sqlSession.getMapper(UserMappr.class);
            int num=usermappr.updataUser(new User(4,"美克","0331"));
            System.out.println(num);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
    @Test
    public void testupdatepwd(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMappr mappr=sqlSession.getMapper(UserMappr.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id","1");
        map.put("pwd","0313");
        int num=mappr.updatapwd(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testgetpartAttributes(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMappr mappr=sqlSession.getMapper(UserMappr.class);
        List<Map> map=mappr.getpartAttributes("0331");
        for(Map m:map){
            System.out.println(m);
        }
        //System.out.println(map);
        sqlSession.commit();
        sqlSession.close();
    }


}
