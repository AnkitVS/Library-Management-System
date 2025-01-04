document.addEventListener('DOMContentLoaded', function() {
    // Elements for form switching
    const loginShowPassword = document.getElementById('loginShowPassword');
    const signupShowPassword = document.getElementById('signupShowPassword');
    const formWrapper = document.getElementById('formWrapper');
    const switchToSignup = document.getElementById('switchToSignup');
    const switchToLogin = document.getElementById('switchToLogin');
    const darkModeToggle = document.getElementById('darkModeToggle');

    // Initialize dark mode based on localStorage
    const isDarkMode = localStorage.getItem('dark-mode') === 'true';
    if (isDarkMode) {
        document.body.classList.add('dark-mode');
        document.body.classList.remove('light-mode');
    } else {
        document.body.classList.add('light-mode');
        document.body.classList.remove('dark-mode');
    }

    // Toggle password visibility for login
    loginShowPassword.addEventListener('click', function() {
        const passwordInput = document.getElementById('loginPassword');
        if (passwordInput.type === 'password') {
            passwordInput.type = 'text';
            loginShowPassword.classList.replace('fa-eye', 'fa-eye-slash');
        } else {
            passwordInput.type = 'password';
            loginShowPassword.classList.replace('fa-eye-slash', 'fa-eye');
        }
    });

    // Toggle password visibility for signup
    signupShowPassword.addEventListener('click', function() {
        const passwordInput = document.getElementById('signupPassword');
        if (passwordInput.type === 'password') {
            passwordInput.type = 'text';
            signupShowPassword.classList.replace('fa-eye', 'fa-eye-slash');
        } else {
            passwordInput.type = 'password';
            signupShowPassword.classList.replace('fa-eye-slash', 'fa-eye');
        }
    });

    // Switch to Signup form
    switchToSignup.addEventListener('click', function(e) {
        e.preventDefault();
        formWrapper.style.transform = 'translateX(-50%)'; // Slide to show signup
    });

    // Switch to Login form
    switchToLogin.addEventListener('click', function(e) {
        e.preventDefault();
        formWrapper.style.transform = 'translateX(0)'; // Slide to show login
    });

    // Toggle dark mode
    darkModeToggle.addEventListener('click', function() {
        const isDarkMode = document.body.classList.contains('dark-mode');
        if (isDarkMode) {
            document.body.classList.remove('dark-mode');
            document.body.classList.add('light-mode');
        } else {
            document.body.classList.remove('light-mode');
            document.body.classList.add('dark-mode');
        }
        // Save the current mode to localStorage
        localStorage.setItem('dark-mode', !isDarkMode);

        // Toggle icon visibility
        const moonIcon = darkModeToggle.querySelector('.moon-icon');
        const sunIcon = darkModeToggle.querySelector('.sun-icon');
        moonIcon.style.display = isDarkMode ? 'block' : 'none';
        sunIcon.style.display = isDarkMode ? 'none' : 'block';
    });

    // Initialize icon visibility
    const moonIcon = darkModeToggle.querySelector('.moon-icon');
    const sunIcon = darkModeToggle.querySelector('.sun-icon');
    moonIcon.style.display = isDarkMode ? 'block' : 'none';
    sunIcon.style.display = isDarkMode ? 'none' : 'block';

    // Form validation
    const loginForm = document.getElementById('loginFormElement');
    const signupForm = document.getElementById('signupFormElement');

    loginForm.addEventListener('submit', function(e) {
        if (!loginForm.checkValidity()) {
            e.preventDefault();
            displayValidationErrors(loginForm);
        }
    });

    signupForm.addEventListener('submit', function(e) {
        if (!signupForm.checkValidity()) {
            e.preventDefault();
            displayValidationErrors(signupForm);
        }
    });

    function displayValidationErrors(form) {
        const inputs = form.querySelectorAll('input');
        inputs.forEach(input => {
            const errorElement = document.getElementById(input.id + 'Error');
            if (input.validity.valid) {
                errorElement.textContent = '';
            } else {
                errorElement.textContent = input.validationMessage;
            }
        });
    }
});
