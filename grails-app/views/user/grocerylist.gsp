<html>
<head>
    <title>Grocery List</title>
    <meta name="layout" content="main"/>
</head>

<body>
    <h1>Grocery list for ${user.loginId}</h1>

    <g:each var="recipe" in="${user.recipes}">
        <g:each var="ingredient" in="${recipe.ingredients}">
           <li>${ingredient}</li>
        </g:each>
    </g:each>
</body>
</html>