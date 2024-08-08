# Java Servlet Project

This project includes a Java Servlet that handles user sign-up and log-in requests. The servlet redirects users to different HTML pages based on the button they clicked.

## Project Structure

- `src/`
  - `SignUp_servlet.java` - A servlet that processes sign-up and login requests.
- `web/`
  - `signup.html` - The HTML page for user sign-up.
  - `login.html` - The HTML page for user log-in.

## Dependencies

- Jakarta Servlet API (for servlet functionality)
- A servlet container like Apache Tomcat for running the servlets

## Servlet Details

### `SignUp_servlet.java`

This servlet handles HTTP requests to the `/signup` endpoint. It checks the button clicked by the user and redirects them to the appropriate HTML page.

- **URL Mapping**: `/signup`
- **Method**: `service(HttpServletRequest req, HttpServletResponse res)`

#### Logic

- **SIGN UP Button**: Redirects to `signup.html`
- **LOG IN Button**: Redirects to `login.html`
- **Other Button Clicks**: No action (empty else block)

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed.
2. **Apache Tomcat**: You need a servlet container like Apache Tomcat to run the servlet.

## Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Nachu20/WebServlet.git
   cd WebServlet
