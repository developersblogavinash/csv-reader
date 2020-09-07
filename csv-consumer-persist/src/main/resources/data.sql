CREATE TABLE gender (
  id UUID PRIMARY KEY,
  label TEXT
);

CREATE TABLE country (
  id UUID PRIMARY KEY,
  code TEXT UNIQUE
);