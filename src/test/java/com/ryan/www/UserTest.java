package com.ryan.www;

/**
 * created by  Ryan on  2020-08-08-22:12
 */
public class UserTest {
    static  int a=10;

    public static void main(String[] args) {
      try{

          String a=new String("4");
          String b=new String("4");
          System.out.println(a.hashCode());
          System.out.println(b.hashCode());
          System.out.println(a==b);
          String c="1"+"2";
          String d="12";
          System.out.println(c==d);
          String s1="5";
          String s2="6";
          String s3=s1+s2;
          //intern操作是把字符串写入常量池
          s3.intern();
          String s4="56";
          System.out.println(s3==s4);
          String s7 = "子牙" + "子牙";
          String s8 = "子牙" + new String("真帅");
          String s9 = "子牙" +"真帅";

          String s10 = "kobe" + new String("伟大的黑曼巴");
          int age;


      }catch (Exception e){

      }
    }
    public  void  add(){

    }
}
