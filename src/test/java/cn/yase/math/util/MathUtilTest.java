package cn.yase.math.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author yase
 * @create 2018-12-05
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MathUtilTest {

    @Test
    public void getDivision() {
        String division = MathUtil.getDivision(2, 3);
        System.out.println("division = "+division);
    }
}