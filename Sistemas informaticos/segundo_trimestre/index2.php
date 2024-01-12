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
    $opcion = $_POST["opcion"];

    if ($opcion === "minusc") {
        $textoConvertido = strtolower($textoOriginal);
    } elseif ($opcion === "mayusc") {
        $textoConvertido = strtoupper($textoOriginal);
    } else {
        $textoConvertido = "Error: Opción no válida";
    }

    echo "<p>Texto Original: $textoOriginal</p>";
    echo "<p>Texto Convertido: $textoConvertido</p>";
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <label for="texto">Texto:</label>
    <input type="text" id="texto" name="texto" required>
    
    <label for="opcion">Selecciona una opción:</label>
    <select id="opcion" name="opcion">
        <option value="minusc">Pasar a minúsculas</option>
        <option value="mayusc">Pasar a mayúsculas</option>
    </select>

    <button type="submit">Convertir</button>
</form>

</body>
</html>
