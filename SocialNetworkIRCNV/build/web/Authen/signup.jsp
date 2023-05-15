<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <div class="vh-100 d-flex justify-content-center align-items-center">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="col-12 col-md-8 col-lg-6">
                        <div class="card bg-white">
                            <div class="card-body p-5">
                                <form class="mb-3 mt-md-4">
                                    <h2 class="fw-bold mb-2 text-uppercase ">Login</h2>
                                    <p class=" mb-5">Please enter your login and password!</p>
                                    <div class="mb-3">
                                        <label for="username" class="form-label ">Username</label>
                                        <input type="text" class="form-control" id="username">
                                    </div>
                                    <div class="mb-3">
                                        <label for="password" class="form-label ">Password</label>
                                        <input type="password" class="form-control" id="password">
                                    </div>
                                    <div class="d-grid">
                                        <button class="btn btn-outline-dark" type="submit">Login</button>
                                    </div>
                                </form>
                                <div>
                                    <p class="mb-0  text-center">Don't have an account? <a href="Signup.jsp" class="text-primary fw-bold">Sign Up</a></p>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>'
    <script type="module">
  // Import the functions you need from the SDKs you need
  import { initializeApp } from "https://www.gstatic.com/firebasejs/9.21.0/firebase-app.js";
  import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.21.0/firebase-analytics.js";
  // TODO: Add SDKs for Firebase products that you want to use
  // https://firebase.google.com/docs/web/setup#available-libraries

  // Your web app's Firebase configuration
  // For Firebase JS SDK v7.20.0 and later, measurementId is optional
  const firebaseConfig = {
    apiKey: "AIzaSyDa48uGKx-hKs3OK4zgQBMknXBRwGw6izU",
    authDomain: "ircn-v.firebaseapp.com",
    databaseURL: "https://ircn-v-default-rtdb.firebaseio.com",
    projectId: "ircn-v",
    storageBucket: "ircn-v.appspot.com",
    messagingSenderId: "103104264353",
    appId: "1:103104264353:web:ffe7425ca7c28591c058e0",
    measurementId: "G-EB9J7FBR1H"
  };

  // Initialize Firebase
  const app = initializeApp(firebaseConfig);
  const analytics = getAnalytics(app);
</script>

</html>