-- Insert sample data into the "Sports" table
INSERT INTO Sports (name, description)
VALUES ('Soccer', 'Association football'),
       ('Basketball', 'A team sport played on a rectangular court'),
       ('Tennis', 'A racket sport played on a rectangular court');

-- Insert sample data into the "Referees" table
INSERT INTO Referees (name, sport_id, description)
VALUES ('John Smith', 1, 'Experienced soccer referee'),
       ('Alice Johnson', 2, 'Basketball officiating expert'),
       ('David Wilson', 3, 'Tennis umpire');

-- Insert sample data into the "Tournaments" table
INSERT INTO Tournaments (sport_id, name, start_date, end_date, description)
VALUES (1, 'World Cup 2023', '2023-06-01', '2023-07-15', 'International soccer tournament'),
       (2, 'NBA Finals 2023', '2023-06-01', '2023-06-30', 'Basketball championship'),
       (3, 'Wimbledon 2023', '2023-07-01', '2023-07-14', 'Grand Slam tennis event');

-- Insert sample data into the "Teams" table
INSERT INTO Teams (name, sport_id, description)
VALUES ('Team A', 1, 'Soccer team'),
       ('Lakers', 2, 'NBA team'),
       ('Team X', 1, 'Local soccer club');

-- Insert sample data into the "Players" table
INSERT INTO Players (name, sport_id, description)
VALUES ('Player 1', 1, 'Soccer player'),
       ('LeBron James', 2, 'NBA superstar'),
       ('Player 2', 1, 'Soccer player');

-- Insert sample data into the "TeamsPlayers" table
INSERT INTO TeamsPlayers (team_id, player_id)
VALUES (1, 1),
       (2, 2),
       (1, 3);

-- Insert sample data into the "Matches" table
INSERT INTO Matches (tournament_id, match_date, team1_id, team2_id, referee_id, location, result, score)
VALUES (1, '2023-06-01 18:00:00', 1, 3, 1, 'Stadium A', 'Team A Win', '2-1'),
       (2, '2023-06-10 20:00:00', 2, 1, 2, 'Arena B', 'Lakers Win', '110-105'),
       (3, '2023-07-02 15:00:00', 3, 1, 3, 'Wimbledon Courts', 'Player 2 Win', '6-3, 6-4');

-- Insert sample data into the "TournamentRounds" table
INSERT INTO TournamentRounds (name, start_date, end_date)
VALUES ('Group Stage', '2023-06-01', '2023-06-15'),
       ('Conference Finals', '2023-06-10', '2023-06-30'),
       ('Round of 16', '2023-07-01', '2023-07-07');

-- Insert sample data into the "RoundMatches" table
INSERT INTO RoundMatches (round_id, match_id)
VALUES (1, 1),
       (2, 2),
       (3, 3);
