package com.aaa.creator2.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * 订单编号生成类
 */
public class KeyUtil {
    /**
     * 生成主键id
     * 时间+随机数
     * @return
     */
    public static synchronized String generateUniqueKey(){
        Random random = new Random();
        // 随机数的量 自由定制，这是9位随机数
        Integer r = random.nextInt(900000000) + 100000000;

        // 返回  13位时间
        Long timeMillis = System.currentTimeMillis();

        // 返回  17位时间
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss"); //SSS
        String timeStr = sdf.format(new Date());

        // 13位毫秒+9位随机数
        ///return  timeMillis + String.valueOf(r);
        // 17位时间+9位随机数
        return  timeStr;  // + r
    }

//    public static void main(String[] args) {
//        String s = generateUniqueKey();
//        System.out.println(s);
//    }

}
