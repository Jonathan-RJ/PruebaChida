CREATE TABLE VEHICULO(
NUMERO_DE_SERIE NUMBER PRIMARY KEY,   
MODELO NUMBER,-- NUMBER ES COMO DOUBLE HASTA QUE LE PONGAS LA CANTIDAD DE DECIMALES QUE LLEVA 
FECHA_DE_ENSAMBLE DATE,
COSTO NUMBER(6,2) -- 1234.00
);

SELECT*FROM VEHICULO;
INSERT INTO VEHICULO
VALUES(1,2022,TO_DATE('04-06-2021','DD-MM-YYYY'),2302.50);
INSERT INTO VEHICULO
VALUES(2,2022,TO_DATE('04-08-2021','DD-MM-YYYY'),4300.50);
INSERT INTO VEHICULO
VALUES(3, 2022,TO_DATE('04-08-2021','DD-MM-YYYY'),3200.50);
INSERT INTO VEHICULO
VALUES(4, 2022,TO_DATE('04-01-2021','DD-MM-YYYY'),4370.50);
INSERT INTO VEHICULO
VALUES(5, 2022,TO_DATE('04-01-2021','DD-MM-YYYY'),4570.50);


CREATE TABLE ASESOR(
ASESOR_ID NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
INE NUMBER-- NUMBER ES COMO DOUBLE HASTA QUE LE PONGAS LA CANTIDAD DE DECIMALES QUE LLEVA 
);
SELECT*FROM ASESOR;
INSERT INTO ASESOR
VALUES(10,'PEDRO JUAREZ',2435423);
INSERT INTO ASESOR
VALUES(20,'JUAN ESCUTIA',242624);
INSERT INTO ASESOR
VALUES(30,'MIGUEL HIDALGO',5276525);
INSERT INTO ASESOR
VALUES(40,'MARIA SANCHEZ',2654265);
INSERT INTO ASESOR
VALUES(50, 'DANIEL TORIZ',5252765);

CREATE TABLE CLIENTES(
CLIENTE_ID NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
INE NUMBER,
FECHA_DE_NAC DATE
);

SELECT*FROM CLIENTES;
INSERT INTO CLIENTES
VALUES(341,'IRMA VIVEROS', 524254,TO_DATE('04-05-1995','DD-MM-YYYY'));
INSERT INTO CLIENTES
VALUES(441,'ALONDRA AGUILAR', 444254,TO_DATE('04-04-1998','DD-MM-YYYY'));
INSERT INTO CLIENTES
VALUES(331,'RAFA LOPEZ', 524984,TO_DATE('22-05-1995','DD-MM-YYYY'));
INSERT INTO CLIENTES
VALUES(141,'JESUS VIVEROS', 5256554,TO_DATE('11-05-1988','DD-MM-YYYY'));
INSERT INTO CLIENTES
VALUES(879,'REYNALDO HERRERA', 555254,TO_DATE('22-05-1993','DD-MM-YYYY'));

CREATE TABLE AGENCIA(
ID_AGENCIA NUMBER,
DIRECCION NVARCHAR2,
CODIGO_POSTAL NUMBER
);

CREATE TABLE FINANCIERA(
FINANCIERA_ID NUMBER,
NOMBRE_FINANC NVARCHAR2,
DIRECCION NAVARCHAR2
);
