// Toggle password visibility
document.addEventListener('DOMContentLoaded', function() {
	const form = document.getElementById('registerFormElement');
	  form.addEventListener('submit', function(event) {

	    const xhr = new XMLHttpRequest();  

	    xhr.open('GET', form.action,  
	 true); // Use POST method for form data

	    // Set the content type header to indicate form data
	    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

	    xhr.onload = function() {
	      if (xhr.status === 200) {
	        console.log(xhr.responseText);
	        const  
	 userIdElement = document.getElementById('userIdGroup');
	        userIdElement.value = xhr.responseText;
	        userIdElement.classList.remove('hidden');
	        userIdElement.classList.add('visible');
	      } else {
	        console.log('Error: ' + xhr.statusText);
	      }
	    };

	    xhr.onerror = function() {
	      console.log('Request failed.');
	    };

	    xhr.send(); // Send the form data using FormData
	  });

	  //
	
	const passwordInputs = document.querySelectorAll('.password-group input[type="password"]');
	// Toggle password visibility for register
	    registerShowPassword.addEventListener('click', function() {
	        const passwordInput = document.getElementById('registerPassword');
	        if (passwordInput.type === 'password') {
	            passwordInput.type = 'text';
	            registerShowPassword.classList.replace('fa-eye', 'fa-eye-slash');
	        } else {
	            passwordInput.type = 'password';
	            registerShowPassword.classList.replace('fa-eye-slash', 'fa-eye');
	        }
	    });


    // Dark mode toggle
    const darkModeToggle = document.getElementById('darkModeToggle');

    if (darkModeToggle) {
        darkModeToggle.addEventListener('click', function() {
            document.body.classList.toggle('dark-mode');
            document.body.classList.toggle('light-mode');

            // Optional: Save user preference in local storage
            if (document.body.classList.contains('dark-mode')) {
                localStorage.setItem('theme', 'dark');
            } else {
                localStorage.setItem('theme', 'light');
            }
        });

        // Load theme from local storage
        const savedTheme = localStorage.getItem('theme');
        if (savedTheme === 'dark') {
            document.body.classList.add('dark-mode');
            document.body.classList.remove('light-mode');
        } else {
            document.body.classList.add('light-mode');
            document.body.classList.remove('dark-mode');
        }
    }
});



