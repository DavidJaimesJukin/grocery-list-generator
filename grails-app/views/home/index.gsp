<html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Grocery List Generator</h1>
    </section>
</div>

<div>
    <!-- username | logout link -->
    <g:if test="${session?.user}">
        <div id="login">
            ${session?.user?.firstName} ${session?.user?.lastName} |
            <g:link controller="user" action="logout">Logout</g:link></div>
        <!-- END #login -->
    </g:if>
</div>

<div>
    <g:if test="${session?.user}">
    </g:if>
    <g:else>
        <g:form class="simpleform" style="width:50%;" url="&#91;controller:'user',action:'login'&#93;">
            <fieldset>
                <legend>Login</legend>
                <p class="info">
                    Please login with your username and password. <br />
                    Don't have an account?
                    <g:link controller="user" action="register">Sign up now!</g:link>
                </p>
                <g:if test="${flash.message}">
                    <div class="message">${flash.message}</div>
                </g:if>
                <p>
                    <label for="username">Username</label>
                    <g:textField name="username" />
                </p>
                <p>
                    <label for="password">Password</label>
                    <g:passwordField name="password" />
                </p>
                <p class="button">
                    <label>&nbsp;</label>
                    <g:submitButton class="button" name="submitButton" value="Login" />
                </p>
            </fieldset>
        </g:form>
    </g:else>
</div>

</body>
</html>
</html>