function checkBillingAddress(){
    if($("#theSameAsShippingAddress").is(":checked")){
        $(".billingAddress").prop("disabled",true);
    }else{
        $(".billingAddress").prop("disabled",false);
    }
}
function checkPasswordMatch(){
    var password = $("#txtNewPassword").val();
    var confirmedPassword = $("#txtConfirmPassword").val();

    if(password == "" && confirmedPassword==""){
        $("#checkPasswordMatch").html("");
        $("#updateUserInfoButton").prop("disabled",false);
    }else {
        if(password != confirmedPassword){
            $("#checkPasswordMatch").html("Password do not match!");
            $("#updateUserInfo").prop("disabled",true);
        }else {
            $("#checkPasswordMatch").html("Password match!");
            $("#updateUserInfo").prop("disabled",false);
        }
    }
}

$(document).ready(function () {
   $(".cartItemQty").on('change',function () {
       var id = this.id;
       $('#update-item-'+id).css('display','inline-block');
   });
   $("#theSameAsShippingAddress").on('click',checkBillingAddress);
   $("#txtConfirmPassword").keyup(checkPasswordMatch);
   $("#txtNewPassword").keyup(checkPasswordMatch);
});