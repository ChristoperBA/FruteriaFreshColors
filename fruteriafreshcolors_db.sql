-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2022 a las 05:51:45
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fruteriafreshcolors`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogofrutas`
--

CREATE TABLE `catalogofrutas` (
  `IdCatalogoFrutas` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Cantidad` double NOT NULL,
  `Precio` double NOT NULL,
  `Provedor` varchar(255) NOT NULL,
  `Temporada` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `catalogofrutas`
--

INSERT INTO `catalogofrutas` (`IdCatalogoFrutas`, `Nombre`, `Descripcion`, `Cantidad`, `Precio`, `Provedor`, `Temporada`) VALUES
(1, 'B', 'asas', 32312, 111, '1313', '13123'),
(2, 'a', 'asada', 121, 1000, 'Elvis ', 'Siembra y Cosecha Marzo ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdUsuarios` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellidos` varchar(255) NOT NULL,
  `Nickname` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Estado` varchar(255) NOT NULL,
  `Categoria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IdUsuarios`, `Nombre`, `Apellidos`, `Nickname`, `Password`, `Estado`, `Categoria`) VALUES
(1, 'ASD', 'A2D', 'ASD', 'ASD', 'Activo', 'Cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `IdVentas` int(11) NOT NULL,
  `Cliente` varchar(255) NOT NULL,
  `Fruta` varchar(255) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Cantidad` double NOT NULL,
  `Precio` double NOT NULL,
  `Fecha` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`IdVentas`, `Cliente`, `Fruta`, `Descripcion`, `Cantidad`, `Precio`, `Fecha`) VALUES
(1, 'ASD', 'ASD', 'ASASADADADADADA', 23, 12323, '2022-12-10');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catalogofrutas`
--
ALTER TABLE `catalogofrutas`
  ADD PRIMARY KEY (`IdCatalogoFrutas`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdUsuarios`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`IdVentas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `catalogofrutas`
--
ALTER TABLE `catalogofrutas`
  MODIFY `IdCatalogoFrutas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IdUsuarios` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `IdVentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
