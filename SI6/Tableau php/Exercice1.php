<!DOCTYPE html>
<html lang="fr">
<head>
	<link rel="stylesheet" href="tableau.css" />
     <meta charset="utf-8">
     <meta name="author" content="Thomas">
    <title>Thomas</title>
</head>

    <body>



        <table>

<?php

$nom = array ('Durant', 'Morin', 'Wang', 'Barion','Fiu','Sortin','Fiotet','Riagean');
$prenom = array ('Pierre', 'Emilie', 'Théo', 'Jules' , 'Corentin' ,'Valentin', 'Marie' , 'Arthur');


for ($i = 0; $i < 8; $i++)
	
{
	
    echo '<td>' .$i. '<td>' .$nom[$i]. '<td>' .$prenom[$i]. '</tr>' ;
	
}

?>

        </table>
    </body>
</html>
