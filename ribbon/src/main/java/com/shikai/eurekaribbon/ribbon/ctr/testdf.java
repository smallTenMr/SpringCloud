package com.shikai.eurekaribbon.ribbon.ctr;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

public class testdf {

    public static BigDecimal changeCents(String str){
        if(StringUtils.isEmpty(str)){
            return  new BigDecimal(0.0);
        }
        BigDecimal bigDecimal = new BigDecimal(str).divide(new BigDecimal(100));
        return  bigDecimal;
		/*if(!StringUtils.isEmpty(str)){
			if(str.contains("\"")){
				str = str.substring(1);
				str = str.substring(0,str.length()-1);
			}
			Long str1 = Long.valueOf(str.trim());
			String str2 = str1 / 100 + "." + str1 % 100 / 10 + str1 % 100 % 10;
			int idx2 = str2.lastIndexOf(".");
			String strNum2 = str2.substring(idx2+1);
			if(strNum2.equals("00")){
				return str2.substring(0,idx2);
			}else {
				if(str2.endsWith("0")){
					return str2.substring(0,str2.length()-1);
				}
				return str2;
			}
		}
        return "";*/
    }

    public static void main(String[] args) {
        System.out.println(changeCents("1222011"));
    }

}
