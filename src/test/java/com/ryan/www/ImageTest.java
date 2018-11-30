package com.ryan.www;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 * Created by Ryan on 2018/11/22.
 */
public class ImageTest {
    public static void main(String[] args) {
        int width = 300;
        int height = 300;
        String format = "jpeg";
        String contents="http://weixin.qq.com/q/02PidvdsM3bi-10000M03b";

        HashMap hashMap = new HashMap();

        hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hashMap.put(EncodeHintType.MARGIN, 2);
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height,hashMap);

            Path file = new File("D:/pekonQrcode.jpg").toPath();   //已存在的一张二维码图片
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
            //读取二维码图片
            BufferedImage twodimensioncode =  ImageIO.read(new File(file.toString()));
            //获取画笔
            Graphics2D g = twodimensioncode.createGraphics();
            //读取logo图片
            BufferedImage logo = ImageIO.read(new File("D:/pekon.jpg"));  //加入的log图片
            //设置二维码大小，太大，会覆盖二维码，此处20%
            int logoWidth = logo.getWidth() > twodimensioncode.getWidth()*2 /10 ? (twodimensioncode.getWidth()*2 /10) : logo.getWidth();
            int logoHeight = logo.getHeight() > twodimensioncode.getHeight()*2 /10 ? (twodimensioncode.getHeight()*2 /10) : logo.getHeight();
            //设置logo图片放置位置
            //中心
            int x = (twodimensioncode.getWidth() - logoWidth) / 2;
            int y = (twodimensioncode.getHeight() - logoHeight) / 2;
            //开始合并绘制图片
            g.drawImage(logo, x, y, logoWidth, logoHeight, null);
            g.drawRoundRect(x, y, logoWidth, logoHeight, 15 ,15);
            //logo边框大小
            g.setStroke(new BasicStroke(2));
            //logo边框颜色
            g.setColor(Color.WHITE);
            g.drawRect(x, y, logoWidth, logoHeight);
            g.dispose();
            logo.flush();
            twodimensioncode.flush();
            //二维码图片转化成字节数组
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write(twodimensioncode, "jpg", out);
            //上传到七牛云 返回url

            ImageIO.write(twodimensioncode, format, new File("D:/img6.png"));
        } catch (WriterException | IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }


    }
}
