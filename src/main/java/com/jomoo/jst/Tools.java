package com.jomoo.jst;

import org.joda.time.DateTime;

import java.io.*;
import java.util.Locale;

public class Tools {

	/**
	 * 
	 * 写日志
	 * 
	 * @param content
	 */
	public static void writeLogs(String content) {

        String Timestamp = new DateTime().toString("yyyy-MM-dd", Locale.CHINESE);
        String fileName = "logs/jomoo-jst-logs_" + Timestamp + ".txt";

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
