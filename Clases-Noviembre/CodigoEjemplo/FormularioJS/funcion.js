function validateForm() {
    // Obtener los valores de los campos
    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const phone = document.getElementById('phone').value.trim();
    const photo = document.getElementById('photo').files[0];
    const day = document.getElementById('day').value.trim();
    const month = document.getElementById('month').value.trim();
    const year = document.getElementById('year').value.trim();


    // Obtener los elementos de error
    const nameError = document.getElementById('nameError');
    const emailError = document.getElementById('emailError');
    const phoneError = document.getElementById('phoneError');
    const photoError = document.getElementById('photoError');
    const birthdateError = document.getElementById('birthdateError');

    // Inicializar las variables de error
    let valid = true;

    // Validar el campo de nombre
    if (name === '') {
        nameError.textContent = 'El nombre es obligatorio.';
        valid = false;
    } else {
        nameError.textContent = '';
    }

    // Validar el campo de correo electrónico
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (email === '') {
        emailError.textContent = 'El correo electrónico es obligatorio.';
        valid = false;
    } else if (!emailPattern.test(email)) {
        emailError.textContent = 'El correo electrónico no es válido.';
        valid = false;
    } else {
        emailError.textContent = '';
    }

    // Validar el campo de teléfono
    const phonePattern = /^[0-9]{10}$/;
    if (phone === '') {
        phoneError.textContent = 'El teléfono es obligatorio.';
        valid = false;
    } else if (!phonePattern.test(phone)) {
        phoneError.textContent = 'El teléfono no es válido. Debe contener 10 dígitos.';
        valid = false;
    } else {
        phoneError.textContent = '';
    }

    // Validar el campo de foto
    if (!photo) {
        photoError.textContent = 'La foto es obligatoria.';
        valid = false;
    } else if (!photo.type.startsWith('image/')) {
        photoError.textContent = 'El archivo debe ser una imagen.';
        valid = false;
    } else {
        photoError.textContent = '';
    }

    //Fecha de nacimiento

    if (day === '' || month === '' || year === '' ) {
        birthdateError.textContent = 'La fecha de nacimiento es obligatoria.';
        valid = false;
    } else if (isNaN(day) || isNaN(month) || isNaN(year) || 
        parseInt(day) < 1 || parseInt(day) > 31 || 
        parseInt(month) < 1 || parseInt(month) > 12 ||
        parseInt(year) < 1 || parseFloat > 2024 || parseInt(year) > new date().getFullYear()){
        birthdateError.textContent= 'la fecha de nacimiento no es válida.'
    } else {
        birthdateError.textContent = '';
    }


    // Si todos los campos son válidos, mostrar un mensaje de éxito
    if (valid) {
        alert('Formulario enviado correctamente.');
        
        // Aquí puedes agregar el código para enviar el formulario
        document.getElementById('personalForm').reset(); // Limpiar el formulario después de enviarlo
    }
}