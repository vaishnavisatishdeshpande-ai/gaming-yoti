# Gaming Yoti

A Spring Boot application that integrates with the Yoti Age Verification API.

## Live Application

The application is deployed on Render and can be accessed at:

**https://gaming-yoti.onrender.com**

---

## Prerequisites

- Java 21
- Maven 3.9+
- Git

---

## Clone the Repository

```bash
git clone https://github.com/vaishnavisatishdeshpande-ai/gaming-yoti.git
cd gaming-yoti
```

---

## Configure Environment Variables

Set the following environment variables before running the application.

### macOS / Linux

```bash
export YOTI_API_KEY=<your_yoti_api_key>
export YOTI_SDK_ID=<your_yoti_sdk_id>
export AGE_THRESHOLD=25
export YOTI_CALLBACK_URL=https://your-domain.com/result.html
```

### Windows

```cmd
set YOTI_API_KEY=<your_yoti_api_key>
set YOTI_SDK_ID=<your_yoti_sdk_id>
set AGE_THRESHOLD=25
set YOTI_CALLBACK_URL=https://your-domain.com/result.html
```

---

## Build the Application

```bash
./mvnw clean package
```

---

## Run the Application

```bash
./mvnw spring-boot:run
```

The application will be available at:

```
http://localhost:8080
```

---

## Running with Docker (Optional)

Build the Docker image:

```bash
docker build -t gaming-yoti .
```

Run the container:

```bash
docker run \
-e YOTI_API_KEY=<your_yoti_api_key> \
-e YOTI_SDK_ID=<your_yoti_sdk_id> \
-e AGE_THRESHOLD=25 \
-e YOTI_CALLBACK_URL=<your_callback_url> \
-p 8080:8080 \
gaming-yoti
```

The application will be available at:

```
http://localhost:8080
```

---

## Notes

- The live application is available at **https://gaming-yoti.onrender.com**.
- API keys and SDK IDs are provided through environment variables and are **not** included in this repository.
- No personally identifiable information (PII) is stored in the repository.
