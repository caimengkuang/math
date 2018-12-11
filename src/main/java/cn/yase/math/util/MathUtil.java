package cn.yase.math.util;

import java.math.BigDecimal;

/**
 * java 计算工具类
 * @author yase
 * @create 2018-12-05
 */
public class MathUtil {

    /**
     * 四舍五入保留3位小数
     * @param divisor     除数
     * @param dividend    被除数
     * @return
     */
    public static String getDivision(int divisor,int dividend){
        return new BigDecimal(divisor)
                .divide(new BigDecimal(dividend),3,BigDecimal.ROUND_HALF_UP)
                .toString();
    }

}
