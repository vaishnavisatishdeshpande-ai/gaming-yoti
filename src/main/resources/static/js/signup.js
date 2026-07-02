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
        const response = await fetch("/api/signup", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(request)
        });

        if (!response.ok) {
            const error = await response.text();
            message.className = "error";
            message.innerHTML = error;
            return;
        }

        const signup = await response.json();
        message.className = "success";
        message.innerHTML = "Redirecting to Yoti...";
        window.location.href = signup.sessionUrl;
    } catch (e) {
        message.className = "error";
        message.innerHTML = "Something went wrong.";
    }
});