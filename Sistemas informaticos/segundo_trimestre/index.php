<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Convertidor de Texto</title>
</head>
<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $textoOriginal = $_POST["texto"];

    if (isset($_POST["convertirMinusculas"])) {
        $textoConvertido = strtolower($textoOriginal);
    } elseif (isset($_POST["convertirMayusculas"])) {
        $textoConvertido = strtoupper($textoOriginal);
    } else {
        $textoConvertido = "Error: Opción no válida";
    }

    echo "<p>Texto Original: $textoOriginal</p>";
    echo "<p>Texto Convertido: $textoConvertido</p>";
}
?>
<form>
    <select name="opcion">

        <option value="1">Pasar mayusculas</option>
        <option value="2">Pasar minusculas</option>


    </select>

</form>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <label for="texto">Texto:</label>
    <input type="text" id="texto" name="texto" required>
    
    <button type="submit" name="convertirMinusculas">Pasar a minúsculas</button>
    <button type="submit" name="convertirMayusculas">Pasar a mayúsculas</button>
</form>

</body>
</html>

