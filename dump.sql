-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 20 Mai 2014 à 21:25
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `tpjee`
--
CREATE DATABASE IF NOT EXISTS `tpjee` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `tpjee`;

-- --------------------------------------------------------

--
-- Structure de la table `recipes`
--

CREATE TABLE IF NOT EXISTS `recipes` (
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `expertise` int(11) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `nbpeople` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recipes`
--

INSERT INTO `recipes` (`title`, `description`, `expertise`, `duration`, `nbpeople`, `type`) VALUES
('Choucroute', 'Chou accompagné de sa charcuterie', 5, 3, 4, 'meal'),
('ravioli', 'pate avec de la viande', 3, 3, 2, 'meal'),
('Lazagne', 'Spécialitée Italienne', 5, 9, 5, 'Meal'),
('Salade Cesars', 'Salade accompagné de son empereur Romain ', 3, 5, 2, 'Dessert'),
('Cheese Burger', 'Burger fait dans la plus tradition de Macdo', 2, 2, 1, 'Meal'),
('Big Mag', 'Burger double niveau pour 2X plus de plaisirs', 2, 2, 1, 'Meal'),
('PommePote', 'Jus de compote mixe. facile a transporter et a boire', 3, 3, 1, 'Dessert'),
('Cote de Porc', 'Cote de porc faite au BBQ a manger en famille', 3, 5, 2, 'Meal');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL DEFAULT '0',
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`id`, `login`, `pwd`, `firstname`, `lastname`, `email`, `age`) VALUES
(1, 'clem', 'clem', 'clement', 'berard', 'keload@gmail.com', 20);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
