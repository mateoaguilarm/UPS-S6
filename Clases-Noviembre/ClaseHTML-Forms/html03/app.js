function calculateScore() {
    let score = 0;
    const questions = ["q1", "q2", "q3", "q4", "q5"];

    questions.forEach(id => {
        const selected = document.getElementById(id).value;
        score += parseInt(selected || 0);
    });

    let result;
    if (score === 100) {
        result = "¡Medalla de Oro! 🥇";
    } else if (score >= 80) {
        result = "¡Medalla de Plata! 🥈";
    } else if (score >= 60) {
        result = "¡Medalla de Bronce! 🥉";
    } else {
        result = "¡Has perdido! Intenta nuevamente.";
    }

    alert(`Tu puntuación es ${score}. ${result}`);
}