-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2024 a las 07:33:33
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `plans_bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actores`
--

CREATE TABLE `actores` (
  `id_actor` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `foto_actor` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `actores`
--

INSERT INTO `actores` (`id_actor`, `nombre`, `apellidos`, `foto_actor`) VALUES
(1, 'Ewan', 'McGregor', NULL),
(2, 'Albert', 'Finney', NULL),
(3, 'Helena', 'Bonham', NULL),
(4, 'Billy', 'Crudup', NULL),
(5, 'Leonardo', 'DiCaprio', NULL),
(6, 'Jonah', 'Hill', NULL),
(7, 'Margot', 'Robbie', NULL),
(8, 'Emma', 'Stone', NULL),
(9, 'Mark', 'Ruffalo', NULL),
(10, 'Willem', 'Dafoe', NULL),
(11, 'Brad', 'Pitt', NULL),
(12, 'Diego', 'Calva', NULL),
(13, 'Matt', 'Damon', NULL),
(14, 'Ben', 'Affleck', NULL),
(15, 'Robin', 'Williams', NULL),
(16, 'Anya', 'Taylor-Joy', ''),
(17, 'Ralph', 'Finnes', NULL),
(18, 'Nicholas', 'Hoult', NULL),
(20, 'Ben', 'Kingsley', NULL),
(21, 'Ethan', 'Hawke', NULL),
(22, 'Robert', 'Sean', NULL),
(23, 'Edward', 'Norton', NULL),
(24, 'Christopher', 'Walker\r\n', NULL),
(25, 'Ryan', 'Gosling', NULL),
(26, 'Steve ', 'Carrell', NULL),
(27, 'Lio', 'Lio', NULL),
(28, 'Tyler', 'Mane\r\n', NULL),
(29, 'Sheri', 'Moon', NULL),
(30, 'Scout', 'Taylor-Compton', NULL),
(31, 'Omar', 'Sy', NULL),
(32, 'François', 'Cluzet', NULL),
(33, 'Audrey', 'Fleurot', NULL),
(34, 'Elisha', 'Cuthbert', NULL),
(35, 'Chad', 'Michael', NULL),
(36, 'Paris', 'Hilton', NULL),
(37, 'Dakota', 'Fanning', NULL),
(38, 'Jennifer', 'Saunders', NULL),
(39, 'Dan', 'Stevens', NULL),
(40, 'Luke', 'Evans', NULL),
(41, 'Eli', 'Roth', NULL),
(42, 'Jay', 'Hernandez', NULL),
(43, 'Derek', 'Richardson', NULL),
(44, 'Kate', 'Winslet', NULL),
(45, 'Billy', 'Zane', NULL),
(46, 'Laurence', 'R.Harvey', NULL),
(47, 'Ashlynn', 'Yennie', NULL),
(48, 'Akihiro', 'Kitamura', NULL),
(49, 'Ray', 'Liotta', NULL),
(50, 'Keri', 'Russell', NULL),
(51, ' Jesse', 'Tyler', NULL),
(52, 'Cary', 'Elwes', NULL),
(53, 'Leigh', 'Whannell', NULL),
(54, 'Shawnee', 'Smith', NULL),
(55, 'Emilie', 'Ravin', NULL),
(56, 'Dan', 'Byrd', NULL),
(57, 'Chris', 'Saradon', NULL),
(58, 'Paul', 'Reubens', NULL),
(59, 'Glenn', 'Shadix\r\n', NULL),
(60, 'Al', 'Pacino', NULL),
(61, 'Marlon', 'Brando', NULL),
(62, 'James', 'Caan\r\n', NULL),
(63, 'Johnny', 'Depp', NULL),
(64, 'Victoria', 'Everglot\r\n', NULL),
(65, 'Ellen', 'Pompeo', NULL),
(66, 'Chandra', 'Wilson', NULL),
(67, 'Patrick', 'Dempsey', NULL),
(68, 'Justin', 'Chambers', NULL),
(69, 'Sandra', 'Oh', NULL),
(70, 'James ', 'Pickens JR', NULL),
(71, 'Shonda', 'Rhimes', NULL),
(72, 'Krista ', 'Vernoff', NULL),
(73, 'Stacy', 'McKee', NULL),
(74, 'Jenna', 'Fischer', NULL),
(75, 'John', 'Krasinski', NULL),
(76, 'Rainn', 'Wilson', NULL),
(77, 'Ed', 'Helms', NULL),
(78, ' Melora', 'Hardin', NULL),
(79, 'Jeremy', 'Allen', 'White'),
(80, 'Ayo', 'Edebiri', NULL),
(81, 'Ebon', 'Moss-Bachrach', NULL),
(82, 'Molly', 'Gordon', NULL),
(83, 'Matty', 'Matheson', NULL),
(84, ' Abby', 'Elliott', NULL),
(85, 'Renata', 'Nootni', NULL),
(86, 'Miguel', 'Bernardeau', NULL),
(87, 'Dalia', 'Xiuhcoatl', NULL),
(88, 'Emiliano', 'Zurita', NULL),
(89, 'Elia', 'Galera', NULL),
(90, ' Paco', 'Tous', NULL),
(91, 'Emmy', 'Rossum', NULL),
(92, 'Jeremy', 'Allen', 'White'),
(93, 'Cameron', 'Monaghan', NULL),
(94, ' Ethan', 'Cutkosky', NULL),
(95, 'Emma', 'Kenney', NULL),
(96, ' Shanola', 'Hampton', NULL),
(97, 'Hugh', 'Laurie', NULL),
(98, 'Robert', 'Sean', 'Leonard'),
(99, 'Lisa', 'Edelstein', NULL),
(100, 'Jesse', 'Spencer', NULL),
(101, 'Jennifer', 'Morrison', NULL),
(102, 'Peter', 'Jacobson', NULL),
(103, 'Bryan', 'Cranston', NULL),
(104, 'Aaron', 'Paul', NULL),
(105, 'Anna', 'Gunn', NULL),
(106, 'Dean', 'Norris', NULL),
(107, 'RJ', 'Mitte', NULL),
(108, 'Bob', 'Odenkirk', NULL),
(109, 'Robert', 'Knepper', NULL),
(110, 'Rose', 'Mclver', NULL),
(111, 'Malcom', 'Goodwin', NULL),
(112, 'David', 'Anders', NULL),
(113, 'Rahul', 'Kohli', NULL),
(114, 'Dominic', 'Purcell', NULL),
(115, 'Sarah', 'Wayane', NULL),
(116, 'Stacy', 'Keach', NULL),
(117, 'Ian', 'Somerhalder', NULL),
(118, 'Josh', 'Holloway', NULL),
(119, 'Jorge', 'Garcia', NULL),
(120, 'Evangeline', 'Lilly', NULL),
(121, 'Matthew', 'Fox', NULL),
(122, 'Dominic', 'Monaghan', NULL),
(123, 'Louis', 'Hofmann', NULL),
(124, 'Lisa', 'Vicari', NULL),
(125, 'Gina', 'Stiebitz', NULL),
(126, 'Oliver', 'Masucci', NULL),
(127, 'Andreas ', 'Pietschmann', NULL),
(128, 'Emilia', 'Clarke', NULL),
(129, 'Sophie', 'Turner', NULL),
(130, 'Maisie', 'Williams', NULL),
(131, 'Pedro', 'Pascal', NULL),
(132, 'Jason', 'Momoa', NULL),
(133, 'Peter', 'Dinklage', NULL),
(134, 'Hubert', 'Delattre', NULL),
(135, 'Suliane', 'Brahim', NULL),
(136, 'Camille', 'Aguilar', NULL),
(137, 'Laurent', 'Capelluto', NULL),
(138, 'Samuel', 'Jouy', NULL),
(139, 'Renaud', 'Rutten', NULL),
(140, 'Wagner', 'Moura', NULL),
(141, 'Diego', 'Luna', NULL),
(142, 'Paulina', 'Gaitan', NULL),
(143, 'Alberto', 'Ammann', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directores`
--

CREATE TABLE `directores` (
  `id_director` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `foto_director` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `directores`
--

INSERT INTO `directores` (`id_director`, `nombre`, `apellidos`, `foto_director`) VALUES
(1, 'Tim', 'Burton', NULL),
(2, 'Martin', 'Scorcesse', NULL),
(3, 'Giorgos', 'Lánthimos', NULL),
(4, 'Damien', 'Chazelle', NULL),
(5, 'Gus', 'Van Sant', NULL),
(6, 'Mark', 'Mylod', NULL),
(7, 'Peter', 'Weir', NULL),
(8, 'David', 'Fincher', NULL),
(9, 'Steven', 'Spielberg', NULL),
(10, 'Glenn', 'Ficarra', NULL),
(11, 'Rob ', 'Zombie', NULL),
(12, 'Olivier ', 'Nakache', NULL),
(13, 'Jaume', 'Collet-Serra', NULL),
(14, 'Henry', 'Selick', NULL),
(15, 'Bill', 'Condon', NULL),
(16, 'Eli', 'Roth', 'Paxton'),
(17, 'James', 'Cameron', NULL),
(18, 'Tom', 'Six', NULL),
(19, 'Elizabeth', 'Banks', NULL),
(20, 'James', 'Wan', NULL),
(21, 'Alexandre', 'Aja', NULL),
(22, 'Francis', 'Ford', 'Coppola'),
(23, 'Shonda ', 'Rhimes', NULL),
(24, 'Krista', 'Vernof', NULL),
(25, ' Stacy', 'McKee\r\n', NULL),
(26, 'Mindy ', 'Kaling', NULL),
(27, 'B.J.', 'Novak', NULL),
(28, 'Paul ', 'Lieberstein', NULL),
(29, 'Greg', 'Daniels', NULL),
(30, 'Christopher', 'Storer\r\n', NULL),
(31, 'Javier', 'Quintana', NULL),
(32, 'Jorge ', 'Saavedra', NULL),
(33, 'Jose Luís', 'Alegría', NULL),
(34, 'John', 'Wells\r\n', NULL),
(35, 'Vince ', 'Gillian', NULL),
(36, 'Michael', 'Slowis', NULL),
(37, 'Colin', 'Bucksey', NULL),
(38, 'Rob', 'Thomas', NULL),
(39, 'Diane', 'Ruggiero', NULL),
(40, 'Dan ', 'Etheridge', NULL),
(41, 'Paul ', 'Scheuring\r\n', NULL),
(42, 'Jack ', 'Bender', NULL),
(43, ' Stephen', 'Williams', NULL),
(44, 'Baran', 'Bo Odar', NULL),
(45, 'Jantje', 'Friese', NULL),
(46, 'Martin', 'Behnke', NULL),
(47, 'Mark', 'Mylod', NULL),
(48, 'Alex', 'Graves', NULL),
(49, 'David', 'Nutter', NULL),
(50, 'Mathieu', 'Missoffe\r\n', NULL),
(51, 'José', 'Padiha', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generos`
--

CREATE TABLE `generos` (
  `id_genero` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `generos`
--

INSERT INTO `generos` (`id_genero`, `nombre`) VALUES
(1, 'Drama'),
(2, 'Fantasía'),
(3, 'Romance'),
(4, 'Comedia'),
(5, 'Crimen'),
(6, 'Terror'),
(8, 'Misterio'),
(9, 'Animación'),
(10, 'Suspense'),
(11, 'Ciencia ficción');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_favoritos`
--

CREATE TABLE `lista_favoritos` (
  `id_fav` int(11) NOT NULL,
  `usuario_cod` int(11) NOT NULL,
  `pelicula_cod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_ver`
--

CREATE TABLE `lista_ver` (
  `id_ver` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `pelicula_id2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_vistas`
--

CREATE TABLE `lista_vistas` (
  `id_vista` int(11) NOT NULL,
  `cod_usuario` int(11) NOT NULL,
  `cod_pelicula2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas_series`
--

CREATE TABLE `peliculas_series` (
  `id_pelicula` int(11) NOT NULL,
  `peli_serie` tinyint(1) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `duracion` int(11) DEFAULT NULL,
  `descripcion` text NOT NULL,
  `vose` varchar(40) NOT NULL,
  `fecha_estreno` year(4) NOT NULL,
  `rango_edad` enum('A','+3','+7','+12','+16','+18') NOT NULL,
  `trailer` varchar(255) NOT NULL,
  `cartelera` varchar(255) NOT NULL,
  `imagen` varchar(255) NOT NULL,
  `bso` varchar(255) NOT NULL,
  `puntuacion_media` decimal(3,2) DEFAULT NULL,
  `boolean_amazon` tinyint(1) NOT NULL DEFAULT 0,
  `boolean_yt` tinyint(1) NOT NULL DEFAULT 0,
  `boolean_hbo` tinyint(1) NOT NULL DEFAULT 0,
  `boolean_netflix` tinyint(1) NOT NULL DEFAULT 0,
  `boolean_disney` tinyint(1) NOT NULL DEFAULT 0,
  `cod_director` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `peliculas_series`
--

INSERT INTO `peliculas_series` (`id_pelicula`, `peli_serie`, `nombre`, `duracion`, `descripcion`, `vose`, `fecha_estreno`, `rango_edad`, `trailer`, `cartelera`, `imagen`, `bso`, `puntuacion_media`, `boolean_amazon`, `boolean_yt`, `boolean_hbo`, `boolean_netflix`, `boolean_disney`, `cod_director`) VALUES
(1, 0, 'Big fish', 125, 'William Bloom no tiene muy buena relación con su padre, pero tras enterarse de que padece una enfermedad terminal, regresa a su hogar para estar a su lado. Una vez más, William se verá obligado a escucharlo mientras cuenta las interminables historias de su juventud.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(2, 0, 'The Wolf of Wall Street', 76, 'La historia del corredor de bolsa neoyorquino Jordan Belfort, quien, con poco más de veinte años, fue apodado \'el lobo de Wall Street\' por su enorme éxito y fortuna como fundador de la agencia bursátil Stratton Oakmont.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(3, 0, 'Poor Things', 141, 'El Dr. Godwin resucita a la joven Bella Baxter para que aprenda a su lado. Sin embargo, ella huye en compañía de un abogado en una aventura relámpago a través de los continentes. Libre de los prejuicios de su época, se mantiene firme en su propósito de defender la igualdad y la liberación.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(4, 0, 'Babylon', 189, 'La decadencia, la depravación y los excesos escandalosos provocan el ascenso y la caída de varios ambiciosos soñadores en el Hollywood de los años veinte.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(5, 0, 'Good Will Hunting', 126, 'Will tras descubrir su talento con las matemáticas, deberá decidir si seguir con su vida de siempre o aprovechar sus grandes cualidades intelectuales en alguna universidad. Sólo los consejos de un bohemio profesor le ayudarán a decidirse.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(6, 0, 'The menu', 166, 'Margot y Tyler, una pareja joven, viajan a una isla remota para comer en un restaurante exclusivo donde un chef misterioso les prepara un menú costoso y opulento. Sin embargo, pronto queda claro que a los comensales les esperan algunas sorpresas.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(7, 0, 'Shutter Island', 138, 'Verano de 1954. Los agentes judiciales Teddy Daniels y Chuck Aule son enviados a una remota isla del puerto de Boston para investigar la desaparición de una peligrosa asesina recluida en el hospital.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(8, 0, 'Dead Poets Society', 128, 'Un grupo de alumnos descubre la importancia de perseguir los sueños gracias a un profesor que despierta sus mentes con métodos poco convencionales.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(9, 0, 'Fight Club', 139, 'Un empleado de oficina insomne en busca de una manera de cambiar su vida se cruza con un vendedor y crean un club de lucha clandestino como forma de terapia.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(10, 0, 'Catch Me If You Can', 141, 'Un adolescente estafador (Leonardo DiCaprio) se hace pasar exitosamente por un piloto de una aerolínea, un cirujano y un abogado.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(11, 0, 'Crazy, Stupid, Love', 167, 'Cal Weaver está viviendo el sueño americano. Tiene un buen trabajo, una casa preciosa, hijos excelentes y una bella esposa llamada Emily. Sin embargo, la aparentemente vida perfecta de Cal se derrumba cuando descubre que Emily le ha sido infiel y quiere divorciarse.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(12, 0, 'Halloween', 97, 'Michael Myers ha vuelto a la tranquila Haddonfield, Illinois, para cerrar algunas cuestiones familiares. Myers, más peligroso y malvado que nunca, no parará bajo ninguna circunstancia.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(13, 0, 'Intouchables', 93, 'Philippe contrata como cuidador a domicilio a Driss. Aunque a primera vista no parece la persona más indicada, los dos acaban logrando que convivan Vivaldi y Earth Wind and Fire.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(14, 0, 'House of wax', 93, 'Seis amigos que viajan por carretera para asistir al campeonato universitario de fútbol más importante del año, deciden acampar al aire libre la víspera del partido. Se dan cuenta de que su coche ha sido manipulado y aceptan la invitación de un conductor para llevarlos.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(15, 0, 'Coraline', 100, 'In the middle of Texas summer, plans for a babysitter fall through and six year old Caroline is left in charge of her two younger solblings.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(16, 0, 'La bella y la bestia', 129, 'Bella asume el lugar de su padre como prisionero en el castillo de una bestia. Poco a poco, Bella irá dándose cuenta de que el príncipe bestia no es el malvado ser que todos creen y que es y tiene, en realidad, un gran corazón.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(17, 0, 'Hostal', 94, 'Josh recorren Europa con sus mochilas junto con Oli, que lo conocen por el camino. En Eslovaquia conocen a Natalya y Svetlan con las que se distraen para aparecer atrapados en un siniestro sitio.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(18, 0, 'Titanic', 194, 'Jack es un joven artista que gana un pasaje para viajar a América en el Titanic, el transatlántico más grande y seguro jamás construido.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(19, 0, 'El ciempies humano', 92, 'Dos chicas norteamericanas que viajan a través de Europa tienen una avería en el coche en mitad de un bosque, en Alemania. Buscando ayuda llegan a una casa aislada y despiertan atrapadas en un tétrico sótano junto a un', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(20, 0, 'El oso vicioso', 95, 'En EE.UU, un oso negro se traga una gran cantidad de cocaína. De repente se desboca en el bosque: ¿qué hará este oso vicioso?¿Podrán detenerlo?Un escenario inesperado da a situaciones hilarantes en Cocaine Bear.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(21, 0, 'Saw', 103, 'Dos extraños, que se despiertan en una habitación sin recordar cómo llegaron allí, pronto descubren que son peones en un juego mortal perpetrado por un famoso asesino en serie.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(22, 0, 'Las colinas tienen ojos', 107, 'Los Carter ven truncadas sus vacaciones cuando su caravana sufre un extraño accidente en el desierto de Nuevo México. Aislados del mundo, se darán cuenta de que no están solos.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(23, 0, 'Pesadilla antes de navidad', 76, 'Cuando Jack Skellington descubre la navidad, se queda fascinado y decide mejorarla. Sin embargo, su visión de la festividad es totalmente contraria al espíritu navideño. Sus planes incluyen el secuestro de Santa Claus y la introducción de cambios bastante macabros.\r\n', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(24, 0, 'El padrino', 175, 'Don Vito Corleone, es el patriarca de una de las cinco familias que ejercen el mando de la Costa Nostra en Nueva York en los años cuarenta. Cuando el Padrino reclina intervenir en el negocio de estupefacientes, empieza una cruenta lucha de violentos episodios entre las distintas familias del crimen organizado.', '', '0000', 'A', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(25, 1, 'The office', NULL, 'The Office es una serie de televisión estadounidense de humor ambientada en una oficina regional de venta de papel radicada en la localidad de Scranton, en Pensilvania.', '', '0000', '+7', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(26, 1, 'Anatomía de grey', NULL, 'Grey\'s Anatomy es una serie de televisión de drama médico estadounidense creada por Shonda Rhimes.', '', '0000', '+7', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(27, 1, 'El oso', NULL, 'Cuando su madre muere en un derrumbe, Youk se encuentra solo para enfrentarse a un ambiente hostil.', '', '0000', '', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(28, 1, 'El zorro', NULL, 'Es considerado uno de los primeros héroes de ficción de la cultura moderna.', '', '0000', '+7', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(29, 1, 'Shameless', NULL, 'Shameless es una serie de televisión estadounidense de comedia dramática desarrollada por John Wells.', '', '0000', '+16', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(30, 1, 'House', NULL, 'En el Princenton Plainsboro de Nueva Jersey, el Dr. Gregory House, un singular genio de la medicina.', '', '0000', '', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(31, 1, 'Breaking bad', NULL, 'Breaking Bad es una serie de televisión estadounidense creada y producida por Vince Gilligan.', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(32, 1, 'iZombie', NULL, 'iZombie es una serie de televisión estadounidense de ciencia ficción y de comedia dramática creada por Rob Thomas y Diane Ruggeiro para The CW.', '', '0000', '+16', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(33, 1, 'Prison Break', NULL, 'Prison Break es una serie de televisión dramática estadounidense.', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(34, 1, 'Lost', NULL, 'Lost es una serie de televisión estadounidense emitida originalmente por American Broadcasting Company. ', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(35, 1, 'Dark', NULL, 'Dark es una serie de televisión web alemana de suspense y ciencia ficción creada por Baran bo Odar y Jantje Friese.', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(36, 1, 'Juego de tronos', NULL, 'Juego de tronos, 8 temporadas, 45 minutos cada capítulo,Game of Thrones es una serie de televisión de drama y fantasía medieval desarrollada por David Benioff y D. B. Weiss y producida por la cadena HBO.', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(37, 1, 'Zone Blanche', NULL, 'Zone Blanche es una serie televisiva franco-belga de 2017 creada por Mathieu Missoffe.', '', '0000', '+16', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1),
(38, 1, 'Narcos', NULL, 'Narcos es una serie de televisión web de ficción histórica producida por Dynamo Producciones y Gaumon International Television para Netflix. ', '', '0000', '+18', '', '', '', '', NULL, 0, 0, 0, 0, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pivot_actores_peliculas`
--

CREATE TABLE `pivot_actores_peliculas` (
  `cod_pelicula` int(11) DEFAULT NULL,
  `cod_actor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pivot_peliculas_generos`
--

CREATE TABLE `pivot_peliculas_generos` (
  `pelicula_id` int(11) DEFAULT NULL,
  `genero_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntuaciones`
--

CREATE TABLE `puntuaciones` (
  `id_puntuacion` int(11) NOT NULL,
  `comentario` text DEFAULT NULL,
  `puntuacion` decimal(3,2) DEFAULT NULL CHECK (`puntuacion` between 1 and 5),
  `fecha_publicacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_num` int(11) NOT NULL,
  `pelicula_num` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temporada`
--

CREATE TABLE `temporada` (
  `id_temporada` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `episodios` int(11) NOT NULL,
  `cartelera_temp` varchar(255) NOT NULL,
  `id_serie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `passwrd` varchar(255) NOT NULL,
  `foto_perfil` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actores`
--
ALTER TABLE `actores`
  ADD PRIMARY KEY (`id_actor`);

--
-- Indices de la tabla `directores`
--
ALTER TABLE `directores`
  ADD PRIMARY KEY (`id_director`);

--
-- Indices de la tabla `generos`
--
ALTER TABLE `generos`
  ADD PRIMARY KEY (`id_genero`);

--
-- Indices de la tabla `lista_favoritos`
--
ALTER TABLE `lista_favoritos`
  ADD PRIMARY KEY (`id_fav`),
  ADD KEY `pelicula_cod` (`pelicula_cod`),
  ADD KEY `usuario_cod` (`usuario_cod`);

--
-- Indices de la tabla `lista_ver`
--
ALTER TABLE `lista_ver`
  ADD PRIMARY KEY (`id_ver`),
  ADD KEY `pelicula_id2` (`pelicula_id2`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indices de la tabla `lista_vistas`
--
ALTER TABLE `lista_vistas`
  ADD PRIMARY KEY (`id_vista`),
  ADD KEY `cod_pelicula2` (`cod_pelicula2`),
  ADD KEY `cod_usuario` (`cod_usuario`);

--
-- Indices de la tabla `peliculas_series`
--
ALTER TABLE `peliculas_series`
  ADD PRIMARY KEY (`id_pelicula`),
  ADD KEY `cod_director` (`cod_director`);

--
-- Indices de la tabla `pivot_actores_peliculas`
--
ALTER TABLE `pivot_actores_peliculas`
  ADD KEY `cod_pelicula` (`cod_pelicula`),
  ADD KEY `cod_actor` (`cod_actor`);

--
-- Indices de la tabla `pivot_peliculas_generos`
--
ALTER TABLE `pivot_peliculas_generos`
  ADD KEY `pelicula_id` (`pelicula_id`),
  ADD KEY `genero_id` (`genero_id`);

--
-- Indices de la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  ADD PRIMARY KEY (`id_puntuacion`),
  ADD KEY `pelicula_num` (`pelicula_num`),
  ADD KEY `usuario_num` (`usuario_num`);

--
-- Indices de la tabla `temporada`
--
ALTER TABLE `temporada`
  ADD PRIMARY KEY (`id_temporada`),
  ADD KEY `id_serie` (`id_serie`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actores`
--
ALTER TABLE `actores`
  MODIFY `id_actor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=144;

--
-- AUTO_INCREMENT de la tabla `directores`
--
ALTER TABLE `directores`
  MODIFY `id_director` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de la tabla `generos`
--
ALTER TABLE `generos`
  MODIFY `id_genero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `lista_favoritos`
--
ALTER TABLE `lista_favoritos`
  MODIFY `id_fav` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `lista_ver`
--
ALTER TABLE `lista_ver`
  MODIFY `id_ver` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `lista_vistas`
--
ALTER TABLE `lista_vistas`
  MODIFY `id_vista` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `peliculas_series`
--
ALTER TABLE `peliculas_series`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  MODIFY `id_puntuacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `temporada`
--
ALTER TABLE `temporada`
  MODIFY `id_temporada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `lista_favoritos`
--
ALTER TABLE `lista_favoritos`
  ADD CONSTRAINT `lista_favoritos_ibfk_1` FOREIGN KEY (`pelicula_cod`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `lista_favoritos_ibfk_2` FOREIGN KEY (`usuario_cod`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `lista_ver`
--
ALTER TABLE `lista_ver`
  ADD CONSTRAINT `lista_ver_ibfk_1` FOREIGN KEY (`pelicula_id2`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `lista_ver_ibfk_2` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `lista_vistas`
--
ALTER TABLE `lista_vistas`
  ADD CONSTRAINT `lista_vistas_ibfk_1` FOREIGN KEY (`cod_pelicula2`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `lista_vistas_ibfk_2` FOREIGN KEY (`cod_usuario`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `peliculas_series`
--
ALTER TABLE `peliculas_series`
  ADD CONSTRAINT `peliculas_series_ibfk_1` FOREIGN KEY (`cod_director`) REFERENCES `directores` (`id_director`);

--
-- Filtros para la tabla `pivot_actores_peliculas`
--
ALTER TABLE `pivot_actores_peliculas`
  ADD CONSTRAINT `pivot_actores_peliculas_ibfk_1` FOREIGN KEY (`cod_pelicula`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `pivot_actores_peliculas_ibfk_2` FOREIGN KEY (`cod_actor`) REFERENCES `actores` (`id_actor`);

--
-- Filtros para la tabla `pivot_peliculas_generos`
--
ALTER TABLE `pivot_peliculas_generos`
  ADD CONSTRAINT `pivot_peliculas_generos_ibfk_1` FOREIGN KEY (`pelicula_id`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `pivot_peliculas_generos_ibfk_2` FOREIGN KEY (`genero_id`) REFERENCES `generos` (`id_genero`);

--
-- Filtros para la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  ADD CONSTRAINT `puntuaciones_ibfk_1` FOREIGN KEY (`pelicula_num`) REFERENCES `peliculas_series` (`id_pelicula`),
  ADD CONSTRAINT `puntuaciones_ibfk_2` FOREIGN KEY (`usuario_num`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `temporada`
--
ALTER TABLE `temporada`
  ADD CONSTRAINT `temporada_ibfk_1` FOREIGN KEY (`id_serie`) REFERENCES `peliculas_series` (`id_pelicula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
