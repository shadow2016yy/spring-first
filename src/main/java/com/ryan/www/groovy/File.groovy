package com.ryan.www.groovy


/**
 * Created by Ryan on 2018/11/9.
 */
class File {
    public static void main(String[] args) {
        new java.io.File("C:/Users/abc/Desktop/test.txt").eachLine {
            //需要注意文件编码格式  否则会乱码
            line->println "$line"
        }
        println("直接打印文本内容")
        java.io.File file=new java.io.File("C:/Users/abc/Desktop/test.txt")
        println(file.text)
//        file.withWriter('utf-8') {
//            writer->writer.write("刘德华是个笨小孩")
//        }
        println(file.length()+"字节")
        println(file.getAbsolutePath())
        println(file.getName())
        println(file.isFile())
        println(file.isDirectory())
        println(file.isAbsolute())
        println(file.isHidden())
        def source=new java.io.File("C:/Users/abc/Desktop/test.txt")
        def target=new java.io.File("C:/Users/abc/Desktop/test1.txt")
        //复制文件
        target<<source.text
    }
}
