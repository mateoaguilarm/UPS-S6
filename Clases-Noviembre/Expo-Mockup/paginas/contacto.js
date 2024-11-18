document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const nombre = document.getElementById('nombre').value;
    const email = document.getElementById('email').value;
    alert(`Gracias ${nombre}. Tu mensaje ha sido enviado correctamente. Nos pondremos en contacto contigo a través del correo: ${email}`);
    this.reset();
});