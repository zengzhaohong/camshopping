package com.speeder.camshopping;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����spring��Junit���ϣ�Junit����ʱ����SpringIOC����
 * @author zengzhaohong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//����Junit spring�����ļ���λ��
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
