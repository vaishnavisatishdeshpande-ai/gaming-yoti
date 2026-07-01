document.getElementById("signupForm").addEventListener("submit", async (e) => {

    e.preventDefault();

    const message = document.getElementById("message");

    message.innerHTML = "";
    message.className = "";

    const request = {
        username: document.getElementById("username").value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    try {

        const signupResponse = await fetch("/api/create-yoti-session", {

            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(request)

        });


        if (!signupResponse.ok) {

            const error = await signupResponse.text();

            message.className = "error";
            message.innerHTML = error;

            return;
        }

        const sessionResponse = await fetch("/api/create-yoti-session", {

            method: "POST"

        });

        if (!sessionResponse.ok) {

            const error = await sessionResponse.text();

            message.className = "error";
            message.innerHTML = error;

            return;
        }

        const session = await sessionResponse.json();

        message.className = "success";
        message.innerHTML = "Redirecting to Yoti...";

        window.location.href = session.sessionUrl;

    }
    catch (e) {

        message.className = "error";
        message.innerHTML = "Something went wrong.";

    }

});