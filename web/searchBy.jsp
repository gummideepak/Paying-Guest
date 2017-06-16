<%-- 
    Document   : search
    Created on : 16 Jun, 2017, 11:23:52 AM
    Author     : sit-dt-9
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Search</title>
  <%
        try{
        String x = session.getAttribute("username").toString();
        //if user didnt login a null pointer exception will be thrown
        //out.println(x);
        }
        catch(Exception e){
            //catch that exception and redirect the user to a error page.
            response.sendRedirect("Error.jsp");
        }
        
    %>
  <meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  
  <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/css/materialize.min.css'>
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>

      <link rel="stylesheet" href="css/registration_style.css">

          <script>
              function validate(form){
                 var valid=true; //should write code for validation
                 if(valid){
                     var x = document.getElementsByName('city');
                     x[0].submit();
                 }
            }
              
              
          
          
          
          </script>
</head>

<body ng-controller="RegisterCtrl" ng-app="myApp">
 <div class="container">
   <div id="signup">
      <div class="signup-screen">
         <div class="space-bot text-center">
            <h1>Search By.</h1>
           <div class="divider"></div>
         </div>
           <form class="form-register" method="post" name="city" novalidate action=" searchByCity.jsp">
        <br>     
<!--city-->
             <div class="input-field col s12">
    <select name="city" >
      <option value="" disabled selected>Select the city</option>
      <option value="Bangalore">Bangalore</option>
      <option value="Chennai">Chennai</option>
      <option value="Delhi">Delhi</option>
      <option value="Hyderabad">Hyderabad</option>
      <option value="Jaipur">Jaipur</option>
      <option value="Kolkata">Kolkata</option>
      <option value="Mumbai">Mumbai</option>
      <option value="Lucknow">Lucknow</option>
      <option value="Patna">Patna</option>
      <option value="Pune">Pune</option>
    </select>
 </div><br>
 </form>
        <br><br>
<!--BUTTONS-->
        <center>
       <a class="waves-effect waves-light btn" onclick=validate(this)><i class="material-icons left">send</i>Submit</a>
               <button type="button" class="waves-effect waves-light btn cancel">
               <i class="material-icons left">clear</i>Cancel
               </button>
          </center>
              </div>        

           </div>
        </div>
    </div>
</body>
  <script src='https://code.jquery.com/jquery-2.1.4.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/js/materialize.min.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js'></script>

    <script src="js/registration_index.js"></script>

</body>
</html>

