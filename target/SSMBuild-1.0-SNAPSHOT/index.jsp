
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
      <style>
          a{
              text-decoration: none;
              color: black;
              font-size: 18px;
          ;
          }

          h3{width: 180px;
             height: 38px;
             margin: 100px auto;
             text-align: center;
             line-height: 38px;
             background: aqua;
             border-radius: 5px;}
      </style>
  </head>
  <body>
   <h3>
     <!--取出部署的应用程序名，这样不管如何部署，所用路径都是正确的。-->
     <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
   </h3>
  </body>
</html>
