# Store API (Spring Boot REST)

## Run
```bash
mvn spring-boot:run
```

App runs on: `http://localhost:8080`

## Swagger UI
Open:
- `http://localhost:8080/swagger-ui.html`

## H2 Console
Open:
- `http://localhost:8080/h2-console`
JDBC URL: `jdbc:h2:mem:storedb`
User: `sa` (no password)

## Endpoints
- GET `http://localhost:8080/products/health` -> API running
- GET `http://localhost:8080/products` -> list products
- GET `http://localhost:8080/products/{id}` -> product by id
- POST `http://localhost:8080/products` -> create
- PUT `http://localhost:8080/products/{id}` -> update
- DELETE `http://localhost:8080/products/{id}` -> delete

## Sample JSON (POST/PUT)
```json
{
  "name": "Mouse",
  "category": "Electronics",
  "price": 80.0,
  "quantity": 10
}
```
