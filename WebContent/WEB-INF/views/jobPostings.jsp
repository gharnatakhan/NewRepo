<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JOB POSTING</h1>
</body> -->
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Local CSS --> 
    <!-- <link rel="stylesheet" href="style.css" /> -->
    <style> 
        body, html{
            height: 100%;
            margin: 0;
            padding: 0;
            /*box-sizing: border-box;
            border: 1px solid red;*/
            overflow-y: auto;
        }

        .container{ 
            height: 100%;
            box-sizing: border-box;
            border: 1px solid black;
        }

        .jobslisting-container{
            box-sizing: border-box;
            border: 1px solid green;
            margin-left: 0;
            height: 100%;
            width: 40%;
            float: left;
        }

        .jobdesc-container{
            box-sizing: border-box;
            border: 1px solid blue;
            margin-right: 0;
            height: 100%;
            width: 60%;
            float: right;
            padding: 1.5rem;
        }

        .job-otherinfo-div{
            box-sizing: border-box;
            border: 1px solid black;
            display: flex;
            justify-content: space-around;
        }

        .job-otherinfo-div > div{
            background: red;
            text-align: center;
        }
    </style> <!-- /CSS -->
      
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      
    <title>Trainee Job Postings</title>
  </head>
  <body>
      
      <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <a class="navbar-brand text-white" href="#">Cauldron</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link text-white" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white" href="#">Link</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Dropdown
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white disabled" href="#">Disabled</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        </div>
      </nav>
    
      <div class="container">
          
          <div class="jobslisting-container">
              
            <ul class="list-group">
              <li class="list-group-item">
                <div class="summary-div">
                    <h4> Job Title </h4>
                    <p> Client </p>
                    <p> Location </p>
                </div>
              </li>
                
              <li class="list-group-item">
                <div class="summary-div">
                    <h4> Job Title </h4>
                    <p> Client </p>
                    <p> Location </p>
                </div>
              </li>
                
              <li class="list-group-item">
                <div class="summary-div">
                    <h4> Job Title </h4>
                    <p> Client </p>
                    <p> Location </p>
                </div>
              </li>
                
              <li class="list-group-item">
                <div class="summary-div">
                    <h4> Job Title </h4>
                    <p> Client </p>
                    <p> Location </p>
                </div>
              </li>
                
            </ul>
              
          </div> <!-- .jobslisting-container -->
          
          <div class="jobdesc-container">
            
              <div class="job-title-div">
                <h2>Job Title</h2>
                <p> Client </p>
                <p> Location </p>
                <p>Account Manager: <a href=""> Mr. Account Manager</a></p>
              </div>  
              
              <div class="job-otherinfo-div">
                <div id="num-roles"> 
                    <h6>No. of Roles</h6> 
                    <p> 5 </p>
                </div>
                  
                <div id="joining-date"> 
                    <h6>Joining Date</h6> 
                    <p> Immediate </p>
                </div>
                
                <div id="num-roles"> 
                    <h6>Application Deadline</h6> 
                    <p> 06/29/2019 </p>
                </div>
              </div>
              
              
              <div class="job-desc-div">
                <h4>Description</h4>
              </div>  
              
              <div class="form-comment">
                  <label for="exampleFormControlTextarea1">Leave a Comment</label>
                  <textarea class="form-control" id="exampleFormControlTextarea1" rows="2"></textarea>
              </div>
              
              <div class="comments-container-div">
                  
              </div>  
              
          </div> <!-- .jobdesc-container -->
          
      </div>    
      
    <!-- Optional Local Script JavaScript -->
    <script typ="text/javascript">
        
        /*JS GOES HERE */
        
    </script> <!-- /script -->
      
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    
    <script
    src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
      
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
  </body>
</html>