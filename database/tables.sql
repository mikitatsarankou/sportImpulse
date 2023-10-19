CREATE SCHEMA sport_impulse;

-- Create the "Sports" table using the custom sequence
CREATE TABLE Sports
(
    sport_id    SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(50) NOT NULL,
    description TEXT
);

-- Create the "Referees" table using the custom sequence
CREATE TABLE Referees
(
    referee_id  SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(100) NOT NULL,
    sport_id    INT          NOT NULL,
    description TEXT,
    FOREIGN KEY (sport_id) REFERENCES Sports (sport_id)
);

-- Create the "Tournaments" table using the custom sequence
CREATE TABLE Tournaments
(
    tournament_id SERIAL PRIMARY KEY NOT NULL,
    sport_id      INT          NOT NULL,
    name          VARCHAR(100) NOT NULL,
    start_date    DATE         NOT NULL,
    end_date      DATE         NOT NULL,
    description   TEXT,
    FOREIGN KEY (sport_id) REFERENCES Sports (sport_id)
);

-- Create the "Teams" table using the custom sequence
CREATE TABLE Teams
(
    team_id     SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(100) NOT NULL,
    sport_id    INT          NOT NULL,
    description TEXT,
    FOREIGN KEY (sport_id) REFERENCES Sports (sport_id)
);

-- Create the "Players" table using the custom sequence
CREATE TABLE Players
(
    player_id   SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(100) NOT NULL,
    sport_id    INT          NOT NULL,
    description TEXT,
    FOREIGN KEY (sport_id) REFERENCES Sports (sport_id)
);

-- Create the "TeamsPlayers" table using the custom sequence
CREATE TABLE TeamsPlayers
(
    team_id   INT NOT NULL,
    player_id INT NOT NULL,
    role      VARCHAR(20),
    PRIMARY KEY (team_id, player_id),
    FOREIGN KEY (team_id) REFERENCES Teams (team_id),
    FOREIGN KEY (player_id) REFERENCES Players (player_id)
);

-- Create the "Matches" table using the custom sequence
CREATE TABLE Matches
(
    match_id      SERIAL PRIMARY KEY NOT NULL,
    tournament_id INT         NOT NULL,
    match_date    TIMESTAMPTZ NOT NULL,
    team1_id      INT,
    team2_id      INT,
    referee_id    INT,
    location      VARCHAR(100),
    result        VARCHAR(20),
    score         VARCHAR(10),
    FOREIGN KEY (tournament_id) REFERENCES Tournaments (tournament_id),
    FOREIGN KEY (team1_id) REFERENCES Teams (team_id),
    FOREIGN KEY (team2_id) REFERENCES Teams (team_id),
    FOREIGN KEY (referee_id) REFERENCES Referees (referee_id)
);

-- Create the "TournamentRounds" table using the custom sequence
CREATE TABLE TournamentRounds
(
    round_id      SERIAL PRIMARY KEY NOT NULL,
    tournament_id INT         NOT NULL,
    name          VARCHAR(50) NOT NULL,
    start_date    DATE        NOT NULL,
    end_date      DATE        NOT NULL,
    FOREIGN KEY (tournament_id) REFERENCES Tournaments (tournament_id)
);

-- Create the "RoundMatches" table using the custom sequence
CREATE TABLE RoundMatches
(
    round_id INT NOT NULL,
    match_id INT NOT NULL,
    PRIMARY KEY (round_id, match_id),
    FOREIGN KEY (round_id) REFERENCES TournamentRounds (round_id),
    FOREIGN KEY (match_id) REFERENCES Matches (match_id)
);