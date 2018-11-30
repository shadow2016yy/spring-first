package com.ryan.www;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ryan on 2018/9/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
//@SpringBootConfiguration(classes = MockServletContext.class)
public abstract class AbstractSpringContextTest {
}
