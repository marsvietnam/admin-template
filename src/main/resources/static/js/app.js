$('.sidebar-toggle').click(function(e) {
    e.preventDefault();
    $('.main').toggleClass('closed');
    $('.footer').toggleClass('closed');
    $('.sidebar').toggleClass('opened');
});