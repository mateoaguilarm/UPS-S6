const cityOptions = {
    es: ["Madrid", "Barcelona", "Valencia"],
    mx: ["Ciudad de México", "Guadalajara", "Monterrey"],
    us: ["New York", "Los Angeles", "Chicago"]
};

function updateCities() {
    const countrySelect = document.getElementById('country');
    const citySelect = document.getElementById('city');
    const selectedCountry = countrySelect.value;

    // Limpiar las opciones actuales
    citySelect.innerHTML = '<option value="">Seleccione una ciudad</option>';

    if (selectedCountry) {
        // Obtener las ciudades correspondientes al país seleccionado
        const cities = cityOptions[selectedCountry];

        // Añadir las nuevas opciones al desplegable de ciudades
        cities.forEach(city => {
            const option = document.createElement('option');
            option.value = city;
            option.textContent = city;
            citySelect.appendChild(option);
        });
    }
}

// Manejo del envío del formulario (opcional)
document.getElementById('comboForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const country = document.getElementById('country').value;
    const city = document.getElementById('city').value;

    if (country && city) {
        alert(`País: ${country}\nCiudad: ${city}`);
    } else {
        alert('Por favor, seleccione un país y una ciudad.');
    }
});