package com.atguigu.pojo;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {
    @Test
    public void test1() throws Exception {
        // 第一步，通过创建 SAXReader 对象。来读取 xml 文件，获取 Document 对象
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("src/books.xml");
           // 第二步，通过 Document 对象。拿到 XML 的根元素对象
     Element rootElement =document.getRootElement();

      // 打印测试
       //它将当前元素转换成为 String 对象
       // System.out.println(rootElement.asXML());
        // 第三步，通过根元素对象。获取所有的 book 标签对象
      // Element.elements(标签名)它可以拿到当前元素下的指定的子元素的集合
        List<Element> books = rootElement.elements("book");
        for (Element book: books){
         //  System.out.println(book.asXML());
            Element nameElement =book.element("name");
            //System.out.println(nameElement.asXML());
            String nameText =nameElement.getText();
           // System.out.println(nameText);
            String priceText =book.elementText("price");
            System.out.println(priceText);
            System.out.println(book.attributeValue("sn"));
        }


    }

}
