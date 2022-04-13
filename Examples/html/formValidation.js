function check()
{
  var firstname = document.form.fn.value;
  var lastname = document.form.ln.value;
  var dob =  document.form.dob.value;
  var gender =  document.form.Gender.value;
  var email= document.form.email.value;
  var remail= document.form.remail.value;
  var password =  document.form.password.value;
  var repassword =  document.form.repassword.value;
  var question= document.form.Question.value;
  var answer= document.form.answer.value;
  var address =document.form.address.value;
  var city = document.form.city.value;
  var state = document.form.state.value;
  var mobile = document.form.mobile.value;


if(firstname==="")
{
  document.getElementById('error-fname').innerHTML = " Please Enter Your First Name"
}
else
{
  document.getElementById('error-fname').innerHTML = ""
}
if(lastname==="")
{
  document.getElementById('error-lname').innerHTML = " Please Enter Your Last Name"
}
else{
  document.getElementById('error-lname').innerHTML = ""
}
if(dob==="")
{
  document.getElementById('error-dob').innerHTML = " Please Enter Your DOB"
}
else{
  document.getElementById('error-dob').innerHTML = ""
}
if(gender==="")
{
  document.getElementById('error-gender').innerHTML = " Please select Your gender"
}
else{
  document.getElementById('error-gender').innerHTML = ""
}
if(email==="")
{
  document.getElementById('error-email').innerHTML = " Please Enter Your email"
}
else if(!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email))
  document.getElementById('error-email').innerHTML = " Enter Valid email"
else
{
  document.getElementById('error-remail').innerHTML = ""
}
if(remail==="")
{
  document.getElementById('error-remail').innerHTML = " Please RE-Enter Your email"
}
else if(!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email))
  document.getElementById('error-remail').innerHTML = "RE Enter Valid email"
else{
  document.getElementById('error-remail').innerHTML = ""
}
if(remail!=email)
{
  document.getElementById('error-remail').innerHTML = "Your Email IDs dont match"
}
else{
  document.getElementById('error-remail').innerHTML = ""
}
if(password==="")
{
  document.getElementById('error-password').innerHTML = " Please Enter Your password"
}
else{
  document.getElementById('error-password').innerHTML = ""
}
if(repassword==="")
{
  document.getElementById('error-repassword').innerHTML = " Please RE-Enter Your password"
}
else{
  document.getElementById('error-repassword').innerHTML = ""
}
if(repassword!=password)
{
  document.getElementById('error-repassword').innerHTML = "Your passwords dont match"
}
else{
  document.getElementById('error-repassword').innerHTML = ""
}
if(question==="")
{
  document.getElementById('error-question').innerHTML = " Please choose Your secret question"
}

if(answer==="")
{
  document.getElementById('error-answer').innerHTML = " Please Enter Your secret answer"
}
else{
  document.getElementById('error-answer').innerHTML = ""
}
if(address==="")
{
  document.getElementById('error-address').innerHTML = " Please Enter Your address"
}
else{
  document.getElementById('error-address').innerHTML = ""
}
if(city==="")
{
  document.getElementById('error-city').innerHTML = " Please Enter Your city"
}
else{
  document.getElementById('error-city').innerHTML = ""
}
if(state==="")
{
  document.getElementById('error-state').innerHTML = " Please choose your state"
}
else{
  document.getElementById('error-state').innerHTML = ""
}
if(mobile==="")
{
  document.getElementById('error-mobile').innerHTML = " Please enter correct mobile number"
}
else if(!/^\d{10}$/.test(mobile))
  document.getElementById('error-mobile').innerHTML = " Please enter Valid mobile number"
  else
  {
      document.getElementById('error-mobile').innerHTML = ""
  }
}
