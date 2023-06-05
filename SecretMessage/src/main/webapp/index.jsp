<html>
<body>
<h2>Hello World!</h2>
<a href="register">For Registeration</a>
<form onsubmit="handleSubmit(event)" action="successPage/" method="post">
	<input name="username" placeholder="enter the username" />
	<input name="secretMsg" placeholder="enter the secret message" />
	<input type="submit" value="submit"/>
</form>
</body>
<script>
    function handleSubmit(event) {
      event.preventDefault(); // Prevent the default form submission behavior
      var form = event.target;
      var formData = new FormData(form);
      var newURL = form.action+"new Data";
      window.location.href = newURL;
    }
  </script>
</html>
