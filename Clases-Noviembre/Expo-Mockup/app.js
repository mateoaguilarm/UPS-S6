document.getElementById('galeria-link').addEventListener('click', function(event) {
    event.preventDefault(); 
    
    const targetElement = document.getElementById('galleryTitle');
    const offset = 20;
    
    window.scrollTo({
      top: targetElement.offsetTop - offset,
      behavior: 'smooth'
    });
  });

document.addEventListener("DOMContentLoaded", function () {
  const navbar = document.querySelector('.navbar');

  window.addEventListener('scroll', function () {
      if (window.scrollY > 50) { 
          navbar.classList.add('scrolled');
      } else {
          navbar.classList.remove('scrolled');
      }
  });
});