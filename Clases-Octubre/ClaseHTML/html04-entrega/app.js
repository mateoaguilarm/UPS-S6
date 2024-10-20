const carrusel = document.querySelector('.carrusel-rotativo ul');
const totalSlides = carrusel.children.length;
let currentIndex = 0;

document.querySelector('.next').addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % totalSlides;
    updateCarrusel();
});

document.querySelector('.prev').addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + totalSlides) % totalSlides;
    updateCarrusel();
});

function updateCarrusel() {
    const offset = -currentIndex * 100;
    carrusel.style.transform = `translateX(${offset}%)`;
}