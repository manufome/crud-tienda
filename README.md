Inserts

```

INSERT INTO categorias_productos (nombre_categoria) 
VALUES 
('Arepas'),
('Caldos, Sopas y Bases'),
('Carnes Frias'),
('Cereales'), 
('Condimentos'),
('Dulcería'),
('Enlatados y envasados'),
('Galletería'),
('Granos, Azúcar y Panela'),
('Harinas y Pre-mezclas'), 
('Huevos'),
('Margarinas y Aceites'),
('Panaderia y Reposteria'),
('Pasabocas y Snacks'),
('Pasta'),
('Platos preparados'),
('Postres listos'),
('Salsas y Aderezos'),
('Verduras y Frutas');


-- Arepas
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('AREPA DE YUCA MASMAÍ 4 UND - 240 G', 4190, 1),
('AREPA EXTRAQUESO MASMAÍ 4 UND - 720 G', 5350, 1), 
('AREPA DE CHÓCOLO 5 UND MASMAÍ 400 GRS', 2990, 1),
('AREPA CON QUESO MOZZARELLA MASMAI 400 GRS', 4290, 1),
('AREPA DE MAÍZ BLANCO CON AVENA Y CHÍA MASMAÍ 5', 3990, 1);

-- Caldos, Sopas y Bases
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES
('CALDO DE COSTILLA MAGGI 10 UND 80 G', 4290, 2),
('CALDO DE GALLINA MAGGI 10 UND 88 G', 4290, 2), 
('CALDO DE GALLINA SPECIARIA 8 UND - 84 G', 1990, 2),
('CREMA DE CHÓCLO VELSUP 70 G', 1390, 2), 
('CALDO DE COSTILLA SPECIARIA 84 G 8 CUBOS', 1990, 2);

-- Carnes Frias  
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES
('SALCHICHA RANCHERA X 131 G X 4 UD', 5290, 3), 
('JAMON PIETRAN ESTANDAR 167 GRS', 6790, 3),  
('COMBO TRADICIONAL VIANDE 900 GR', 9890, 3),
('MORCILLA VIANDÉ 500 GRS', 6700, 3),
('JAMÓN DE POLLO PREMIUM BRAKEL 250 G', 5990, 3);

-- Cereales
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('CHOCO KRISPIS KELLOGG¿S 200 G', 6450, 4),
('ZUCARITAS KELLOGG¿S 200 G', 6590, 4),
('CEREAL FLIPS CHOCOLATE 400 G', 12790, 4), 
('FROOT LOOPS KELLOGG°S 160 G', 6190, 4),
('CEREAL ORIGINAL FITNESS 230 G', 8990, 4);

-- Condimentos  
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES 
('SAL REFISAL 1000 G', 2190, 5),  
('MEZCLA CONDIMENTOS SAZONAREY 35 G', 1090, 5), 
('PASTA DE PIMENTÓN DELIKA 110 G', 1990, 5),
('MEZCLA PARA ADOBAR DELIKA 110 G', 1990, 5),
('PASTA DE AJO DELIKA 110 G', 1990, 5);

-- Dulcería
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES
('TIRUDITO SUPERCOCO (8g) 15U', 3690, 6), 
('GALLETA WAFER COCOSETTE 50 G', 1590, 6),
('BOM BOM BUM FRESA PQ 6', 2450, 6),
('CHOCOLATE KITKAT CHUNKY 40 GRS', 2690, 6), 
('HALLS LIMON Y MIEL 9S', 1490, 6);

-- Enlatados y envasados 
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('TOMATES ENTEROS PELADOS DELIZIARE 400 G', 4490, 7),
('FRÍJOLES CON TOCINO COOLTIVO 300 GRS', 4990, 7),  
('ATÚN RALLADO EL NAVÍO 170 G', 3250, 7),
('ENSALADA CAMPESINA COOLTIVO 300 G', 3690, 7),
('SALMÓN EN ACEITE CARLO FORTE 170 G', 10490, 7);

-- Galletería 
INSERT INTO productos (nombre_producto, precio_venta, id_categoria) 
VALUES
('ALLETA 2 TACOS DUCALES NOEL 241 GRS', 4990, 8),  
('GALLETAS VAINILLA 18UN WAFER NOEL 432 GR', 7290, 8),
('GALLETAS SANDWICH QUESO DUX', 5890, 8), 
('GALLETA INTEGRAL CLUB SOCIAL 6 UND', 3990, 8),
('GALLETA HAPPY BLACK 12 PQ 408G', 6890, 8);

-- Granos, Azúcar y Panela
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES
('PANELA PULVERIZADA EL REFUGIO 500 G', 3290, 9),  
('ARROZ DIANA 1000 G', 4250, 9),  
('ARROZ INTEGRAL DIANA 1.000 G', 3990, 9),
('AZÚCAR BLANCA 1000 GRS', 4790, 9), 
('ENDULZANTE CON STEVIA NATRI 180 G', 6150, 9);
 
-- Harinas y Pre-mezclas
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES 
('HARINA DE TRIGO CON POLVO PARA HORNEAR', 2190, 10),
('GRANO ENTERO DE QUINUA', 4490, 10),
('PREMEZCLA PARA PANCAKES QUICKSY 300 G', 3150, 10),  
('HARINA DE TRIGO QUICKSY 500 G', 1890, 10),
('PREMEZCLA DE GALLETAS CON CHIPS DE CHOCOLATE QU', 4690, 10);

-- Huevos
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('HUEVOS DE CODORNIZ SOL NACIENTE 24 UND', 5390, 11), 
('HUEVO TIPO AA SOL NACIENTE 30 UND', 16990, 11),
('HUEVO TIPO AA SOL NACIENTE 12 UND', 7650, 11), 
('HUEVO TIPO A SOL NACIENTE 30 UND', 14990, 11);

-- Margarinas y Aceites
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES
('ESPARCIBLE MULTIUSOS RAMA 250 G', 4690, 12),  
('ACEITE GOTA DE ORO 3000 ML', 29990, 12),
('ACEITE DE GIRASOL DON OLIO 2000ML', 26990, 12),  
('ACEITE DE CANOLA DON OLIO 2000 ML', 30950, 12),
('ESPARCIBLE DON OLIO LIGHT 250 G', 4790, 12);

-- Panaderia y Reposteria
INSERT INTO productos (nombre_producto, precio_venta, id_categoria) 
VALUES  
('ACHIRAS DEL HUILA 120 G', 5190, 13),  
('ROSCON RESOBADO BOCADILLO JOSMAR 150 G', 3990, 13),  
('GANSITO RAMO 6 UNIDADES 222 G', 8490, 13),
('PINGÜINOS MARINELA 4 UND - 160 G', 6100, 13),  
('BROWNIE CON AREQUIPE HORNEADITOS 80 GRS', 1890, 13);

-- Pasabocas y Snacks
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES
('CHICHARRÓN CARN AMERI LA VICTORIA 100 GR', 7690, 14),  
('CRISPETA CARAMELO CHEETOS 72 G', 2190, 14),
('DE TODITO BBQ 250GR', 7690, 14), 
('LONJAS DE ALMENDRA NUTHOS 100 GR', 8450, 14),
('MEZCLA NUECES PREMIUM NUTHOS', 7590, 14);

-- Pasta
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES  
('CONCHAS DORIA 250 G', 2150, 15),  
('CABELLO DE ÁNGEL DORIA 250 G', 2150, 15),
('SPAGUETTI CAPRÍSSIMA 250 GRS', 1350, 15),  
('CONCHA CAPRÍSSIMA 250 GRS', 1350, 15),  
('CABELLO DE ÁNGEL CAPRÍSSIMA 250 GRS', 1350, 15);

-- Platos preparados
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('TAMAL TOLIMENSE 2 UND 400 G', 8490, 16),
('PIZZA DE JAMÓN Y QUESO / HAWAIANA BACKEREI 130 ', 4100, 16),
('RAMEN NISSIN SABOR CARNE 85 G', 2490, 16), 
('RAMEN NISSIN SABOR POLLO 85 G', 2490, 16);

-- Postres listos  
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES
('FLAN DE LECHE CON CARAMELO LATTI 150 G', 3750, 17),
('POSTRE DE GELATINA CON LECHE KEDELI 180 G', 3650, 17),  
('ARROZ CON LECHE TRADICIÓN 1915 120 G', 2290, 17),
('LECHE ASADA TRADICIÓN 1915 120 G', 3390, 17);

-- Salsas y Aderezos
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)  
VALUES  
('SALSA MAYOMOSTAZA CON ESPECIAS SHOWY 200 GR', 3890, 18), 
('VINAGRETA RANCH ZEV X 240 GR', 3890, 18),
('VINAGRETA SURTIDA ZEV X 240GR', 3890, 18),  
('MAYONESA FRUCO 480 G', 7750, 18),
('SALSA TÁRTARA ZEV 200GR', 2190, 18);

-- Verduras y Frutas  
INSERT INTO productos (nombre_producto, precio_venta, id_categoria)
VALUES  
('PERA VERDE IMPORTADA 1000 G', 9990, 19),  
('MANZANA ROYAL GALA 1000 GRS', 10590, 19),
('PLÁTANO HARTÓN 1000 G', 5790, 19),  
('AJO MALLA 3 UNIDADES - 100 G', 1450, 19),  
('PAPA CAPIRA 2000 GRS', 5690, 19);

-- Inserts para la tabla roles
INSERT INTO roles (nombre_rol)
VALUES
('admin'),
('cliente');

-- Inserts para la tabla de usuarios
INSERT INTO usuarios (nombre_usuario, contrasena, id_rol)
VALUES
('Manuel', 'passwordA', 1),
('clienteB', 'passwordB', 2),
('clienteC', 'passwordC', 2);

-- Inserts para la tabla de estado_orden
INSERT INTO estado_orden (nombre_estado_orden)
VALUES
('en proceso'),
('enviado'),
('entregado'),
('cancelado');

-- Inserts para la tabla de órdenes
INSERT INTO ordenes (id_orden, id_estado_orden, id_usuario, fecha_orden) 
VALUES
(1, 2, 2, '2023-04-01'),
(2, 1, 1, '2023-04-02'),
(3, 4, 3, '2023-04-03');

-- Inserts para la tabla de ítems de órdenes
INSERT INTO orden_items (id_orden, id_producto, cantidad, precio_unitario)
VALUES
(1, 1, 10, 50.00),
(1, 2, 5, 30.00),
(2, 3, 8, 25.00),
(3, 1, 12, 40.00),
(3, 2, 6, 35.00);


```
