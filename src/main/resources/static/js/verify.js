document.getElementById("verifyButton").addEventListener("click", async () => {

    const message = document.getElementById("message");

    message.innerHTML = "";
    message.className = "";

    try {

        const response = await fetch("/api/create-yoti-session", {
            method: "POST"
        });

        if (!response.ok) {

            const error = await response.text();

            message.className = "error";
            message.innerHTML = error;

            return;
        }

        const session = await response.json();

        message.className = "success";
        message.innerHTML =
            "Yoti session created successfully.<br><br>Session ID:<br>" +
            session.id;

        /* replace the above with:
         * window.location.href = session.launchUrl;
         */

    }
    catch (e) {

        message.className = "error";
        message.innerHTML =
            "Unable to create Yoti session.";

    }

});