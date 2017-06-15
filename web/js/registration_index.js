var myApp = angular.module("myApp", []);
myApp.controller("RegisterCtrl", function ($scope) {

});
$('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 100// Creates a dropdown of 15 years to control year
  });
  $(document).ready(function() {
    $('select').material_select();
  });
  