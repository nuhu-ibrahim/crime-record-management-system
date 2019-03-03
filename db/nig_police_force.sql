-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2018 at 09:34 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nig_police_force`
--

-- --------------------------------------------------------

--
-- Table structure for table `citizeninfo`
--

CREATE TABLE `citizeninfo` (
  `citizen_id` int(11) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `mstatus` varchar(200) NOT NULL,
  `stateOfOrigin` varchar(200) NOT NULL,
  `LGA` varchar(200) NOT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(200) NOT NULL,
  `NIN` varchar(200) NOT NULL,
  `passport` varchar(200) NOT NULL,
  `bio` varchar(300) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `court_info`
--

CREATE TABLE `court_info` (
  `court_info_id` int(11) NOT NULL,
  `crime_id` int(11) NOT NULL,
  `judge_name` varchar(200) NOT NULL,
  `judge_decision` varchar(200) NOT NULL,
  `case_file_address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `crimetbl`
--

CREATE TABLE `crimetbl` (
  `crime_id` int(11) NOT NULL,
  `NIN` varchar(200) NOT NULL,
  `crime_name` varchar(200) NOT NULL,
  `crime_status` varchar(200) NOT NULL,
  `report_date` date NOT NULL,
  `occurence_date` date NOT NULL,
  `crime_locatiom` varchar(200) NOT NULL,
  `complainant_ID` varchar(200) NOT NULL,
  `complainant_comment` text NOT NULL,
  `evidence_info` varchar(300) NOT NULL,
  `DPO_comment` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usertbl`
--

CREATE TABLE `usertbl` (
  `user_id` int(11) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `usertype` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usertbl`
--

INSERT INTO `usertbl` (`user_id`, `firstname`, `lastname`, `username`, `password`, `usertype`) VALUES
(1, 'Aminu', 'Haruna Maipampo', 'ADMIN', 'ADMIN', 'ROLE_POLICE'),
(2, 'Aminu', 'Haruna Maipampo', 'COURT', 'COURT', 'ROLE_COURT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `citizeninfo`
--
ALTER TABLE `citizeninfo`
  ADD PRIMARY KEY (`citizen_id`);

--
-- Indexes for table `court_info`
--
ALTER TABLE `court_info`
  ADD PRIMARY KEY (`court_info_id`);

--
-- Indexes for table `crimetbl`
--
ALTER TABLE `crimetbl`
  ADD PRIMARY KEY (`crime_id`);

--
-- Indexes for table `usertbl`
--
ALTER TABLE `usertbl`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `citizeninfo`
--
ALTER TABLE `citizeninfo`
  MODIFY `citizen_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `court_info`
--
ALTER TABLE `court_info`
  MODIFY `court_info_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `crimetbl`
--
ALTER TABLE `crimetbl`
  MODIFY `crime_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `usertbl`
--
ALTER TABLE `usertbl`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
