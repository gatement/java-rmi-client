# compile
./mvnw clean package

# run
java -Dapp.rmi.server.name=vmcentos -Dapp.rmi.server.port=1099 -jar target/rmi.client.jar