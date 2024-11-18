function toggleCard(button) {
    const content = button.closest('.card').querySelector('.card-content');
    content.classList.toggle('d-none');
    button.textContent = content.classList.contains('d-none') ? "Expandir" : "Contraer";
}