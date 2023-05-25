-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2023 at 09:16 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vehicle`
--

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `User_id` int(11) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `address` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`User_id`, `UserName`, `Password`, `email`, `firstName`, `lastName`, `address`) VALUES
(1, 'Kelvin', '123456', 'kel@gmail.com', 'Kelvin', 'Githu', 'Nairobi'),
(2, 'kel', 'varchar', 'kel@gmail.com', 'kel', 'git', 'nairobi'),
(3, 'judy', 'judy', 'jud@gmail.com', 'judy', 'judy', 'nairobi'),
(4, 'leejay', '1234', 'lee@gmail.com', 'lee', 'jay', 'utawala');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `Vehicle_ID` int(11) NOT NULL,
  `CarType` varchar(30) NOT NULL,
  `vehicleMake` varchar(20) NOT NULL,
  `vehicleName` varchar(20) NOT NULL,
  `vehicleModel` varchar(20) NOT NULL,
  `vehicleYear` varchar(20) NOT NULL,
  `vehiclePrice` float NOT NULL,
  `vehicleColor` varchar(50) NOT NULL,
  `bodyType` varchar(25) NOT NULL,
  `noOfDoors` int(3) NOT NULL,
  `Space` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`Vehicle_ID`, `CarType`, `vehicleMake`, `vehicleName`, `vehicleModel`, `vehicleYear`, `vehiclePrice`, `vehicleColor`, `bodyType`, `noOfDoors`, `Space`) VALUES
(1, '', 'Nissan', 'GTR35', 'Skyline', '2020', 2000000, 'Black', 'Sleek', 2, 4),
(3, '', 'Toyota', 'Toyota E86', 'Sport', '1998', 2000000, 'White Stripped  with Yellow', 'buggy', 4, 4),
(5, 'Car', 'Toyota', 'm20', 'Supra', '2022', 3000000, 'Grey', 'Buggy', 2, 4),
(8, 'Motorcycle', 'Honda', 'kawasaki', 'her', '2020', 10000000, 'Blue', 'bike', 0, 2),
(9, 'Car', 'BMW', 'M3 coupe', 'sport', '2010', 2000000, 'Blue', 'Sleek', 4, 4),
(11, 'Van', 'Mercedes', 'E300', 'E class', '2003', 2000000, 'White', 'Buggy', 3, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`User_id`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`Vehicle_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `User_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `Vehicle_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
