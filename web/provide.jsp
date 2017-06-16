<%-- 
    Document   : provide
    Created on : 15 Jun, 2017, 10:55:21 AM
    Author     : sit-dt-9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Room Details</title>
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
                     var x = document.getElementsByName('roomdetails');
                     x[0].submit();
                 }
            }
              
              
          
          
          
          </script>
</head>

<body>
  <body ng-controller="RegisterCtrl" ng-app="myApp">
 <div class="container">
   <div id="signup">
      <div class="signup-screen">
         <div class="space-bot text-center">
            <h1>Enter the requried details.</h1>
           <div class="divider"></div>
         </div>
           <form class="form-register" method="post" name="roomdetails" novalidate action="AddRoom">
        <br>     
<!--Address-->
            <div class="input-field col s6">
              <input id="address" type="text" name="address" required>
              <label for="address">Address</label>
             </div>
             <br>
<!--City-->
            <div class="input-field col s6">
              <input id="city" type="text" class="validate" name="city" required>
              <label for="city">City</label>
             </div>
             <br>
<!--Locality-->
            <div class="input-field col s6">
              <input id="locality" type="text" class="validate" name="locality" required>
              <label for="locality">Locality</label>
             </div>
             <br>
<!--maximum number of people-->
             <div class="input-field col s12">
    <select name="maxpeople">
      <option value="" disabled selected>Maximum number of people</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
    </select>
 </div>
             <br>
<!--genders-->
Gender Restrictions:
<p>
      <input class="with-gap" name="gender" type="radio" value="m" id="male" />
      <label for="male">Only Males</label>
    </p>
<p>
      <input class="with-gap" name="gender" type="radio" value="f" id="female" />
      <label for="female">Only Females</label>
    </p>
<p>
      <input class="with-gap" name="gender" type="radio" id="any" value="a" />
      <label for="any">Any</label>
    </p>         
             <br>
<!--maximum number of rooms-->
             <div class="input-field col s12">
    <select name="rooms">
      <option value="" disabled selected>Number of rooms available</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
    </select>
 </div><br>
<!--Additional Details-->
             Additional Facilities: 
<p>
      <input type="checkbox" value="ac" name="ac" id="ac"/>
      <label for="ac">A/C</label>
    </p>
<p>
      <input type="checkbox" value="wifi" name="wifi" id="wifi"/>
      <label for="wifi">WiFi</label>
    </p>
<p>
      <input type="checkbox" value="food" name="food" id="food"/>
      <label for="food">Food</label>
    </p>     
         <br>

<!--cost-->
            <div class="input-field col s6">
              <input id="cost" type="text" class="validate" name="cost" required>
              <label for="cost">Rent per Day</label>
             </div>
             <br>   
    
             
             
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
