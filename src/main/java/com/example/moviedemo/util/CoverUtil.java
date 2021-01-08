package com.example.moviedemo.util;

/**
 * 新增工具类
 */
public class CoverUtil {

    public static String coverCut(String cover){
        String coverResult = cover.substring(5,cover.length()-4);
        return coverResult;
    }
}
