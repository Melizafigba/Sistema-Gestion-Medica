-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 27-10-2020 a las 22:37:03
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `contigo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inicio_admi`
--

CREATE TABLE `inicio_admi` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `inicio_admi`
--

INSERT INTO `inicio_admi` (`id`,    `usuario`,     `contraseña`) VALUES
                          (1, 'administrador@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inicio_asistente`
--

CREATE TABLE `inicio_asistente` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `inicio_asistente`
--

INSERT INTO `inicio_asistente` (`id`,    `usuario`,     `contraseña`) VALUES
                               (1, 'asistente@gmail.com',     '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordenes_citas`
--

CREATE TABLE `ordenes_citas` (
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `cedula` varchar(50) NOT NULL,
  `celular` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `fecha_cita` varchar(50) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `jornada` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tipo_cita_id` int(50) NOT NULL,
  `sexo` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ordenes_citas`
--

INSERT INTO `ordenes_citas` (`nombre`, `apellido`,      `cedula`,       `celular`,         `correo`,           `fecha_cita`,   `horario`,    `jornada`,  `tipo_cita_id`,   `sexo`) VALUES
                            ('Pedro',    'Bedoya',  '1192468426',    '3219461644',    'Pedro321@gmail.com',    '30-10-2020',     '16:00',       'AM',          5,         'Masculino'),
                            ('Mario',      'Fino',  '1194623648',     '321948633',       'Mario@gmail.com',    '25-10-2024',     '10:00',       'PM',          2,         'Masculino'),
                            ('Manuel',  'Salazar',     '1234563',     '315678954',      'Manuel@gmail.com',    '28-10-2020',     '09:30',       'AM',          1,         'Masculino'),
                            ('Juan',   'Valencia',     '1765843',      '31457687','JuanValencia@gmail.com',    '10-10-2020',     '09:07',       'AM',          1,         'Masculino'),
                            ('Mariana', 'Ordoñes', '31194568492',   '32194864977',     'Mariord@gmail.com',    '31-10-2020',     '10:50',       'PM',          5,          'Femenino'),
                            ('Patricia', 'Campos', '31946423618',    '3119462015',  'campo154@hotmail.com',    '26-10-2020',     '10:30',       'PM',          1,          'Femenino'),
                            ('Juan',      'Lopez',   '319486460',    '3219462577',  'Lopez123@hotmail.com',    '23-11-2017',     '15:30',       'AM',          3,         'Masculino'),
                            ('Paula',    'Zapata',   '343563423',     '315687942',    'Paulaxp9@gmail.com',    '29-10-2020',     '16:69',       'AM',          1,          'Femenino'),
                            ('Manuel',   'Olarra',     '3446343',     '345678543',        'Cero@gmail.com',    '29-10-2020',      '9:15',       'AM',          2,         'Masculino'),
                            ('Maria',   'Gallego',     '3458764',     '315798657',       'Maria@gmail.com',    '29-10-2020',     '15:00',       'PM',          1,          'Femenino'),
                            ('Johan',  'Martinez',     '3464356',     '345678943',    'JohanXp8@gmail.com',    '23-10-2020',     '09:97',       'AM',          2,         'Masculino'),
                            ('Pedro', 'Rodríguez',    '34960482',     '311964875',  'Pedro123@hotmail.com',    '30-10-2020',     '15:10',       'PM',          3,         'Masculino'),
                            ('Carlos',   'Castro',    '36589594',      '34650932',   'CarlosXp9@gmail.com',    '31-10-2020',     '09:98',       'PM',          1,          'Femenino'),
                            ('Luisa',   'Ordoñez',    '54654334',     '315789678',    'LuisaXp9@gmail.com',    '30-10-2020',     '15:09',       'AM',          2,          'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_doctores`
--

CREATE TABLE `registro_doctores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `tipo_cita_id` int(11) NOT NULL,
  `cedula` varchar(50) NOT NULL,
  `celular` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `registro_doctores`
--

INSERT INTO `registro_doctores` (`id`,     `nombre`,   `apellido`,  `tipo_cita_id`,      `cedula`,        `celular`,      `correo`,                 `contraseña`) VALUES
                                (1,    'Sebastián ',     'Obando',        2,          '103468261',      '921946756',   'SebastianOb123@gmail.com',        '1234'),
                                (2,       'Julian ',    'Quesada',        1,          '119346134',      '921694758',   'Julian@hotmail.com',              '1234'),
                                (3,       'Manuel ',       'Ciro',        5,          '119346497',      '921757156',   'ManuelCiro@gmail.com',            '1234'),
                                (4,        'Karol ',    'Salazar',        4,          '345678443',      '915689763',   'Karolito@gmail.com',              '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_paciente`
--

CREATE TABLE `registro_tutor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `tipo_sexo_id` int(11) NOT NULL,
  `cedula` varchar(50) NOT NULL,
  `movil` varchar(9) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `registro_tutor`
--

INSERT INTO `registro_tutor` (`id`,      `nombre`,    `apellido`,   `tipo_sexo_id`,      `cedula`,       `movil`,          `correo`,             `contraseña`) VALUES
                                (2,   'Sebastián',      'Obando',          2,         '103468261',   '921946756',    'SebastianOb123@gmail.com',       '1234'),
                                (3,      'Julian',     'Quesada',          2,         '119346134',   '921694758',    'Julian@hotmail.com',             '1234'),
                                (4,      'Manuel',        'Ciro',          2,         '119346249',   '921757156',    'ManuelCiro@gmail.com',           '1234'),
                                (5,       'Karol',     'Salazar',          1,         '345678443',   '915689763',    'Karolito@gmail.com',             '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_cita`
--

CREATE TABLE `tipo_cita` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_cita`
--

INSERT INTO `tipo_cita` (`id`,       `nombre`) VALUES
                        (1,     'Odontologia'),
                        (2, 'Medico general '),
                        (3,      'Radiologia'),
                        (4,     'Cardiologia'),
                        (5,       'Psicologo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_sexo`
--

CREATE TABLE `tipo_sexo` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_sexo`
--

INSERT INTO `tipo_sexo` (`id`, `nombre`) VALUES
                        (1,  'Femenino'),
                        (2, 'Masculino');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_jornada`
--

CREATE TABLE `tipo_jornada` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_jornada`
--

INSERT INTO `tipo_jornada` (`id`, `nombre`) VALUES
                           (1,       'A.M'),
                           (2,       'P.M');
--
-- Estructura de tabla para la tabla `hijos`
--

CREATE TABLE `hijos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `tipo_sexo_id` int(11) NOT NULL,
  `rut` varchar(50) NOT NULL,
  `alergico` varchar(50) NOT NULL,
  `diagnostico` varchar(50) NOT NULL,
  `fecha_cita` varchar(50) NOT NULL,
  `padre_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `hijos`
--

INSERT INTO `hijos` (`id`,     `nombre`,   `apellido`, `tipo_sexo_id`,   `rut`,          `alergico`,        `diagnostico`,       `fecha_cita`,       `padre_id`) VALUES
                    (0,     'Sebastián',     'Obando',        2,       '202020',        ' Dipirona',           'Pulmonia',       '30-10-2021',    '10346826136'),
                    (1,          'Juan',    'Quezada',        2,       '202202',            'Polen',    'Dolor Estomacal',        '4-10-2021',    '10346826136'),
                    (2,          'Rosa',       'Lara',        1,       '232323',         'Aspirina',            'Vomitos',       '30-05-2022',    '10346826136'),
                    (3,         'Maria',      'Suarez,       '1,       '242424',               'no',            'Resfrio',       '30-04-2021',     '1193462497'),
                    (4,        'Daniel',    'Gonzalez,       '2,       '252525',  'Frutas Citricas',    'Dolor de cabeza',       '30-03-2022',     '1193462497');

-- --------------------------------------------------------
--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `inicio_admi`
--
ALTER TABLE `inicio_admi`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inicio_asistente`
--
ALTER TABLE `inicio_asistente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ordenes_citas`
--
ALTER TABLE `ordenes_citas`
  ADD UNIQUE KEY `ced` (`cedula`),
  ADD UNIQUE KEY `cel` (`celular`),
  ADD UNIQUE KEY `cor` (`correo`),
  ADD KEY `FK_tipo` (`tipo_cita_id`);

-- Indices de la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_hijos` (`tipo_sexo_id`);
--
-- Indices de la tabla `registro_doctores`
--
ALTER TABLE `registro_doctores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_doctores` (`tipo_cita_id`);

--
-- Indices de la tabla `registro_paciente`
--
ALTER TABLE `registro_tutor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_tutor` (`tipo_sexo_id`);
--
-- Indices de la tabla `tipo_cita`
--
ALTER TABLE `tipo_cita`
  ADD PRIMARY KEY (`id`);
  
--
-- Indices de la tabla `tipo_sexo`
--
ALTER TABLE `tipo_sexo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_jornada`
--
ALTER TABLE `tipo_jornada`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `inicio_admi`
--
ALTER TABLE `inicio_admi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `inicio_asistente`
--
ALTER TABLE `inicio_asistente`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `registro_doctores`
--
ALTER TABLE `registro_doctores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `registro_paciente`
--
ALTER TABLE `registro_tutor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `hijos`
--
ALTER TABLE `hijos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tipo_cita`
--
ALTER TABLE `tipo_cita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
  
--
-- AUTO_INCREMENT de la tabla `tipo_sexo`
--
ALTER TABLE `tipo_sexo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tipo_jornada`
--
ALTER TABLE `tipo_jornada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ordenes_citas`
--
ALTER TABLE `ordenes_citas`
  ADD CONSTRAINT `FK_tipo` FOREIGN KEY (`tipo_cita_id`) REFERENCES `tipo_cita` (`id`);

--
-- Filtros para la tabla `registro_doctores`
--
ALTER TABLE `registro_doctores`
  ADD CONSTRAINT `FK_doctores` FOREIGN KEY (`tipo_cita_id`) REFERENCES `tipo_cita` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
  
  -- Filtros para la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD CONSTRAINT `FK_hijos` FOREIGN KEY (`tipo_sexo_id`) REFERENCES `tipo_sexo` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
--
-- Filtros para la tabla `registro_paciente`
--
ALTER TABLE `registro_tutor`
  ADD CONSTRAINT `FK_tutor` FOREIGN KEY (`tipo_sexo_id`) REFERENCES `tipo_sexo` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
