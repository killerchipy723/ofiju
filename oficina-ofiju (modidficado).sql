-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-01-2025 a las 02:19:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `oficina-ofiju`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expedientes`
--

CREATE TABLE `expedientes` (
  `ID_EXP` int(255) NOT NULL,
  `NUMERO` int(100) NOT NULL,
  `CARATULA` varchar(300) NOT NULL,
  `LEGAJO` int(10) NOT NULL,
  `AP` int(10) NOT NULL,
  `ESTADO` varchar(50) NOT NULL,
  `OBSERVACIONES` varchar(50) NOT NULL,
  `FECHA_INGRESO` date NOT NULL,
  `FECHA_EGRESO` date NOT NULL,
  `FECHA_AUDIENCIA` date NOT NULL,
  `HORA_AUDIENCIA` datetime(6) NOT NULL,
  `ULTIMO_TRAMITE` varchar(200) NOT NULL,
  `ID_ORGANISMO` int(10) NOT NULL,
  `ID_PERSONAL` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `organismo`
--

CREATE TABLE `organismo` (
  `ID_ORG` int(50) NOT NULL,
  `JUZGADO-TRIBUNAL` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `organismo`
--

INSERT INTO `organismo` (`ID_ORG`, `JUZGADO-TRIBUNAL`) VALUES
(1, 'GARANTIA 1'),
(2, 'GARANTIA 2'),
(3, 'VOCALIA 1'),
(4, 'VOCALIA 2'),
(5, 'VOCALIA 3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `id_personal` int(11) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `CARGO` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`id_personal`, `apellido`, `nombre`, `CARGO`) VALUES
(1, 'DR. MARTINEZ', 'JOSE EDGARDO', 'DEFENSOR OFICIAL'),
(2, 'DR. COLQUE', 'JORGE ROLANDO', 'DEFENSOR OFICIAL'),
(3, 'DR. CASTELLANO', 'SERGIO OSVALDO', 'FISCAL'),
(4, 'DR.GOMEZ', 'AMADO GONZALO', 'FISCAL'),
(5, 'DRA. REDONDO', 'SUSANA', 'FISCAL'),
(6, 'DR. LÓPEZ IBARRA', 'OSCAR', 'FISCAL'),
(7, 'DR. RODRIGUEZ', 'NICOLAS', 'FISCAL'),
(8, 'DRA. GARCIA PISACIC', 'MARIA CELESTE', 'FISCAL'),
(9, 'DR. SALINAS ODORICIO', 'JUAN MANUEL', 'DEFENSOR'),
(10, 'DR. ANDULCE', 'VICTOR', 'DEFENSOR'),
(11, 'DR. GRAMAGLIA', 'RAMIRO', 'AUDIENCISTA'),
(12, 'DRA. DELGADO', 'CELIDE', 'AUDIENCISTA'),
(13, 'DRA. GARCIA', 'VERONICA', 'AUDIENCISTA'),
(14, 'DRA. SUAREZ', 'VALENTINA', 'AUDIENCISTA'),
(15, 'DR. SAN MARTIN', 'GUILLERMO', 'AUDIENCISTA'),
(16, 'SILVA', 'MARIELA', 'AUDIENCISTA'),
(17, 'LEAL', 'SERGIO', 'TECNICO'),
(18, 'ESPECHE', 'ESTEBAN', 'TECNICO'),
(19, 'ABEYA', 'MATIAS', 'ATENCION AL PUBLICO'),
(20, 'JULIAN', 'FARAH', 'ATENCION AL PUBLICO'),
(21, 'PISACIC', 'NORMA VERONICA', 'AREA DE AGENDA Y ESTADÍSTICA'),
(22, 'GONZALEZ', 'MANUEL', 'AREA DE AGENDA '),
(23, 'DRA. CUNIVERTI', 'MARINA', 'AREA JURIDICO'),
(24, 'DRA. VIÑAS TOLEDO', 'MARCELA', 'AREA DE OGA'),
(25, 'DRA. CASTILLO  ', 'VICTORIA', 'AUDIENCISTA'),
(26, 'ZIGARAN', 'MARIA GUADALUPE', 'MESA DE ENTRADA'),
(27, 'PEDRAZA', 'SILVINA', 'MESA DE ENTRADA\r\n'),
(28, 'DR. RETUERA', 'JOSE HORACIO', 'COORDINADOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_USUARIO` int(50) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `clave` varchar(50) NOT NULL,
  `privilegio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `expedientes`
--
ALTER TABLE `expedientes`
  ADD PRIMARY KEY (`ID_EXP`),
  ADD KEY `ID_ORGANISMO` (`ID_ORGANISMO`),
  ADD KEY `ID_PERSONAL` (`ID_PERSONAL`);

--
-- Indices de la tabla `organismo`
--
ALTER TABLE `organismo`
  ADD PRIMARY KEY (`ID_ORG`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`id_personal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `expedientes`
--
ALTER TABLE `expedientes`
  MODIFY `ID_EXP` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `organismo`
--
ALTER TABLE `organismo`
  MODIFY `ID_ORG` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `id_personal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `expedientes`
--
ALTER TABLE `expedientes`
  ADD CONSTRAINT `expedientes_ibfk_1` FOREIGN KEY (`ID_ORGANISMO`) REFERENCES `organismo` (`ID_ORG`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `expedientes_ibfk_2` FOREIGN KEY (`ID_PERSONAL`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
