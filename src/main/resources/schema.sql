CREATE TABLE IF NOT EXISTS content(
    id SERIAL PRIMARY KEY,
    title varchar(255) NOT NULL,
    description text,
    status varchar(20) NOT NULL,
    content_type varchar(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url varchar(255)
);

-- INSERT INTO content(title, desc, status, content_type,  date_created)
-- VALUES ('My Spring Data blog post', 'A post about Spring Data', 'IDEA', 'ARTICLE', CURRENT_TIMESTAMP)