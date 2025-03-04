$(document).ready(function () {
  $("#size-range").on("input change", function () {
    $(".text").css("font-size", $(this).val()+ "px");
    $(".value").text($(this).val() + "px");
    
  });
});
