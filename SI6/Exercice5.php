<!DOCTYPE html>


<html>
    <head>
		<title> Carte d'identité Ping </title>
		<meta charset="utf-8">
	</head>
		
		<body>
<h1> Calcul de TVA </h1>
		
		
<?php 

	$prixHT = 120;
	$tva = 20 ;
	$prixTTC =$prixHT * (1+($tva)/100);
?>	
	
<ul>	
	<li> Prix hors taxes = <?php echo $prixHT; ?> </li>
	
</ul>	
<ul>		
	<li> Taux de TVA =  <?php echo $tva; ?> </li>
</ul>

<ul>
	<li> Prix TTC = <?php echo $prixTTC; ?> </li>
</ul>


		</body>
</html>