-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 19 août 2023 à 23:01
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `floristeríadb`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbre`
--

CREATE TABLE `arbre` (
  `id` int(10) UNSIGNED NOT NULL,
  `alcada` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `compra`
--

CREATE TABLE `compra` (
  `id` int(10) UNSIGNED NOT NULL,
  `dateC` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `decoracio`
--

CREATE TABLE `decoracio` (
  `id` int(10) UNSIGNED NOT NULL,
  `material` enum('fusta','plàstic') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `flor`
--

CREATE TABLE `flor` (
  `id` int(10) UNSIGNED NOT NULL,
  `color` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `floristeria`
--

CREATE TABLE `floristeria` (
  `id` int(10) UNSIGNED NOT NULL,
  `nom` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `liniacompra`
--

CREATE TABLE `liniacompra` (
  `id` int(10) UNSIGNED NOT NULL,
  `preu` double NOT NULL,
  `producteId` int(10) UNSIGNED NOT NULL,
  `floresteriaId` int(10) UNSIGNED NOT NULL,
  `compraId` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `liniavenda`
--

CREATE TABLE `liniavenda` (
  `id` int(10) UNSIGNED NOT NULL,
  `preu` double NOT NULL,
  `producteId` int(10) UNSIGNED NOT NULL,
  `vendaId` int(10) UNSIGNED NOT NULL,
  `floresteriaId` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `producte`
--

CREATE TABLE `producte` (
  `id` int(10) UNSIGNED NOT NULL,
  `designacio` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `venda`
--

CREATE TABLE `venda` (
  `id` int(10) UNSIGNED NOT NULL,
  `dateV` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ind` (`id`);

--
-- Index pour la table `decoracio`
--
ALTER TABLE `decoracio`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `flor`
--
ALTER TABLE `flor`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `floristeria`
--
ALTER TABLE `floristeria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ind` (`id`);

--
-- Index pour la table `liniacompra`
--
ALTER TABLE `liniacompra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `compraId` (`compraId`),
  ADD KEY `producteId` (`producteId`),
  ADD KEY `floresteriaId` (`floresteriaId`);

--
-- Index pour la table `liniavenda`
--
ALTER TABLE `liniavenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `vendaId` (`vendaId`),
  ADD KEY `producteId` (`producteId`),
  ADD KEY `floresteriaId` (`floresteriaId`);

--
-- Index pour la table `producte`
--
ALTER TABLE `producte`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ind` (`id`);

--
-- Index pour la table `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ind` (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `floristeria`
--
ALTER TABLE `floristeria`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `liniacompra`
--
ALTER TABLE `liniacompra`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `liniavenda`
--
ALTER TABLE `liniavenda`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `producte`
--
ALTER TABLE `producte`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `venda`
--
ALTER TABLE `venda`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD CONSTRAINT `arbre_ibfk_1` FOREIGN KEY (`id`) REFERENCES `producte` (`id`);

--
-- Contraintes pour la table `decoracio`
--
ALTER TABLE `decoracio`
  ADD CONSTRAINT `decoracio_ibfk_1` FOREIGN KEY (`id`) REFERENCES `producte` (`id`);

--
-- Contraintes pour la table `flor`
--
ALTER TABLE `flor`
  ADD CONSTRAINT `flor_ibfk_1` FOREIGN KEY (`id`) REFERENCES `producte` (`id`);

--
-- Contraintes pour la table `liniacompra`
--
ALTER TABLE `liniacompra`
  ADD CONSTRAINT `liniacompra_ibfk_1` FOREIGN KEY (`compraId`) REFERENCES `compra` (`id`),
  ADD CONSTRAINT `liniacompra_ibfk_2` FOREIGN KEY (`producteId`) REFERENCES `producte` (`id`),
  ADD CONSTRAINT `liniacompra_ibfk_3` FOREIGN KEY (`floresteriaId`) REFERENCES `floristeria` (`id`);

--
-- Contraintes pour la table `liniavenda`
--
ALTER TABLE `liniavenda`
  ADD CONSTRAINT `liniavenda_ibfk_1` FOREIGN KEY (`vendaId`) REFERENCES `venda` (`id`),
  ADD CONSTRAINT `liniavenda_ibfk_2` FOREIGN KEY (`producteId`) REFERENCES `producte` (`id`),
  ADD CONSTRAINT `liniavenda_ibfk_3` FOREIGN KEY (`floresteriaId`) REFERENCES `floristeria` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
