package com.drz.community;

import com.drz.community.dao.DiscussPostMapper;
import com.drz.community.dao.UserMapper;
import com.drz.community.entity.DiscussPost;
import com.drz.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@SpringBootTest             //目的是加载ApplicationContext，启动spring容器。
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);

        user = userMapper.selectByName("liubei");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }
    @Test
    public void textSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0,0,10);
        for (DiscussPost post : list){
            System.out.println(post);
        }
    }
}
