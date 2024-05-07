-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 07 May 2024, 02:59:03
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `hotelreservation`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hotel`
--

CREATE TABLE `hotel` (
  `hotelid` int(2) NOT NULL,
  `hotelName` varchar(2) DEFAULT NULL,
  `locaion` varchar(2) DEFAULT NULL,
  `numberofRooms` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `hotel`
--

INSERT INTO `hotel` (`hotelid`, `hotelName`, `locaion`, `numberofRooms`) VALUES
(1, 'RO', 'İZ', 50),
(2, 'SE', 'BO', 80),
(3, 'WH', 'AN', 65),
(4, 'PR', 'ÇA', 55),
(5, 'Ex', 'AR', 100);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `payment`
--

CREATE TABLE `payment` (
  `paymentid` int(2) NOT NULL,
  `totalAmount` int(2) DEFAULT NULL,
  `cardNumber` int(2) DEFAULT NULL,
  `reservationid` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `payment`
--

INSERT INTO `payment` (`paymentid`, `totalAmount`, `cardNumber`, `reservationid`) VALUES
(1, 2550, 123456, 1),
(2, 4000, 654321, 2),
(3, 2250, 456789, 3),
(4, 4500, 987654, 4);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `reservation`
--

CREATE TABLE `reservation` (
  `reservationid` int(11) NOT NULL,
  `checkinDate` date NOT NULL,
  `checkoutDate` date NOT NULL,
  `userid` int(11) NOT NULL,
  `hotelid` int(11) NOT NULL,
  `roomid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `reservation`
--

INSERT INTO `reservation` (`reservationid`, `checkinDate`, `checkoutDate`, `userid`, `hotelid`, `roomid`) VALUES
(1, '2024-09-17', '2024-09-20', 1, 1, 1),
(2, '2024-10-08', '2024-10-13', 2, 2, 2),
(3, '2024-06-25', '2024-06-28', 3, 3, 3),
(4, '2024-05-10', '2024-05-15', 4, 4, 4);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `room`
--

CREATE TABLE `room` (
  `roomid` int(2) NOT NULL,
  `roomNumber` int(2) DEFAULT NULL,
  `price` int(2) DEFAULT NULL,
  `hotelid` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `room`
--

INSERT INTO `room` (`roomid`, `roomNumber`, `price`, `hotelid`) VALUES
(1, 12, 850, 1),
(2, 34, 800, 2),
(3, 8, 750, 3),
(4, 48, 900, 4);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `userid` int(2) NOT NULL,
  `firstName` varchar(2) DEFAULT NULL,
  `lastName` varchar(2) DEFAULT NULL,
  `password` varchar(2) DEFAULT NULL,
  `email` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`userid`, `firstName`, `lastName`, `password`, `email`) VALUES
(1, 'LA', 'ÇE', '12', 'la'),
(2, 'SE', 'BÜ', '12', 'se'),
(3, 'SU', 'Çİ', '43', 'su'),
(4, 'EC', 'GÜ', '32', 'ec'),
(5, 'Jo', 'De', '67', NULL),
(5, 'Jo', 'De', '67', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
