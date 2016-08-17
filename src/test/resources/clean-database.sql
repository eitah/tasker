use tasker_test;
truncate table tasks;
INSERT INTO `tasker_test`.`tasks` (`name`, `category`, `due`, `is_complete`, `created_at`)
VALUES ('Get Milk', 'Home', '2016-08-11', 1, '2016-08-10');
INSERT INTO `tasker_test`.`tasks` (`name`, `category`, `due`, `is_complete`, `created_at`)
VALUES ('Code', 'Work', '2016-08-11', 0, '2016-08-10');
INSERT INTO `tasker_test`.`tasks` (`name`, `category`, `due`, `is_complete`, `created_at`)
VALUES ('Eat', 'Life', '2016-08-11', 0, '2016-08-10');
INSERT INTO `tasker_test`.`tasks` (`name`, `category`, `due`, `is_complete`, `created_at`)
VALUES ('Workout', 'Life', '2016-08-11', 1, '2016-08-10');