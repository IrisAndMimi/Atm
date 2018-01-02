package irisandmimi.com.atm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2018/1/2.
 */

public class Teater {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
//              j-u-Date
/*             System.out.println(now.getTime());
                取得毫秒值   */
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));
        String s = "1998-01-10";
        try {
            Date birthday = sdf.parse(s);
            System.out.println(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
