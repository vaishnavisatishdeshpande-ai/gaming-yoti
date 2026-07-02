const params = new URLSearchParams(window.location.search);
const sessionId = params.get("sessionId");

if (!sessionId) {
    document.getElementById("title").innerHTML =
        "Verification Result";
} else {
    loadResult(sessionId);
}

async function loadResult(sessionId) {
    try {
        const response = await fetch("/api/result/" + sessionId);
        const result = await response.json();

        document.getElementById("method").innerHTML = result.method ?? "-";
        document.getElementById("status").innerHTML = result.status ?? "-";
        document.getElementById("timestamp").innerHTML = result.updated_at ?? result.created_at ?? "-";

        if (result.status === "COMPLETE") {
            document.getElementById("title").innerHTML = "Verification Successful";
            document.getElementById("ageResult").innerHTML = "OVER " + result.age + " ✓";
        } else if (result.status === "FAIL") {
            document.querySelector(".checkmark").innerHTML = "✕";
            document.getElementById("title").innerHTML = "Verification Failed";
            document.getElementById("ageResult").innerHTML = "UNDER " + result.age;
        }
        else {
            document.getElementById("ageResult").innerHTML = "Verification Pending";
        }
    }
    catch {
        document.getElementById("title").innerHTML = "Unable to retrieve verification result.";
    }

}