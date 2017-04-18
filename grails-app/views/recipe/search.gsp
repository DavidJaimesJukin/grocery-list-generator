<html>
<head>
    <meta name="layout" content="main" />
</head>

<body>
<fieldset class="form">
    <g:form action="search" method="GET">
        <div class="fieldcontain">
            <label for="query">Search for recipes:</label>
            <g:textField name="query" value="${params.query}"/>
        </div>
    </g:form>
</fieldset>

<g:each var="r" in="${recipeList}">
    <li>${r.name}</li>
</g:each>


</body>
</html>
