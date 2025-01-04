<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="/css/registerstyle.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <div class="container">
        <div class="form-wrapper" id="formWrapper">
            <!-- Registration Form -->
            <div class="form-container register-form">
                <h2>Register</h2>
                <form id="registerFormElement" action="<%= request.getContextPath() %>/register" method="post">
                    
                    <div class="hidden input-group" id="userIdGroup">
                        <label for="userId">User ID:</label>
                        <input type="text" id="userId" name="userId" readonly>
                    </div>
                    <div class="input-group">
                        <label for="registerFirstName">First Name:</label>
                        <input type="text" id="registerFirstName" name="firstName" required>
                    </div>
                    <div class="input-group">
                        <label for="registerLastName">Last Name:</label>
                        <input type="text" id="registerLastName" name="lastName" required>
                    </div>
                    <div class="input-group">
                        <label for="registerEmail">Email ID:</label>
                        <input type="email" id="registerEmail" name="email" required>
                    </div>
                    <div class="input-group">
                        <label for="registerPassword">Password:</label>
                        <input type="password" id="registerPassword" name="password" minlength="6" required>
                        <i class="fas fa-eye" id="registerShowPassword"></i>
                    </div>
                    <div class="input-group">
                        <label for="registerRole">Role:</label>
                        <select id="registerRole" name="role" required>
                            <option value="User">User</option>
                            <option value="Librarian">Librarian</option>
                            <option value="Admin">Admin</option>
                        </select>
                    </div>
                    <button type="submit">Register</button>
                </form>
            </div>
        </div>
    </div>
    <button class="dark-mode-toggle" id="darkModeToggle">
        <i class="fas fa-moon moon-icon"></i> <!-- Moon icon for dark mode -->
        <i class="fas fa-sun sun-icon"></i> <!-- Sun icon for light mode -->
    </button>
    <script src="/js/userregisterscript.js"></script>
</body>
</html>
