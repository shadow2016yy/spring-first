package com.ryan.www.drool;

import com.ryan.www.dto.User;
import org.assertj.core.util.Lists;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Ryan on 2019/2/20.
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        execute( kc );
    }

    public static void execute( KieContainer kc ) throws Exception{
        KieSession ksession = kc.newKieSession("point-rulesKS");
        List<User> orderList = getInitData();
        for (int i = 0; i < orderList.size(); i++) {
            User o = orderList.get(i);
            ksession.insert(o);
            ksession.fireAllRules();
            System.out.println(o);
        }
        ksession.dispose();
    }

    private static List<User> getInitData() {
        List<User> list= Lists.newArrayList();
        User user= User.builder()
                .amout(100)
                .build();
        list.add(user);

        User user1= User.builder()
                .amout(600)
                .build();
        list.add(user1);

        User user2= User.builder()
                .amout(1600)
                .build();
        list.add(user2);
        return  list;
    }
}
