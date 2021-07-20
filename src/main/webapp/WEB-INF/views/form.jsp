<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <script src="<c:url value="/resources/js/my.js" />"></script>

    <title>Hello, world!</title>
  </head>
  <body>
  
    
      <div class="container mt-3">
      
      <div class="text-center">
         <img alt="" src="<c:url value="/resources/image/dp.jpeg" /> ">
      </div>
        <div class="col-md-8 offset-md-2 mt-3">
      
         <div class="card">
         
              <div class="card-body">
               
                  <h3>Form </h3>
                   
                   
                   <form action="doRegister" method="post"> 
                   
                   <div class="alert alert-primary" role="alert">
                        
                        <form:errors path="student.*" />
                        
                   </div>
                     
                       <div class="form-group">
                           <label for="exampleInputEmail1">Name</label>
                           <input required="required" name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                       </div>
                       <div class="form-group">
                           <label for="exampleInputEmail1">Id:</label>
                           <input name="id" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                       </div>
                       <div class="form-group">
                           <label for="exampleInputEmail1">DOB :</label>
                           <input name="date" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                       </div>
					<div class="form-group">
						<label for="exampleFormControlSelect1">Example Course</label> <select name="courses"
							class="form-control" id="exampleFormControlSelect1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
					<div class="form-group">
					    <span>Gender</span>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio"
								name="gender" id="gender" value="male">
							<label class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio"
								name="gender" id="gender" value="female">
							<label class="form-check-label" for="inlineRadio2">FeMale</label>
						</div>
					</div>
					<div class="form-group col-md-4">
						<label for="inputState">Type Student</label> <select name="mytype" id="mytype"
							class="form-control">
							<option selected>Old Student</option>
							<option>New Student</option>
						</select>
					</div>
					
					<div class="card">
					
					    <div class="card-body">
					    
					       <p>Your address </p>
					         
					          <div class="form-group">
                                <label for="exampleInputEmail1">Street</label>
                                <input name="address.street" type="text" class="form-control" id="exampleInputEmail1" >
                             </div>
                       
                             <div class="form-group">
                                <label for="exampleInputEmail1">City</label>
                                <input name="address.city" type="text" class="form-control" id="exampleInputEmail1" >
                             </div>
					 
					
					     </div>
					 
					
					</div>
					<div class="conatiner">
					   <button type="submit">Submit</button>
					</div>


				</form>
         
         
             </div>
         
         
         
         </div>
      
      
      </div>
    
    </div>
    
    
    

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    -->
  </body>
</html>