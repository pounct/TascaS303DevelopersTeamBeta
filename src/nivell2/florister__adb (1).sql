-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 21 août 2023 à 08:36
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

--
-- Déchargement des données de la table `arbre`
--

INSERT INTO `arbre` (`id`, `alcada`) VALUES
(6, 120),
(8, 120),
(9, 120),
(11, 120),
(13, 120),
(16, 120),
(19, 90);

-- --------------------------------------------------------

--
-- Structure de la table `compra`
--

CREATE TABLE `compra` (
  `id` int(10) UNSIGNED NOT NULL,
  `dateC` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `compra`
--

INSERT INTO `compra` (`id`, `dateC`) VALUES
(2, '2022-09-04'),
(3, '2022-10-12'),
(4, '2022-09-04'),
(5, '2022-09-04'),
(6, '2022-09-04'),
(7, '2022-09-04'),
(8, '2022-09-24'),
(9, '2022-10-24');

-- --------------------------------------------------------

--
-- Structure de la table `decoracio`
--

CREATE TABLE `decoracio` (
  `id` int(10) UNSIGNED NOT NULL,
  `material` enum('fusta','plàstic') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `decoracio`
--

INSERT INTO `decoracio` (`id`, `material`) VALUES
(15, 'fusta'),
(18, 'fusta'),
(21, 'plàstic');

-- --------------------------------------------------------

--
-- Structure de la table `flor`
--

CREATE TABLE `flor` (
  `id` int(10) UNSIGNED NOT NULL,
  `color` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `flor`
--

INSERT INTO `flor` (`id`, `color`) VALUES
(10, 'rosa'),
(12, 'rosa'),
(14, 'rosa'),
(17, 'rosa'),
(20, 'rojo');

-- --------------------------------------------------------

--
-- Structure de la table `floristeria`
--

CREATE TABLE `floristeria` (
  `id` int(10) UNSIGNED NOT NULL,
  `nom` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `floristeria`
--

INSERT INTO `floristeria` (`id`, `nom`) VALUES
(1, 'floristeria 1');

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

--
-- Déchargement des données de la table `liniacompra`
--

INSERT INTO `liniacompra` (`id`, `preu`, `producteId`, `floresteriaId`, `compraId`) VALUES
(4, 25, 6, 1, 2),
(5, 25, 8, 1, 4),
(6, 25, 9, 1, 5),
(7, 25, 11, 1, 6),
(8, 15, 12, 1, 6),
(9, 25, 13, 1, 7),
(10, 15, 14, 1, 7),
(11, 15, 14, 1, 7),
(12, 25, 16, 1, 8),
(13, 15, 17, 1, 8),
(14, 35, 17, 1, 8),
(15, 21, 19, 1, 9),
(16, 12, 20, 1, 9),
(17, 28, 21, 1, 9);

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

--
-- Déchargement des données de la table `producte`
--

INSERT INTO `producte` (`id`, `designacio`) VALUES
(6, 'prod Arbre1'),
(7, 'prod Arbre1'),
(8, 'prod Arbre1'),
(9, 'prod Arbre1'),
(10, 'prodFlor1'),
(11, 'prod Arbre1'),
(12, 'prodFlor1'),
(13, 'prod Arbre1'),
(14, 'prodFlor1'),
(15, 'prodDecoracio1'),
(16, 'prod Arbre2'),
(17, 'prodFlor2'),
(18, 'prodDecoracio2'),
(19, 'prod Arbre3'),
(20, 'prodFlor3'),
(21, 'prodDecoracio3');

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
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `floristeria`
--
ALTER TABLE `floristeria`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `liniacompra`
--
ALTER TABLE `liniacompra`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT pour la table `liniavenda`
--
ALTER TABLE `liniavenda`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `producte`
--
ALTER TABLE `producte`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

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
