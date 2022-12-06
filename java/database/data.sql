BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

INSERT INTO auction_type (auction_type_id, name) VALUES (1, 'Test Auction');

INSERT INTO auction (owner_id, title, description, starting_price, type_id, start_date, end_date)
VALUES (2,'Test Auction', 'This is a test auction', 0.01, 1, NOW(), '2022-12-09 11:30:00');
VALUES (3,'Test Auction #2', 'This is another test auction', 0.02, 1, NOW(), '2022-12-09 11:31:00');
VALUES (4,'Test Auction #3', 'This is yet, another test auction', 0.03, 1, NOW(), '2022-12-09 11:32:00');

INSERT INTO bid (auction_id, user_id, amount) VALUES (1, 1, 300.00);

COMMIT TRANSACTION;
