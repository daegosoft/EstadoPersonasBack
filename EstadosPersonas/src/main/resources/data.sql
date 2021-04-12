INSERT INTO estado(nombre, usuario_creacion, fecha_creacion)VALUES('Activo', 0, CURRENT_TIMESTAMP());
INSERT INTO tipo_identificacion(nombre, usuario_creacion, fecha_creacion)VALUES('Cedula Ciudadania', 0, CURRENT_TIMESTAMP());
INSERT INTO Persona(nombre, apellido, fecha_nacimiento, identificacion, username, password)VALUES('Admin', 'Completa', CURRENT_TIMESTAMP(), 1, 'admin', 'admin');
INSERT INTO Persona(nombre, apellido, fecha_nacimiento, identificacion, username, password)VALUES('Admin2', 'Completa2', CURRENT_TIMESTAMP(), 1, 'admin2', 'admin2');