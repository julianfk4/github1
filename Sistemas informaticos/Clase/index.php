
    <?php



// constantes

// Sirven para inicializar una variable con un valor que no va a ser modificado

define('PI',  3.1416);

echo " el valor de la constante es " . PI;
//ARRAYS

// Sirven para almacenar una coleccion de valores

// a) Arrays indexados (accedemos a los elementos del array a traves de su indice)


// Posiciones    0    1    2
    $cliente = ['Ana','Pepe','lucas'];
    $numeros = [1,2,3,4,5,'Ana'];


    echo '<br>';

    echo $cliente[1];



//b) Arrays asociativos (Accedemos a los elementos del array a través de una clave)


//$Letra_a='a';
//$letra_b ='a';

//if(%letra_a ==$letrab){
//    echo 'Las letras son iguales';
//}




$alumno =[
'nombre' => 'Luis',
'apellidoUno' => 'lopez'
];
echo $alumno['apellidoUno'];

//ESTRUCTURAS de control de flujo (Condicionales y bucles)

$sueldo =3200;

if($sueldo >=3000){
    echo ' Buen sueldo';

}elseif($sueldo < 3000 && $sueldo >=1000){
    echo ' sueldo medio';

}else{

    echo 'Sueldo bajo';
}

switch($sueldo){
    case $sueldo >3000:
        echo 'buen sueldo';
        break;
    case $sueldo =3000:
        echo 'buen medio';
    break;
    case $sueldo <3000:
        echo 'buen bajo';
    break;
}


//WHILE
$x=1;

while($x<=10){
    echo $x . "";
    $x++;
}


//DO WHILE

$i = 1;

do{
    echo $i . " ";
    $i++;
}while

//for

foreach($personas as $persona){
    echo $persona . '<br>';
}




//fechas
$fechaactual =date('D-M-Y');
echo 'fecha actual:'.$fechaactual;
$horaactual = date('H:i:s');
echo "Hora actual:" .$horaactual;



