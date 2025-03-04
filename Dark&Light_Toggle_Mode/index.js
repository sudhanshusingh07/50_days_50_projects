$(document).ready(function () {
  $(".btn").on("click", function(){
    if($(this).text() == "Dark"){
    $("body").css({
      "background-color": "black",
      "color": "white"
    });
    $(this).text("Light");
  }
 else{
       $("body").css({
        "background-color" : "white",
        "color" : "black"
    });
       $(this).text("Dark");
    }
  });
});
