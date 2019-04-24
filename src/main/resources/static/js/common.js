function burgerMenu(selector) {
    let menu = $(selector);
    let button = menu.find('.burger-menu_button');
    let links = menu.find('.burger-menu_link');
    let overlay = menu.find('.burger-menu_overlay');


    button.on('click', (e) => {
        e.preventDefault();
        toggleMenu();
    });
    links.on('click', () => toggleMenu());
    overlay.on('click', () => toggleMenu());

    function toggleMenu() {
        menu.toggleClass('burger-menu_active');

        if (menu.hasClass('burger-menu_active')) {
            $('body').css('overflow', 'hidden');
        } else {
            $('body').css('overflow', 'visible');
        }
    }
}

burgerMenu('.burger-menu');

function preloader() {
    $(() => {
        setInterval(() => {
            let p = $('.preloader');
            p.css('opacity', 0);
            setInterval(() => p.remove(), parseInt(p.css('--duration')) * 1000);
        }, 1000);

    })
}
preloader();


$(document).ready(function () {
    $(".carousel-services").owlCarousel({
        loop: true,
        nav: false,
        smartSpeed: 700,
       /* navText: ['<i class="fa fa-angle-double-left"></i>', '<i class="fa fa-angle-double-right"></i>']*/
        responsiveClass: true,
        dots: false,
        responsive: {
            0: {
                items: 1
            },
            800: {
                items: 2
            },
            1100: {
                items: 3
            }
        }
    });

});



$(document).ready(function () {
    $(".carousel-services-composition .h3").each(function () {
        var ths = $(this);
        ths.html(ths.html().replace(/(\S+)\s*$/, '<span>$1</span>'));
    });
});


function caruselService() {
    $('.carousel-services-item').each(function () {
        var ths = $(this);
        var thsh = ths.find('.carousel-services-content').outerHeight();
        ths.find('.carousel-services-image').css('min-height', thsh);
    });
};

function carousel() {
    $('.carousel-services').on('initialized.owl.carousel', function () {
        setTimeout(function () {
            caruselService();
        });

    })
};
$(document).ready(function () {
    $("section .h2").each(function () {
        var ths = $(this);
        ths.html(ths.html().replace(/^(\S+)/, '<span>$1</span>'));
    });
});
$(document).ready(function () {
    $(".reviews").owlCarousel({
        loop: true,
        items: 1,
        smartSpeed: 700,
        nav: false
    });
});
$(document).ready(function () {
    $(".partners").owlCarousel({
        loop: true,
        dots: false,
        smartSpeed: 700,
        nav: true,
        navText: ['<i class="fa fa-angle-left"></i>', '<i class="fa fa-angle-right"></i>'],
        responsiveClass: true,
        responsive: {
            0: {
                items: 1
            },
            768: {
                items: 2
            },
            992: {
                items: 3
            },
            1200: {
                items: 4
            }
        }
    });
});

