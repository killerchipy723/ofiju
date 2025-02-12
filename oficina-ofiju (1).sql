-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-02-2025 a las 01:54:19
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
  `id_exp` int(255) NOT NULL,
  `numero` varchar(100) NOT NULL,
  `organismo` varchar(100) NOT NULL,
  `legajo` varchar(50) NOT NULL,
  `ap` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `caratula` varchar(300) NOT NULL,
  `aud` varchar(100) NOT NULL,
  `apublico` varchar(100) NOT NULL,
  `tecnico` varchar(100) NOT NULL,
  `secretario` varchar(100) NOT NULL,
  `juez` varchar(100) NOT NULL,
  `fiscal` varchar(100) NOT NULL,
  `defensor` varchar(100) NOT NULL,
  `asesor` varchar(100) DEFAULT NULL,
  `abo` varchar(100) DEFAULT 'NO CORRESPONDE',
  `pedido` varchar(100) DEFAULT NULL,
  `faud` date DEFAULT NULL,
  `haud` varchar(150) DEFAULT NULL,
  `fingreso` date NOT NULL,
  `fegreso` date DEFAULT NULL,
  `utramite` varchar(200) NOT NULL,
  `observaciones` varchar(300) DEFAULT NULL,
  `id_personal` int(255) DEFAULT NULL
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
(1, 'DR. MARTINEZ', 'JOSE EDGARDO', 'DEFENSOR  '),
(2, 'DR. COLQUE', 'JORGE ROLANDO', 'DEFENSOR  '),
(3, 'DR. CASTELLANO', 'SERGIO OSVALDO', 'FISCAL'),
(4, 'DR.GOMEZ', 'AMADO GONZALO', 'FISCAL '),
(5, 'DRA. REDONDO', 'SUSANA', 'FISCAL '),
(6, 'DR. LÓPEZ IBARRA', 'OSCAR', 'FISCAL '),
(7, 'DR. RODRIGUEZ', 'NICOLAS ', 'FISCAL '),
(8, 'DRA. GARCIA PISACIC', 'MARIA CELESTE', 'FISCAL '),
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
(28, 'DR. RETUERA', 'JOSE HORACIO', 'COORDINADOR'),
(29, 'DR. FUCHO', 'SEBASTIÁN GUSTAVO', 'JUEZ '),
(30, 'DRA. POMA SALVADORES', 'CAROLINA EDITH', 'JUEZ '),
(31, 'DR. HADDAD', 'RAMÓN ALBERTO', 'JUEZ '),
(32, 'DR. DILASCIO', 'MARIO', 'JUEZ  '),
(33, 'DR. TESYRA', 'MARIO HERMINIO', 'JUEZ  '),
(34, 'SARAVIA', 'CESAR ARTURO', ' FISCAL'),
(35, 'GUZMAN', 'HECTOR SEBASTIAN', 'JUEZ '),
(36, 'OTERO', 'DIANA VERONICA', 'SECRETARIO'),
(37, 'PALERMO', 'HUGO MATIAS', 'SECRETARIO'),
(38, 'ANDIAS', 'RENATA', 'SECRETARIO'),
(39, 'CAILLOU', 'LUCIANA', 'SECRETARIO'),
(40, 'GARCIA', 'VALERIA', 'SECRETARIO'),
(41, 'NO', 'CORRESPONDE', 'ABOGADO'),
(42, 'DR. RUIZ', 'NICOLAS', 'ABOGADO');

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
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_USUARIO`, `nombre`, `apellido`, `usuario`, `clave`, `privilegio`) VALUES
(1, 'Standard', 'Prueba', 'admin', 'admin', 'Administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `expedientes`
--
ALTER TABLE `expedientes`
  ADD PRIMARY KEY (`id_exp`),
  ADD KEY `ID_ORGANISMO` (`organismo`),
  ADD KEY `ID_PERSONAL` (`id_personal`);

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
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_USUARIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `expedientes`
--
ALTER TABLE `expedientes`
  MODIFY `id_exp` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `organismo`
--
ALTER TABLE `organismo`
  MODIFY `ID_ORG` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `id_personal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_USUARIO` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `expedientes`
--
ALTER TABLE `expedientes`
  ADD CONSTRAINT `expedientes_ibfk_2` FOREIGN KEY (`id_personal`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
