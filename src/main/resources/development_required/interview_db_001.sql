-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2020 at 03:34 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `interview_db_001`
--

-- --------------------------------------------------------

--
-- Table structure for table `category_tbl`
--

CREATE TABLE `category_tbl` (
  `ct_id` int(255) NOT NULL,
  `ct_parent_ct_id` int(255) NOT NULL DEFAULT 0,
  `ct_title` varchar(255) NOT NULL,
  `ct_status` int(3) NOT NULL DEFAULT 1,
  `ct_param1` varchar(255) DEFAULT NULL,
  `ct_param2` varchar(255) DEFAULT NULL,
  `ct_param3` varchar(255) DEFAULT NULL,
  `ct_param4` varchar(255) DEFAULT NULL,
  `ct_param5` varchar(255) DEFAULT NULL,
  `ct_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `ct_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_tbl`
--

INSERT INTO `category_tbl` (`ct_id`, `ct_parent_ct_id`, `ct_title`, `ct_status`, `ct_param1`, `ct_param2`, `ct_param3`, `ct_param4`, `ct_param5`, `ct_created_datetime`, `ct_updated_datetime`) VALUES
(1, 0, 'Shoes', 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:45:24', '2020-03-15 21:45:24'),
(2, 1, 'Pump', 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:45:49', '2020-03-15 21:45:49'),
(3, 0, 'For Women', 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:45:49', '2020-03-15 21:45:49'),
(4, 3, 'Shoes', 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:46:20', '2020-03-15 21:46:20'),
(5, 4, 'Golf', 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:46:20', '2020-03-15 21:46:20');

-- --------------------------------------------------------

--
-- Table structure for table `jwt_tbl`
--

CREATE TABLE `jwt_tbl` (
  `jt_id` int(255) NOT NULL,
  `jt_ut_id` bigint(255) NOT NULL,
  `jt_token` varchar(255) NOT NULL,
  `jt_expired_on` bigint(20) NOT NULL,
  `jt_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `jt_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jwt_tbl`
--

INSERT INTO `jwt_tbl` (`jt_id`, `jt_ut_id`, `jt_token`, `jt_expired_on`, `jt_created_datetime`, `jt_updated_datetime`) VALUES
(44, 2, 'eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMDAxQHRlc3QuY29tIiwic2NvcGVzIjoiUk9MRV9VU0VSIiwiaWF0IjoxNTg0MjgyODMwLCJleHAiOjE1ODQzMDA4MzB9.1x4XRX5MHycRN2_-bb7L_PAc_lKRhuKMf93ScMRgj-E', 1584300831148, '2020-03-15 22:33:51', '2020-03-15 22:33:51');

-- --------------------------------------------------------

--
-- Table structure for table `merchant_tbl`
--

CREATE TABLE `merchant_tbl` (
  `mt_id` int(255) NOT NULL,
  `mt_status` int(3) NOT NULL DEFAULT 1,
  `mt_title` varchar(255) NOT NULL,
  `mt_param1` varchar(255) DEFAULT NULL,
  `mt_param2` varchar(255) DEFAULT NULL,
  `mt_param3` varchar(255) DEFAULT NULL,
  `mt_param4` varchar(255) DEFAULT NULL,
  `mt_param5` varchar(255) DEFAULT NULL,
  `mt_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `mt_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `merchant_tbl`
--

INSERT INTO `merchant_tbl` (`mt_id`, `mt_status`, `mt_title`, `mt_param1`, `mt_param2`, `mt_param3`, `mt_param4`, `mt_param5`, `mt_created_datetime`, `mt_updated_datetime`) VALUES
(1, 1, 'Reebook', NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:47:03', '2020-03-15 21:47:03'),
(2, 1, 'Ecco', NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:47:03', '2020-03-15 21:47:03');

-- --------------------------------------------------------

--
-- Table structure for table `product_image_tbl`
--

CREATE TABLE `product_image_tbl` (
  `pit_id` int(255) NOT NULL,
  `pit_path` varchar(255) NOT NULL,
  `pit_pt_id` int(255) NOT NULL,
  `pit_status` int(3) NOT NULL DEFAULT 1,
  `pit_param1` varchar(255) DEFAULT NULL,
  `pit_param2` varchar(255) DEFAULT NULL,
  `pit_param3` varchar(255) DEFAULT NULL,
  `pit_param4` varchar(255) DEFAULT NULL,
  `pit_param5` varchar(255) DEFAULT NULL,
  `pit_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `pit_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_image_tbl`
--

INSERT INTO `product_image_tbl` (`pit_id`, `pit_path`, `pit_pt_id`, `pit_status`, `pit_param1`, `pit_param2`, `pit_param3`, `pit_param4`, `pit_param5`, `pit_created_datetime`, `pit_updated_datetime`) VALUES
(1, 'http://www.lifestylelabels.com/media/catalog/product/cache/1/small_image/210x/9df78eab33525d08d6e5fb8d27136e95/s/t/steven-by-steve-madden-pryme-pump.jpg', 1, 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:50:08', '2020-03-15 21:50:08'),
(2, 'http://www.lifestylelabels.com/media/catalog/product/cache/1/small_image/210x/9df78eab33525d08d6e5fb8d27136e95/n/i/nine-west-women-s-lucero-pump.jpg', 2, 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:50:08', '2020-03-15 21:50:08'),
(3, 'http://www.lifestylelabels.com/media/catalog/product/e/c/ecco-womens-golf-flexor-golf-shoe.jpg', 3, 1, NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:50:18', '2020-03-15 21:50:18');

-- --------------------------------------------------------

--
-- Table structure for table `product_tbl`
--

CREATE TABLE `product_tbl` (
  `pt_id` int(255) NOT NULL,
  `pt_url` varchar(255) NOT NULL,
  `pt_title` varchar(255) NOT NULL,
  `pt_ct_id` int(255) NOT NULL,
  `pt_price` float NOT NULL,
  `pt_msrp` int(255) NOT NULL,
  `pt_status` int(3) NOT NULL DEFAULT 1 COMMENT 'Available Status - 1 True / 0 False',
  `pt_mt_id` int(255) NOT NULL,
  `pt_description` longtext NOT NULL,
  `pt_param1` varchar(255) DEFAULT NULL,
  `pt_param2` varchar(255) DEFAULT NULL,
  `pt_param3` varchar(255) DEFAULT NULL,
  `pt_param4` varchar(255) DEFAULT NULL,
  `pt_param5` varchar(255) DEFAULT NULL,
  `pt_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `pt_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_tbl`
--

INSERT INTO `product_tbl` (`pt_id`, `pt_url`, `pt_title`, `pt_ct_id`, `pt_price`, `pt_msrp`, `pt_status`, `pt_mt_id`, `pt_description`, `pt_param1`, `pt_param2`, `pt_param3`, `pt_param4`, `pt_param5`, `pt_created_datetime`, `pt_updated_datetime`) VALUES
(1, 'http://www.lifestylelabels.com/steven-by-steve-madden-pryme-pump.html', 'elegant red pump', 2, 299, 0, 1, 1, 'Nothing will turn his head faster than you wearing the sexy Pryme pump from Steven by Steve Madden. This daring pump has a pretty patent leather upper with light shirring, a double stitch detail surrounding the collar, and a vampy almond shaped toe.', NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:48:48', '2020-03-15 21:48:48'),
(2, 'http://www.lifestylelabels.com/nine-west-women-s-lucero-pump.html', 'glittering red pump', 2, 289.99, 0, 1, 1, 'The Lucero pump from Nine West may just leave him at a loss for words. This flirty pump has a leather upper, a pretty almond-shaped toe with a slight V-cut vamp, leather linings, and a cushioned insole for long-wearing comfort.', NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:48:48', '2020-03-15 21:48:48'),
(3, 'http://www.lifestylelabels.com/womens-golf-shoes.html', 'womens golf shoes', 5, 159, 0, 0, 2, 'Sporting with style, this is a durable and super-comfortable golf shoe built for performance.', NULL, NULL, NULL, NULL, NULL, '2020-03-15 21:49:38', '2020-03-15 21:49:38');

-- --------------------------------------------------------

--
-- Table structure for table `role_tbl`
--

CREATE TABLE `role_tbl` (
  `rt_id` int(255) NOT NULL,
  `rt_ut_id` varchar(255) DEFAULT NULL,
  `rt_name` varchar(255) DEFAULT NULL,
  `rt_description` varchar(255) DEFAULT NULL,
  `rt_param1` varchar(255) DEFAULT NULL,
  `rt_param2` varchar(255) DEFAULT NULL,
  `rt_param3` varchar(255) DEFAULT NULL,
  `rt_param4` varchar(255) DEFAULT NULL,
  `rt_param5` varchar(255) DEFAULT NULL,
  `rt_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `rt_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `rt_status` int(10) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role_tbl`
--

INSERT INTO `role_tbl` (`rt_id`, `rt_ut_id`, `rt_name`, `rt_description`, `rt_param1`, `rt_param2`, `rt_param3`, `rt_param4`, `rt_param5`, `rt_created_datetime`, `rt_updated_datetime`, `rt_status`) VALUES
(2, '2', 'USER', 'ALLOW USER ACCESS', NULL, NULL, NULL, NULL, NULL, '2020-02-12 20:49:14', '2020-02-12 20:49:14', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_tbl`
--

CREATE TABLE `user_tbl` (
  `ut_id` int(255) NOT NULL,
  `ut_email` varchar(255) DEFAULT NULL,
  `ut_password` varchar(255) DEFAULT NULL,
  `ut_param1` varchar(255) DEFAULT NULL,
  `ut_param2` varchar(255) DEFAULT NULL,
  `ut_param3` varchar(255) DEFAULT NULL,
  `ut_param4` varchar(255) DEFAULT NULL,
  `ut_param5` varchar(255) DEFAULT NULL,
  `ut_created_datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `ut_updated_datetime` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `ut_status` int(10) NOT NULL DEFAULT 1 COMMENT 'Active(1) / Inactive (0)'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_tbl`
--

INSERT INTO `user_tbl` (`ut_id`, `ut_email`, `ut_password`, `ut_param1`, `ut_param2`, `ut_param3`, `ut_param4`, `ut_param5`, `ut_created_datetime`, `ut_updated_datetime`, `ut_status`) VALUES
(2, 'user001@test.com', '$2a$10$fOMOmB6euSD5DkwZZwQVFusSuwMHw87DHSf3TTr7MywgGGNqCdSmG', '1', NULL, NULL, NULL, NULL, '2020-02-12 20:49:14', '2020-03-15 21:55:29', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category_tbl`
--
ALTER TABLE `category_tbl`
  ADD PRIMARY KEY (`ct_id`);

--
-- Indexes for table `jwt_tbl`
--
ALTER TABLE `jwt_tbl`
  ADD PRIMARY KEY (`jt_id`);

--
-- Indexes for table `merchant_tbl`
--
ALTER TABLE `merchant_tbl`
  ADD PRIMARY KEY (`mt_id`);

--
-- Indexes for table `product_image_tbl`
--
ALTER TABLE `product_image_tbl`
  ADD PRIMARY KEY (`pit_id`);

--
-- Indexes for table `product_tbl`
--
ALTER TABLE `product_tbl`
  ADD PRIMARY KEY (`pt_id`);

--
-- Indexes for table `role_tbl`
--
ALTER TABLE `role_tbl`
  ADD PRIMARY KEY (`rt_id`);

--
-- Indexes for table `user_tbl`
--
ALTER TABLE `user_tbl`
  ADD PRIMARY KEY (`ut_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category_tbl`
--
ALTER TABLE `category_tbl`
  MODIFY `ct_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `jwt_tbl`
--
ALTER TABLE `jwt_tbl`
  MODIFY `jt_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `merchant_tbl`
--
ALTER TABLE `merchant_tbl`
  MODIFY `mt_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `product_image_tbl`
--
ALTER TABLE `product_image_tbl`
  MODIFY `pit_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `product_tbl`
--
ALTER TABLE `product_tbl`
  MODIFY `pt_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `role_tbl`
--
ALTER TABLE `role_tbl`
  MODIFY `rt_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user_tbl`
--
ALTER TABLE `user_tbl`
  MODIFY `ut_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
