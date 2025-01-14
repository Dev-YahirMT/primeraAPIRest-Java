CREATE TABLE `medicos` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`calle` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`ciudad` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`complemento` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`distrito` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`numero` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`documento` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`email` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`especialidad` ENUM('CARDIOLOGIA','GINECOLOGIA','ORTOPEDIA','PEDIATRIA') NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',
	`nombre` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_unicode_ci',

	PRIMARY KEY (`id`) USING BTREE
);