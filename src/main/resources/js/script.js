// Change Theme
function changeTheme() {
    let body = document.body;
    body.className = body.className === 'theme-dark' ? 'theme-light' : 'theme-dark';

    let view = document.getElementById("view");
    view.className = view.className === 'bi bi-sun-fill' ? 'bi bi-moon-fill' : 'bi bi-sun-fill';
}