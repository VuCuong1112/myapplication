# myapplication

Jhipster
- là công cụ để giúp generate, development và deploy web app nhanh chóng

1. Installing JHipster

      https://www.jhipster.tech/installation

2. Creating an application

      https://www.jhipster.tech/creating-an-app

3. Creating an entity

      https://www.jhipster.tech/creating-an-entity


Tạo generate 1 jhipster application:
- mkdir myapp
- cd myapp
- jhipster
- select option của jhipster
-./mvnw (build java app)
- ng serve (build angular app)


Generate controller:
jhipster spring-controller <tên>

Generate service:
jhipster spring-service <tên>

Generate entity:
jhipster entity <tên>



kill port:
netstat -ano | findstr :<PORT>
taskkill /PID <PID> /F
