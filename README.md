# ms-pedidos

## Descripción
Microservicio para gestionar el catálogo de pedidos

## Tecnologías
- Java 17
- Spring Data JPA
- PostgreSQL (Neon)
- Lombok
- Docker

## Endpoints
| Método | URL | Descripción |
|--------|-----|-------------|
| POST | /api/pedidos | Crear producto |
| GET | /api/pedidos | Listar todos |
| GET | /api/pedidos/{id} | Buscar por ID |
| PUT | /api/pedidos/{id} | Actualizar |
| DELETE | /api/pedidos/{id} | Eliminar |

## Variables de entorno
- `DB_URL` - URL de conexión a PostgreSQL
- `DB_USERNAME` - Usuario de la base de datos
- `DB_PASSWORD` - Contraseña
- `DB_PORT` - Puerto del servidor

## Ejecutar en local
1. Configura las variables de entorno en IntelliJ (Run → Edit Configurations)
2. Ejecuta `MsProductosApplication.java`
3. Dar hit a `http://localhost:8080/api/pedidos`

## URL desplegada
https://examenfinal-ms-pedidos.onrender.com
