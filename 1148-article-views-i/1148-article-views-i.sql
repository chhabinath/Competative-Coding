-- We are selecting unique author IDs and renaming them as "id"
SELECT DISTINCT author_id AS id 
-- We are looking at a table called "Views"
FROM Views 
-- We are only interested in rows where the author ID matches the viewer ID
WHERE author_id = viewer_id 
-- We want the results to be sorted in ascending order based on the author IDs
ORDER BY id ASC;