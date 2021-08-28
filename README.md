## Micronaut 3.0.0 Documentation

- [User Guide](https://docs.micronaut.io/3.0.0/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.0.0/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.0.0/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## PeruJUG Guideline Demo
### Micronaut
- Service discovery feature (consul)
  - Agregamos en el build.gradle implementation("io.micronaut.discovery:micronaut-discovery-client")
- Load balancing (Default Round Robin selection)
- Resilience Pattern
  - Circuit Breaker, retry.
### GraalVM
- Revisamos performance/startup hello-world
- Comparamos footprint con un docker tradicional.
- Compilacion y ejecucion con GraalVM