/**
 * Created by DADITYA on 8/9/2017.
 */

$(document).ready(function () {
    $(".button-collapse").sideNav();
    $('.parallax').parallax();
    $('.carousel').carousel();
    animateGetStarted();
});
function animateGetStarted() {
    $('#cloud1').animate({left:'250px'},1000);
    $('#cloud2').animate({left:'-500px'},2000);
    $('#cloud3').animate({left:'-200px'},3000);
    $('#cloud4').animate({left:'800px'},4000);
    $('#cloud5').animate({left:'400px'},5000);
    $('#cloud6').animate({left:'400px'},6000);
    $('#chat-people').fadeIn(1000).animate({top:'150px'},1000);
    $('#chat1').fadeIn(3000).animate({top:'-250px'},3000);
    $('#chat2').fadeIn(4000).animate({top:'-250px'},4000);
    $('#chat3').fadeIn(2000).animate({top:'-450px'},2000);
}
var counter=0;
window.addEventListener("scroll", function() {
    if (window.scrollY > 200) {
        $('nav').css({opacity:'0.5'});
    }
    else {
        $('nav').css({opacity:'1'});
    }
    $('#cog').css("transform","rotate("+counter%360+"deg)");;
    counter+=10;
},false);