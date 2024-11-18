document.getElementById('galeria-link').addEventListener('click', function(event) {
    event.preventDefault(); 
    
    const targetElement = document.getElementById('galleryTitle');
    const offset = 20;
    
    window.scrollTo({
      top: targetElement.offsetTop - offset,
      behavior: 'smooth'
    });
  });