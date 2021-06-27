package com.example.Upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 验证请求是否满足要求（post 请求 / enctype 是否以multipart打头
        //   boolean isMultipart = ServletFileUpload.isMultipartContent(req);
        // 如果不满足要求就立即结束对该请求的处理
        //   if (!isMultipart) {
        //       return;
        //   }

        //  try {
        //      FileItemFactory factory = new DiskFileItemFactory();
        //      ServletFileUpload upload = new ServletFileUpload(factory);
        //      List<FileItem> items = upload.parseRequest(req);
        //       for (FileItem fileItem :
        //             items) {
        //          if (fileItem.isFormField()) {
        //         } else {
        //              fileItem.write(new File("C:\\Users\\24508\\Documents\\大一下学期\\大一下java作业集群\\42054003_赖骏杰_Week4\\HW3.3\\src\\main\\webapp\\image", "testImg.jpg"));
        //          }
        //     }
        //   } catch (Exception e) {
        //       e.printStackTrace();
        request.setCharacterEncoding("utf-8");//将编码类型统一编码，防止乱码
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");//数据显示编码;
        //上传
        try {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);//判断上传内容是否有jsp里设置的multipart属性
            if (isMultipart) {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);//先写到factory，再传到upload，再用upload的parseRequest将请求字段解析到items；
                //通过parseRequest解析form中的所有请求字段，并保存到items集合中（即前台传递的sno sname spicture 此时就保存在了items中）
                List<FileItem> items = upload.parseRequest(request);
                //遍历items中的数据（sno...)
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = iter.next();
                    String itemName = item.getFieldName();
                    int sno=-1;
                    String sname=null;
                    //判断前台字段是普通form表单字段（sno...）还是文件字段


                    if (item.isFormField()) {
                        if (itemName.equals("sno")) {//根据name属性 判断item是sno...
                                 sno=Integer.parseInt(item.getString("utf-8"));
                        } else if (itemName.equals("sname")) {
                            sname = item.getString("utf-8");
                        } else {
                            System.out.println("else text");
                        }

                    } else {//spicture 图片上传
                        //文件名 getFieldName是获取普通表单字段的name值
                        //getName是获取文件名
                        String fileName = item.getName();
                        //获取文件内容并上传
                        //定义文件路径：指定上传的位置（一般是服务器路径）
                        //获取服务器路径
                        //String path=request.getSession().getServletContext().getRealPath("upload");
                        String path = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0_Tomcat9.1\\webapps\\Upload-1.0-SNAPSHOT\\upload";
                        File file =new File(path,fileName);

                        item.write(file);//上传
                        System.out.println(fileName+"upload successfully!");
                        return;



                    }


                }

            }
        }  catch (FileUploadException e) {
            e.printStackTrace();//打印错误回溯
        }//解析请求
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}