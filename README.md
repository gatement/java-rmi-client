# compile
./mvnw clean package

# run
java -Dapp.rmi.server.name=192.168.56.101 -Dapp.rmi.server.port=1099 -jar target/rmi.client.jar