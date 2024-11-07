const regionOptions = {
    costa: ["Esmeraldas", "Manabí", "Santo Domingo","Guayas", "Santa Elena", "Los Ríos", "El Oro"],
    sierra: ["Carchi", "Imbabura", "Pichincha", "Cotopaxi", "Tunguragua", "Bolívar", "Chiborazo", "Cañar", "Azuay", "Loja"],
    amazonia: ["Sucumbios", "Napo", "Orellana", "Pastaza", "Morona Santiago", "Zamora Chinchipe"],
    insular: ["Galapagos"]
}

function updateRegions() {
    const regionSelect = document.getElementById("region");
    const stateSelect = document.getElementById("provincia");
    const selectedRegion = regionSelect.value;

    stateSelect.innerHTML = '<option value="">Seleccione una región</option>';

    if (selectedRegion) {
        const states = regionOptions[selectedRegion];

        states.forEach(state => {
            const option = document.createElement("option");
            option.value = state;
            option.textContent = state;
            stateSelect.appendChild(option);
        });
    }
}

document.getElementById('comboForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const region = document.getElementById('region').value;
    const state = document.getElementById('provincia').value;

    if (region && state) {
        alert(`Región: ${region}\nProvincia: ${state}`);
    } else {
        alert('Por favor seleccione una región y una provincia')
    }
});