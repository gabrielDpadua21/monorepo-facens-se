$("[name='pay']").click(function  (){
  let x = $(this).val();
  if(x == 0){
    $('.prepaid').addClass('d-flex');
  }
  else{
      $('.prepaid').removeClass('d-flex');
    
  }
});