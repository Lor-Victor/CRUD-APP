-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 01:51 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `taskmanager`
--

-- --------------------------------------------------------

--
-- Table structure for table `goals`
--

CREATE TABLE `goals` (
  `goal_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `title` text NOT NULL,
  `details` text DEFAULT NULL,
  `target_date` date NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `goals`
--

INSERT INTO `goals` (`goal_id`, `user_id`, `title`, `details`, `target_date`, `status`) VALUES
(1, 1, 'Learn new language', NULL, '2025-04-10', 'pending'),
(2, 1, 'Start a business', 'Research potential business ideas and create a business plan', '2025-06-30', 'pending'),
(3, 1, 'Read 6 books in a year', 'Commit to reading one book per month', '2025-12-31', 'in-progress'),
(4, 1, 'Travel to Europe', 'Explore the countries of Europe', '2026-08-15', 'pending'),
(5, 1, 'Save $10,000 for emergency fund', 'Set aside a portion of income each month and track expenses to reach savings goal', '2026-12-31', 'in-progress'),
(6, 1, 'Complete a marathon', 'Follow a training plan and participate in a local marathon event', '2026-10-15', 'pending'),
(7, 1, 'Learn to play the guitar', 'Take guitar lessons and practice regularly to improve skills', '2025-11-30', 'pending'),
(8, 1, 'Volunteer at a homeless shelter', 'Sign up for volunteer shifts and support those in need', '2025-07-31', 'pending'),
(9, 1, 'Achieve a promotion at work', 'Set career development goals and actively pursue opportunities for advancement', '2026-05-01', 'pending'),
(10, 1, 'Learn to cook good food', 'Take cooking classes and learn new recipes', '2026-03-15', 'in-progress');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
