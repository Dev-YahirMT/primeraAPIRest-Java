CREATE TABLE `usuarios` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`login` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_unicode_ci',
	`clave` VARCHAR(400) NOT NULL COLLATE 'utf8mb4_unicode_ci',

	PRIMARY KEY (`id`) USING BTREE
);