package com.jomoo.jst;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {

	
	/**
	 * 
	 * 写日志
	 * 
	 * @param fileName
	 * @param content
	 */
	public static void writeLogs(String fileName, String content) {
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
