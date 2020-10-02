<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="style/style.css" />
<html>
<head>
    <title>Add</title>
</head>
<body>
<h1>Sporthal de slag</h1>
<nav>
    <ul>
        <li><a href="Servlet?command=home">Home</a></li>
        <li><a href="add.jsp">Voeg Toe</a></li>
        <li><a href="Servlet?command=overview">Overzicht</a></li>
    </ul>
</nav>
    <h2>Voeg je Bezoek toe</h2>
    <form method="POST" action="Servlet?command=voegToe" novalidate>
        <p>
            <label for="naam">Naam:</label>
            <input id="naam" name="naam" type="text">
        </p>
        <p>
            <label for="rijksregister">rijksregisternr:</label>
            <input id="rijksregister" name="rijksregister" type="text">
        </p>
        <p>
            <label for="telefoonnr">telefoonnr:</label>
            <input id="telefoonnr" name="telefoonnr" type="number">
        </p>
        <p>
            <label for="beginuur">beginuur:</label>
            <input id="beginuur" name="beginuur" type="number" max="23" min="0">
        </p>
        <p>
            <label for="datum">datum:</label>
            <input id="datum" name="datum" type="text">
        </p>
        <p>
            <input type="submit" value="Voeg bezoek toe" id="submit">
        </p>
        <p class="left">Alle velden zijn verplicht.</p>
    </form>
    </main>
</body>
</html>
