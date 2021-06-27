package com.example.HW3_1;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.IdenticonAvatar;
import com.talanlabs.avatargenerator.SquareAvatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileCacheImageOutputStream;
import javax.imageio.stream.IIOByteBuffer;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.nio.ByteOrder;
import java.util.Base64;
import java.util.Random;


@WebServlet(urlPatterns = "/avatar-servlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar a= IdenticonAvatar.newAvatarBuilder().build();
        //String u= request.getParameter("username");
        //String g= request.getParameter("gender");
        //①getParameter()获取的是客户端设置的数据。
        //getAttribute()获取的是服务器设置的数据。
        //②getParameter()永远返回字符串
        //getAttribute()返回值是任意类型
        long unboundedLong = new Random().nextLong();
       // BufferedImage result= a.create(2);
        //输入数字如2时只有一个图像，不是随机的
        BufferedImage result=a.create(unboundedLong);
        //request.setAttribute("name", u);
        //request.setAttribute("sex", g);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(result, "png", output);  //将图片写入输出流
        String imageAsBase64= Base64.getEncoder().encodeToString(output.toByteArray());
        request.setAttribute("imageAsBase64", imageAsBase64);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

}