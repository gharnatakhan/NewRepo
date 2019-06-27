<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<!-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1>
	<p>I AM HERERERERERE</p>
	
	<form action="login" method="post">
		Email<input type="text" name="email"><br>
		Password<input type="password" name="password"><br>
		<input type="submit" value="Log In">
	</form>
</body> -->
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Local CSS --> 
    <!-- http://localhost:8088/cauldron/css/indexStyles.css -->
    <link rel="stylesheet" href="http://localhost:8088/cauldron/css/indexStyles.css" />
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>FDM Cauldron</title>
</head>
<body>
    
      <div class="container">
        <div class="row">
            <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                <div class="card card-signin my-5">
                  <div class="card-body">
                    <h5 class="card-title text-center text-uppercase">cauldron</h5>
                    
                    <!-- .form-signin -->
                    <form:form class="form-signin" action="login" method="post">
                                          
                      <div class="form-label-group">
                        <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required />
                        <label for="inputEmail" >Email address</label>
                      </div>
                    
                      <div class="form-label-group">
                        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required />
                        <label for="inputPassword">Password</label>
                      </div>
                        
                      <div class="custom-control custom-checkbox mb-3">
                        <input name="rememberPassword" type="checkbox" class="custom-control-input" id="rememberPasswordCheck" />
                        <label class="custom-control-label" for="rememberPasswordCheck">Remember password</label>
                      </div>
  
                      <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
					 					  
                    </form:form>
                    
                    <!-- /.form-signin -->
                  </div>
                </div>
            </div>
        </div> <!--/.row -->
    </div> <!--/.container-->
    

   
    <!-- Optional Local Script JavaScript -->
    <script typ="text/javascript">
        
        /*JS GOES HERE */
        
    </script> <!-- /script -->
      
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>