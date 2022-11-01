<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="nl">
<head>
<title></title>
</head>

<body>
    <h3>Inschrijfformulier: </h3>
    <form name="inschrijfformulier" action="verwerken.php" method="POST">
        <table border="1"> 
            <tr>
                <td>Achternaam: </td>
                <td><input type="text" name="achternaam" value=" " /></td>
            </tr>
            <tr>
                <td>Voornaam:</td>
                <td><input type="text" name="voornaam" value=" " /></td>
            </tr>
            <tr>
                <td>Adres:</td>
                <td><input type="text" name="adres" value=" " /></td>
            </tr>
            <tr>
                <td>Postcode:</td>
                <td><input type="text" name="postcode" value=" " /></td>
            </tr>
            <tr>
                <td>Plaats:</td>
                <td>
                    <select name="plaats">
                        <option>Den Haag</option>
                        <option>Delft</option>
                        <option>Zoetermeer</option>
                        <option>Leiden</option></td>
                    </select>
                </tr>
                <tr>
                    <td>E-mailadres:</td>
                    <td><input type="text" name="email" value=" " /></td>
                </tr>
        </table>
        <br/>
        Kies een opleiding:<br/>
        <input type="radio" name="opleiding" value="ICT" /> ICT<br />
        <input type="radio" name="opleiding" value="Engels"/> Engels<br />
        <input type="radio" name="opleiding" value="Techniek" /> Techniek<br />
        <input type="radio" name="opleiding" value="Nederlands"/> Nederlands<br />
        <input type="submit" value="Verstuur" />
    </form>
</body>
</html>

<?php
    echo '<b>Achternaam: </b>'.$_POST["achternaam"].'<br/>';
    echo '<b>Voornaam: </b>' .$_POST["voornaam"].'<br/>';
    echo '<b>Adres: </b>' .$_POST["adres"].'<br/>';
    echo '<b>Postcode: </b>' .$_POST["postcode"].'<br/>';
    echo '<b>Plaats: </b>' .$_POST["plaats"].'<br/>';
    echo '<b>E-mailadres: </b>' .$_POST["email"].'<br/>' ;
    echo '<b>Opleiding: </b>' .$_POST["opleiding"].'<br/>';

    if ($_POST['achternaam'] == ' '){
        echo "Vul achternaam in". '<br/>';
    }

    if ($_POST['voornaam'] == ' '){
        echo "Vul voornaam in". '<br/>';
    }

    if ($_POST['adres'] == ' '){
        echo "Vul adres in". '<br/>';
    }

    if ($_POST['postcode'] == ' '){
        echo "Vul postcode in".'<br/>';
    }

    if ($_POST['plaats'] == ' '){
        echo "Vul plaats in".'<br/>';
    }

    if ($_POST['email'] == ' '){
        echo "Vul e-mailadres in". '<br/>';
    }

    if ($_POST['opleiding'] == 'ICT'){
        echo "De opleiding zit vol". '<br/>';
    }

    else{
        echo "Je wordt ingeschreven voor de opleiding " .$_POST["opleiding"];
    }
?>