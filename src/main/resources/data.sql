CREATE TABLE SEARCH_HARVESTS  (
	id bigint PRIMARY KEY auto_increment,
	harvest varchar(200),
	quantity varchar(200),
	dtharvest varchar(200),
	dtexpiration varchar(200),
	exchangeitem varchar(200),
	exchangetimes varchar(200)
);


INSERT INTO SEARCH_HARVESTS (harvest, quantity, dtharvest, dtexpiration, exchangeitem, exchangetimes) VALUES 
	('Alecrim', '5 galhos', '18/11/2021', '10/12/2021', 'Manjericão', '20/11/2021-10:00');

INSERT INTO SEARCH_HARVESTS (harvest, quantity, dtharvest, dtexpiration, exchangeitem, exchangetimes) VALUES 
	('Alface crespa', '5', '19/11/2021', '23/11/2021', 'Cebolinha', '19/11/2021-18:30');

INSERT INTO SEARCH_HARVESTS (harvest, quantity, dtharvest, dtexpiration, exchangeitem, exchangetimes) VALUES 
	('Pimenta', '10', '18/11/2021', '15/12/2021', 'Hortelã', '23/11/2021-12:15');
