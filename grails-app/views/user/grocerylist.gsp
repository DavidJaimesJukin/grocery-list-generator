<html>
<head>
    <title>Grocery List</title>
    <meta name="layout" content="main"/>
</head>

<body>
    <h1>Grocery list for ${user.loginId}</h1>
    <table>
                <thead>
        <tr>
            <th>Name</th>
            <th>number of units</th>
            <th>units</th>
        </tr>
        </thead>

    <g:each var="recipe" in="${user.recipes}">
        <g:each var="ingredient" in="${recipe.ingredients}">
            <tbody>
             <tr>
                <td>${ingredient.name}</td>
                <td>${ingredient.amount}</td>
                <td>${ingredient.unitOfMeasurement}</td>
            </tr>
            </tbody>
        </g:each>
    </g:each>
    </table>

</body>
</html>