
//$("#but").click(function(e) {
//    e.preventDefault();
//    //check name
//    if(checkname($("#name").val())) {
//        $("#n").text(" ");
//    } else {
//        $("#n").text("name must be 4 charcters");
//    	
//    }
//    
//    if(testEmailAddress($("#email").val())) {
//        $("#result").text(" ");
//    } else {
//        $("#result").text("Is not valid email");
//    }
//    if(checkdate($("#dd").val())){
//        document.getElementById('re').innerHTML = 'date should be select';
//      }
//
//    if(checkpass($("#name").val())){
//      document.getElementById('p').innerHTML = 'password must contain 3 charcters';
//    }
//   
//  });


//calling the name
  function checkname(value)
  {
  var v=value;
  if(value.length>4)return true;
  else {
    return false;
  }
  

}
//  function for check valid mail
  function testEmailAddress(emailToTest) {

	     var atSymbol = emailToTest.indexOf("@");
	     if(atSymbol < 1) return false;

	     var dot = emailToTest.indexOf(".");
	     if(dot <= atSymbol + 2) return false;


	     if (dot == emailToTest.length - 1) return false;

	     return true;
	  }
  //check date
  function checkdate(value) {
	    if(value.length<=0)
	    return true;


	  }
  //check name
  $("#name").focusout(function() {
      var v=$(this).val();
      var l=v.length;
      if(v<1){
            $("#n").html("Field is required")
             }
        else
        {
          $("#n").html("")
        }
  })
  
  
  //password
  function checkpass(value) {
    var v=value;
    if(v.length<=0)return true;
    else {
      return false;
    }

  }
  
  function pass()
  {
    document.getElementById('p').innerHTML = ' ';
  var pass = $('#pswd').val();
  console.log(pass);
  var l = pass.length;
  if(l<4){
      document.getElementById('p').innerHTML = 'password must contain 4 charcters';
      

  }
  if(l==8){

  }


  }
  
  
  function f() {
	  document.getElementById('p').innerHTML = ' ';
	}
	function cpass(){
	var pswd = $('#pswd').val();
	var cpswd = $('#cpswd').val();
	if(pswd!=cpswd)
	{
	    document.getElementById('rp').innerHTML = 'password has no match';

	}
	else {
	document.getElementById('rp').innerHTML = ' ';
	}
	}