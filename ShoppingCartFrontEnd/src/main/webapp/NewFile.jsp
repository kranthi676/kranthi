<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </div><!-- /.navbar -->

    <div class="container">
      


      <div class="row row-offcanvas row-offcanvas-left">
        
         <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
           <p class="visible-xs">
            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas"><i class="glyphicon glyphicon-chevron-left"></i></button>
          </p>
          
          <div class="well sidebar-nav">
          <c:choose>
						<c:when test="${empty nameofloggedinuser}">
            <ul class="nav">
            
              <li>Sidebar</li>
              
              <li class="active"><a href="justlogin">login here</a></li>
              <li><a href="getregistered">register here</a></li>
              <li><a href="#">Link</a></li>
              
              </c:when>
             
						<c:when test="${not empty nameofloggedinuser}">
							<li>Welcome ${nameofloggedinuser},</li>
							<ul align="right"><a href="logout"> logout</a></ul>
						</c:when>
						</c:choose>
          </div><!--/.well -->
          
        </div><!--/span-->
        
        <div class="col-xs-12 col-sm-9">
          <p class="pull-left visible-xs">
            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle Nav</button>
          </p>
          <div class="jumbotron">
          <center>
            <h3>WELCOME TO SHOPPING CART!</h3>
           </center>
          </div>
        
        </div><!--/span-->

        
      </div><!--/row-->

      <hr>
    <center>
      <footer>
        <p>© Company 2013</p>
      </footer>
</center>
    </div><!--/.container-->
</body>
</html>