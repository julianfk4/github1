document.addEventListener('DOMContentLoaded', function () {
    var btnMostrar = document.getElementById('mostrarBtn');
    var imagenContainer = document.getElementById('imagenContainer');

    btnMostrar.addEventListener('click', function () {
        // Alternar la visibilidad de la imagen al hacer clic en el botón
        if (imagenContainer.style.display === 'none') {
            imagenContainer.style.display = 'block';
        } else {
            imagenContainer.style.display = 'none';
        }
    });
});