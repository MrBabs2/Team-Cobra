# Team-Cobra
Advanced Programming Group A - CA Two

Introduction

This technical report outlines the requirements and guidelines for a group assignment aimed at creating an information system for a selected domain of interest which after discussion with the team members we decided to go with designing a Library management system.

A library is an essential resource for any educational institution, it plays a vital role in providing students and teachers with access to reading materials that are necessary for their academic and personal growth. 

Without a proper library management system, managing a school library can be overwhelming and time-consuming. Librarians may have difficulty keeping track of the circulation of materials, which can result in lost or misplaced books. Students and teachers may have difficulty finding the needed materials, which can impede their learning and research. 

This understanding of the importance of a library management system forms the basis of this project, which aims to design and implement a library management system that will streamline the management of library resources.



Requirement

The Cobra Library Management system was designed to operate as an INSERT-ONLY database system as part of the project requirements. This means that users are not permitted to modify, update or delete their data directly. Instead, they have to contact customer support through their dashboard for any necessary modifications. Additionally, all data are kept for a period of one year, in accordance with GDPR standards. This system operates similarly to a school management system, where only the school system administrators are authorized to delete, update, or modify student records, which were created by registering on the school portal.



Development

The frontend of the Cobra Library Management system was developed using HTML, CSS, and JavaScript, while Firebase and Webpack were used for the backend. Firebase served as the database for storing user information and handled user authentication during login. Webpack was used as a bundler to ensure seamless functionality of all pages and resources as a single application.

To collect and save user information to Firebase Realtime database, various HTML, CSS, and JavaScript files were designed. Bootstrap v5.1.3 was used to develop the UI for the pages, with each CSS file styling the elements in its respective HTML file. The JavaScript files were used for backend services such as Firebase configuration, authentication, and DOM manipulation. Most of the images were hosted on a third-party platform called Cloudinary, and a policy statement listener was included. The JavaScript files were bundled and used as the associated JavaScript file in each HTML file.

The webpack.config.js file was used as a configuration point for backend development(firebase) it contained various configurations which can be found in the webpack.config.js file. 

The Firebase services ensured all processes related to our backend for the project were implemented and users' information was saved onto its real-time database section and authenticated under its Firebase authentication service.

The Firebase authentication services also possess the ability to perform email verification, password reset, email-address change, and two-factor authentication only through its project account on Firebase.

The register.js comprised of various server-side services provided by firebase as this was the primary point of collecting users' information at the point of registration. These services include:
•	Firestore: The firestore served as a database for storing collections of user information by creating various documents with unique IDs in the firestore real-time database of all signed-up users while using timestamps for ordering the users. 
•	Firebase Authentication:  For authenticating the Cobra Libra Management system, two service providers were configured onto firebase, and this includes authentication related to email address and password. This was done to ensure a user does not sign-up multiple times on the database. 



Definition of Terms
•	Bootstrap: is a responsive website framework used for building both mobile and web applications (What is Bootstrap, 2023).
•	Webpack: is a module bundler that compiles JavaScript files for serving to the browser (what is Webpack, 2023).
•	Date FNS: is a JavaScript utility framework for manipulating dates in the browser and Node.js (date-fns, 2023).
•	Firebase: is a backend-as-a-service platform offering services such as authentication, real-time database, cloud storage, and web hosting for static files (firebase, 2023).
•	Cloudinary: is a multimedia storage service that enables easy integration of multimedia files into software applications (Cloudinary, 2023).
•	Boxicons: This is an icon library that offers over 1500 customizable vector icons, which can be conveniently integrated into web applications.
•	W3School SVG: This is a collection of scalable vector graphics (SVG) that can be utilized in web applications. SVG is an XML-based format used for creating vector graphics that can be displayed on web pages.
•	JQuery: This is a JavaScript library that simplifies HTML document traversal and manipulation, event handling, and animation. It is extensively used to simplify the client-side scripting of HTML.



Software utilized.

The project utilized the following software:

•	Visual Studio Code: We used Visual Studio Code as our staging platform for writing code and testing dependencies. This platform helped us manage our code by enabling versioning and source control. We also installed several extensions in VS Code, including npm Intellisense v1.4.4, Firebase Explorer v0.3.3, HTML CSS Support v1.13.1, GitHub Pull Requests and Issues v0.62.0, and others, which made using VS Code seamless.

•	GitHub: To collaborate while each team member focused on different assigned features, we used GitHub as an important tool. It allowed all team members to have a central repository where they could commit codes written in their local host. This enabled other members to see their commits and work with those commits for other dependencies. 

The project made use of various third-party libraries and frameworks which are pre-built software components integrated into a larger software project to provide specific functionality or features. The following below were utilized in the project:
•	Bootstrap
•	Boxicons
•	W3School SVG
•	DATEFNS
•	Cloudinary
•	Flutterwave integration
•	API (LOCAL API = GEOLOCATION API, LOCAL STORAGE API)
•	AUTHENTICATION (REGEX EXPRESSION AND FIREBASE AUTHENTICATION SERVICES)



Modules Implemented and Methodology

The project comprised various modules assigned to each team member for development. The key modules implemented are listed below:

1.	Home Page: This module acts as the default landing page when users visit the site.

2.	Register Page: This page enables users to sign up for the library system and can be accessed from the home page.

3.	Login Page: Returning users can log in to the platform using this page.

4.	Library Page: This module displays the available books in the library, and authenticated users can search for books and borrow them from this page.

5.	User Page: Upon successful login, users are directed to this landing page.

6.	Checkout Page: After borrowing a book from the library page, authenticated users are directed to this page to make payment for the book. The library page integrates a payment gateway to facilitate this process.

7.	Customer Rater Page: This page allows users to rate their experience on the application with the ratings to be used to determine customer experience and acceptance of the users.

During the project, each team member created a separate branch on the GitHub repository to work on their assigned pages. Commits related to their respective tasks were made on their individual branches. Additionally, the team conducted weekly sprint retrospectives where they discussed the project's progress and any issues that arose. At these meetings, the team merged their individual branches locally and referenced them in the relevant module pages, based on the project's design flow. The team completed bundles, merges, and referencing during these weekly meetings.
 
 
 
 
Installing dependencies and packages

To install the necessary dependencies and packages required to complete the implementation of this project, please follow these steps:

1.	Open Git Bash or command line tools at the application file and run the command below to check if Node is installed: “node -v”

2.	If Node is not installed on your system, download it from its official website. Otherwise, run the following command: “npm init -y”
This initializes the package.json and package.lock.json files that store all the dependencies and modules for the project.

3.	Once the packages have been created and saved in your project folder, run this command to initialize and save webpack, which monitors all activities in the project: “npm i webpack webpack-cli -D”
The -D flag saves webpack as a dev dependency.

4.	After webpack has been saved to your dev dependencies, install Firebase with the following command: “npm i firebase”
This installs the Firebase package as a dependency in your project with its latest version.

5.	Once Firebase has been installed, run the following command to ensure that webpack monitors and watches changes in the bundle.js file in the project: “npm run build”
This command sets npm run build in the package.json file under the script object as "webpack" and initiates webpack processes in the project.



Individual contribution

OTITE AKPOFURE:

For the Cobra Library Management system project, I developed the front-end registration functionality using HTML, CSS, and JavaScript, with register.html, register.css, and register.js files. These files were used to create input elements that collected and retrieved user information, which was then saved onto the Firebase Realtime database.
To authenticate users, I set up a custom domain under Firebase, which was implemented by setting up a live server that provided a localhost domain at 127.0.0.1:5500. A live server can be implemented by either downloading its extension on VS Code or running the command "npm i live-server -g".
In the register.js file, I set up a regular expression (regex) expression for client-side authentication. This was done to check all input fields by the user and obtain user information while marking all fields as required. Additionally, I set up the Geolocation API to obtain the location of users and the local storage API to store users’ information on their browsers.
On the library.js page, I created a payment button that could only be displayed if a user borrowed a book. When the button was clicked, it displayed the Flutterwave payment integration page for collecting payment from users and sending a confirmation email of payment receipt to users. It's important to note that this is a Flutterwave payment integration API, which can be used for payment testing with only testing cards available. Testing cards can be found here: https://developer.flutterwave.com/docs/integration-guides/testing-helpers/.
On the user.js file, I set up an event listener on the order history to showcase the borrowed book by the user. I also set up a return date function for the book by using the DateFns Library to calculate the time for returning the book.
On the GitHub repository, I established the Register and backend branches. Additionally, I ensured that both the backend and frontend were appropriately bundled and working synchronously.

OLUWATOMI BABATUNDE

I utilized HTML, CSS, and JavaScript to develop multiple pages for the application. One of these pages is the user landing page, which users are directed to after logging in successfully. The landing page includes a sidebar with buttons for navigating to the home page, order history, library page, logging out, and contacting support.
Furthermore, I created the login page, which includes a random quote generator and a cookies consent function. I also built a customer rating page that allows users to rate their experience with the application. This rating system helps to evaluate users' acceptance of the application. All these pages were created during the development session and are visible in the commits on the GitHub repository where I created the User-Dashboard and Login-Home-Page Branches.
Throughout the project's life cycle, I played an active role in the application's design process and served as the UAT tester. As part of my responsibilities, I performed both functional and end-to-end tests to ensure the application's smooth operation.
To guarantee that the changes made did not affect any existing functionalities, I conducted tests on every module bundling. Whenever I discovered any issues, I collaborated with the team to make the necessary corrections. My aim was to ensure that the application was always functioning optimally and that any issues were quickly resolved.
 
OMONIYI ADEOLA IBIYEYE

As part of my project responsibilities, I developed the library page that enables logged-in users to search for and borrow books. Leveraging HTML, CSS, and JavaScript, I focused on ensuring the page is both functional and user-friendly.
Specifically, I made sure that the carousel on the library page is operational and introduced a search bar that enables users to scour the library's database for books. In addition to a navigation bar, the page features a search form and a section dedicated to showcasing books.
To enhance user-friendliness, I integrated a swiper container that displays available books in the library. Each book is presented in a card format, which features the book's title, author, image, and a button for borrowing the book. Throughout the project, I aimed to improve the library page's overall user experience and functionality. To accomplish this, I created a dedicated branch on the GitHub repository called Library-Page. This branch served as a space where I made all the essential commits related to the Library Page.
In addition to my frontend development duties, I actively participated in sprint retrospectives for the project. This involvement helped me improve my backend development skills while also allowing me to conduct user testing on other modules. My overall aim was to optimize the user experience and functionality of the entire application.
 
EMMANUEL BAMBI ADEBAYO

Throughout the initial research and ideation stage of the project, I actively participated in gathering requirements, researching industry standards, and brainstorming design ideas for a website for a library management system. Working collaboratively with other team members, we identified functionalities to be deployed for this project. Additionally, I conducted user research to gain a better understanding of user behaviors and preferences, providing valuable insights and ideas that helped jumpstart the project's design, implementation, and development.
I also designed the user interfaces for each module of the project using Figma, which provided a user-friendly and clear interface. I developed the Launching Soon page that includes a countdown timer, redirecting users to a launch page for services that are not yet finalized. The countdown timer was implemented using JavaScript to update in real-time. Furthermore, I created the home page of the website using Bootstrap, CSS, and HTML. This page is the library management system's index page, and the first page users see when they visit the site.

Furthermore, I established a GitHub repository and extended invitations to other team members to collaborate on the project. Additionally, I created a dedicated branch on this repository where I made commits concerning the developed pages.
Overall, I had contributions through the development lifecycle of this project and the designs created using Figma served as a template for guiding team members as they previewed the website prototype and developed their respective pages for the project.
 

REFERENCES 

•	What is Bootstrap (2023). Available at: https://www.w3schools.com/whatis/whatis_bootstrap.asp (Accessed: 14 April 2023).
•	what is webpack - Google Search (2023). Available at: https://www.google.com/search?q=what+is+webpack+&sxsrf=APwXEdckDmL0WeS6JJB5iAXSl_jzb8vSzA%3A1681481258268&ei=Kl45ZLKCEIe4gQaF1oFI&ved=0ahUKEwiyv-Hoxan-AhUHXMAKHQVrAAkQ4dUDCA8&uact=5&oq=what+is+webpack+&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCAAQigUQQzIFCAAQgAQyCggAEIAEEBQQhwIyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgoIABBHENYEELADOgQIIxAnOgYIABAWEB46CAgAEBYQHhAPOggIABAWEB4QCjoHCCMQ6gIQJzoNCAAQjwEQ6gIQtAIYAToNCC4QjwEQ6gIQtAIYAToICAAQigUQkQI6CwguEIAEELEDEIMBOgsIABCABBCxAxCDAToNCAAQigUQsQMQgwEQQzoICAAQgAQQsQNKBAhBGABQ-QNY2CFgvCVoAnABeAWAAfkCiAG3G5IBCDEyLjEuMi42mAEAoAEBsAEUyAEIwAEB2gEGCAEQARgK&sclient=gws-wiz-serp (Accessed: 14 April 2023)
•	Firebase (2023). Available at: https://docs.flutter.dev/development/data-and-backend/firebase (Accessed: 15 April 2023).
•	Date-fns - modern JavaScript date utility library (2023). Available at: https://date-fns.org/ (Accessed: 14 April 2023)


![image](https://user-images.githubusercontent.com/123475070/232367650-08e11d23-8999-48e2-9c10-4af4276a4828.png)











