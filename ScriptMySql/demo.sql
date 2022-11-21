-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2022 a las 07:13:35
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `demo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_entidad`
--

CREATE TABLE `tb_entidad` (
  `id_entidad` int(11) NOT NULL,
  `id_tipo_documento` int(11) NOT NULL,
  `nro_documento` varchar(25) NOT NULL,
  `razon_social` varchar(100) NOT NULL,
  `nombre_comercial` varchar(100) DEFAULT NULL,
  `id_tipo_contribuyente` int(11) DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `estado` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_entidad`
--

INSERT INTO `tb_entidad` (`id_entidad`, `id_tipo_documento`, `nro_documento`, `razon_social`, `nombre_comercial`, `id_tipo_contribuyente`, `direccion`, `telefono`, `estado`) VALUES
(1, 1, '20505327552', 'SYL S.A.C', 'SYL CARGO NOMBRE COMERCIAL', 1, 'Jr. Comandante Jimenez Nro. 166 Int. a (entre Cuadra 7 y 8 Javier Padro Oeste)', '79845612', b'1'),
(2, 2, '20543844838', 'PUNTUAL EXPRESS S.A.C.', '', 1, 'MZA. F LOTE. 29 AS.RSD.MONTECARLO II LIMA - LIMA - SAN MARTIN DE PORRE', '', b'1'),
(3, 3, '10410192999', 'ALVAREZ MACHUCA RENZO GUSTAVO', '', 3, 'AV. LOS ALISOS MZA. G LOTE. 05 ASC. LA ALBORADA DE OQUENDO III ETAPA (CRUCE PTE OQUENDO CON AV.NESTOR GAMBETTA) PROV. CONST. DEL CALLAO - PROV. CONST. DEL CALLAO - CALLAO', '', b'1'),
(4, 3, '20600131037', 'CARNICOS MAFER S.A.C.', '', 2, 'CAL.EL UNIVERSO NRO. 327 URB. LA CAMPIÑA ZONA CINCO (ALTURA ', '', b'1'),
(5, 3, '20556528218', 'SUMAQUINARIA S.A.C.', '', 2, 'AV. M.SUCRE NRO. 455 DPTO. 603 LIMA - LIMA - MAGDALENA DEL MAR', '', b'1'),
(6, 3, '20545412528', 'OASIS FOODS S.A.C.', '', 2, 'CAL. FRANCISCO MASIAS NRO. 370 URB. SAN EUGENIO (PISO 7) LIM', '', b'1'),
(7, 3, '20510620195', 'INVERSIONES PRO3 SAC', '', 2, 'AV. AUTOPIDTA RAMIRO PRIALE LOTE. 02 A.V. PROP HUERTOS DE HU', '', b'1'),
(8, 3, '20498383361', 'REPUESTOS DAVID DIESEL E.I.R.L.', '', 2, 'CAR.VIA EVITAMIENTO MZA. 857 LOTE. 7 SEC. IRRIGACION EL CURAL 1 AREQUIPA - AREQUIPA - CERRO COLORADO', '', b'1'),
(9, 6, 'CNAH00003', 'ANHUI HAYVO PROTECTIVE PRODUCT MANUFACTURING CO.,LTD', '', 4, '173 FENGLE AVENUE,ECNOMIC DEVELOPMENT ZONE,QUANJIAO COUNTY', '', b'1'),
(11, 3, '1234', 'prueba', 'prueba', 2, 'prueba', '12447', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_tipo_contribuyente`
--

CREATE TABLE `tb_tipo_contribuyente` (
  `id_tipo_contribuyente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_tipo_contribuyente`
--

INSERT INTO `tb_tipo_contribuyente` (`id_tipo_contribuyente`, `nombre`, `estado`) VALUES
(1, 'Natural Sin Negocio', b'1'),
(2, 'Juridica', b'1'),
(3, 'Natural Con Negocio', b'1'),
(4, 'No Domiciliado', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_tipo_documento`
--

CREATE TABLE `tb_tipo_documento` (
  `id_tipo_documento` int(11) NOT NULL,
  `codigo` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `estado` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_tipo_documento`
--

INSERT INTO `tb_tipo_documento` (`id_tipo_documento`, `codigo`, `nombre`, `descripcion`, `estado`) VALUES
(1, '4', 'CARNET DE EXTRANJERIA', 'CARNET DE EXTRANJERIA', b'1'),
(2, '7', 'PASAPORTE', 'PASAPORTE', b'1'),
(3, '11', 'PARTIDA DE NACIMIENTO - IDENTIDAD', 'PARTIDA DE NACIMIENTO - IDENTIDAD', b'1'),
(4, '99', 'OTROS', 'OTROS', b'1'),
(5, '6', 'RUC', 'REGISTRO UNICO DEL CONTRIBUYENTE', b'1'),
(6, '1', 'DNI', 'DOCUMENTO NACIONAL DE IDENTIDAD', b'1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_entidad`
--
ALTER TABLE `tb_entidad`
  ADD PRIMARY KEY (`id_entidad`),
  ADD UNIQUE KEY `nro_documento` (`nro_documento`);

--
-- Indices de la tabla `tb_tipo_contribuyente`
--
ALTER TABLE `tb_tipo_contribuyente`
  ADD PRIMARY KEY (`id_tipo_contribuyente`);

--
-- Indices de la tabla `tb_tipo_documento`
--
ALTER TABLE `tb_tipo_documento`
  ADD PRIMARY KEY (`id_tipo_documento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_entidad`
--
ALTER TABLE `tb_entidad`
  MODIFY `id_entidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tb_tipo_contribuyente`
--
ALTER TABLE `tb_tipo_contribuyente`
  MODIFY `id_tipo_contribuyente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tb_tipo_documento`
--
ALTER TABLE `tb_tipo_documento`
  MODIFY `id_tipo_documento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
