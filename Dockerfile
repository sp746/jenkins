FROM openjdk:11
WORKDIR /app
COPY . .
RUN apt-get update && apt-get install -y \
    maven \
    xvfb \
    chromium-browser
CMD ["mvn", "test"]
