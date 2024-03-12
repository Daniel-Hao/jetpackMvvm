package com.example.jetpackmvvm.test;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.airbnb.lottie.animation.content.Content;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.InputStreamReader;

/**
 * @author 下一季
 */

class BookContent {

    int chapterId;// 章节id
    int bookId;// 图书id
    String chapterName;// 章节名
    String content;// 当前章节内容
    int order;// 章节序号

    public BookContent(int chapterId, int bookId, String chapterName, int order) {// 构造方法(缺少一个成员变量)

        this.order = order;
        this.bookId = bookId;
        this.chapterId = chapterId;
        this.chapterName = chapterName;

    }

}

public class ParseBookContentUtil {

    public static void main(String[] args) {
        // JdbcConnection.insertSQL(parse(1, "C://Users//下一季//Desktop//一念永恒.txt"));// 把获取后的list插入到SQLserver
    }

    public static int idCount = 1;// 手动增加 章节id ，导入多个小说文件时，避免id重复

    public static void parse(Context context, int BookId, String path) {

        ArrayList<BookContent> list = new ArrayList<>();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    AssetManager assetManager = context.getAssets();
                    // 打开assets目录下的文件
                    InputStream inputStream = assetManager.open("光阴之外.txt");

            /*File file = new File(path);
            if (!file.isFile() || !file.exists()) {
                return null;
            }*/

                    InputStreamReader read = new InputStreamReader(inputStream, "UTF-8");

                    BufferedReader bufferedReader = new BufferedReader(read);

                    int count = 1;
                    String lineTxt = null;


                    StringBuilder lastBuilder = null;
                    BookContent lastBookContent = null;

                    while ((lineTxt = bufferedReader.readLine()) != null) {

                        lineTxt = lineTxt.trim();

//				正则表达式：我的小说章节名是以 ###开头，###结尾 ，所以用第二个更好
                        Pattern p = Pattern.compile("(第\\S*)[章节卷集部篇回](\\s)(\\S*)[^#]");
//				Pattern p = Pattern.compile("(###)(.*)(###)");
                        Matcher matcher = p.matcher(lineTxt);

                        if (matcher.find()) {

                            if (lastBookContent != null) {
                                lastBookContent.content = lastBuilder.toString();
                                list.add(lastBookContent);
//						System.out.println(lastBuilder.toString());// 输出当前的章节内容，建议设置输出长度
                            }

                            BookContent newBookContent = new BookContent(idCount++, BookId, matcher.group(), count++);
//					System.out.println(newBookContent.chapterName);// 输出当前的章节名

                            lastBuilder = new StringBuilder();
                            lastBookContent = newBookContent;

                        } else if (lastBuilder != null) {
                            lastBuilder.append(lineTxt + "\n");
                        }

                    }

//			以防最后一个章节无法读取
                    if (lastBuilder != null) {
                        lastBookContent.content = lastBuilder.toString();
                        list.add(lastBookContent);
                    }

                    bufferedReader.close();

                } catch (Exception e) {
                    Log.e("hdl", "文件读取失败");
                    System.out.println("文件读取失败");
                    e.printStackTrace();
                } finally {
                    if (list != null) {
                        Log.e("hdl", "size=" + list.size());

                        int ii = 1;
                        for (BookContent content : list) {
                            ii++;
                            Log.e("hdl", "chapterName=" + content.chapterName);
                            //Log.e("hdl", "chapterName=" + content.content);
                           /* if (ii > 2) {
                                break;
                            }*/
                        }
                    } else {
                        Log.e("hdl", "list==null");
                    }
                    //return list;

                }
            }
        }).start();


    }

}
