-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-01-2025 a las 01:01:53
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
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  MODIFY `id_personal` int(11) NOT NULL AUTO_INCREMENT;

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
