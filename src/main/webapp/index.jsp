<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login and Signup Page</title>
    <link rel="stylesheet" href= "css/index_style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        /* Add your CSS here or link to an external CSS file */
    </style>
</head>
<body>
    <div class="container">
        <div class="form-wrapper" id="formWrapper">
            <!-- Login Form -->
            <div class="form-container login-form" id="loginForm">
                <h2>Login</h2>
                <form id="loginFormElement" action="<%= request.getContextPath() %>/login" method="post">
                    <div class="input-group">
                        <label for="loginUserId">User ID:</label>
                        <input type="text" id="loginUserId" name="userId" pattern="[A-Za-z0-9]{4,12}" title="User ID must be between 4 and 12 alphanumeric characters" required>
                        <small class="error-message" id="loginUserIdError"></small>
                    </div>
                    <div class="input-group">
                        <label for="loginPassword">Password:</label>
                        <input type="password" id="loginPassword" name="password" minlength="6" required>
                        <i class="fas fa-eye" id="loginShowPassword"></i>
                        <small class="error-message" id="loginPasswordError"></small>
                    </div>
                    <button type="submit">Login</button>
                    <p>Don't have an account? <a href="#" id="switchToSignup">Sign Up</a></p>
                </form>
            </div>
            
            <!-- Signup Form 
            <div class="form-container signup-form" id="signupForm">
                <h2>Sign Up</h2>
                <form id="signupFormElement" action="<%= request.getContextPath() %>/signup" method="post">
                    <div class="input-group">
                        <label for="signupUserId">User ID:</label>
                        <input type="text" id="signupUserId" name="userId" pattern="[A-Za-z0-9]{4,12}" title="User ID must be between 4 and 12 alphanumeric characters" required>
                        <small class="error-message" id="signupUserIdError"></small>
                    </div>
                    <div class="input-group">
                        <label for="signupPassword">Password:</label>
                        <input type="password" id="signupPassword" name="password" minlength="6" required>
                        <i class="fas fa-eye" id="signupShowPassword"></i>
                        <small class="error-message" id="signupPasswordError"></small>
                    </div>
                    <button type="submit">Sign Up</button>
                    <p>Already have an account? <a href="#" id="switchToLogin">Login</a></p>
                </form>
            </div> -->
        </div>
    </div>
    <button class="dark-mode-toggle" id="darkModeToggle">
        <i class="fas fa-moon moon-icon"></i> <!-- Moon icon for dark mode -->
        <i class="fas fa-sun sun-icon"></i> <!-- Sun icon for light mode -->
    </button>
    <script src="js/index_script.js"></script>
</body>
</html>
