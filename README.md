# bc2504p-sp

## Part 1: RESTFul API
- @RestController (@Controller + @ResponseBody)
- @GetMapping, @PostMapping, @DeleteMapping, @PutMapping, @PatchMapping
- @RequestPara, @PathVariable, @RequestBody
- Class & Interface (xxxController.java, xxxOperation.java)
- API endpoint URI: Noun Phrase
- Spring Web (Maven Dependancy)

## Part 2: Spring Context
- Create Bean: IoC (@Contolller, @Service, @Repository, @Configuration+@Bean, @Component, @ControllerAdvice) , @Componen-self-use, @Configuration+@Bean-get other class and then use
  - @Configuration+@Bean -> i.e. RestTemplate
  - @Component -> i.e. Mapper Class (custom class)
  - @ControllerAdvice -> Global Exception Handling
- Inject Bean: DI
  - @Autowired (Search the Bean in Spring Context)
  - @Value (Search configuration params from yml)
- Inversion of Control (IoC) + Dependency Injection (DI) -> Server Starts (Bean Cycle)  -govern the must have: i.e. must have service then controller can proceed
  -create Bean of @ControllerAdvice then Bean of @Service then Bean of @Contolller
  -if Ioc and DI fails, Server start will fail
  - Spring automate the dependency check in sequence (observe @autowired)

## Part 3: Database
- JPA + Database Driver (Maven Dependency)
- application.yml -> DB connection properties
- Entity -> Table (JPA Hibernate -> create table SQL)
- @Entity, @Table, @Getter, @NoArgsConstructor, @AllArgsConstructor, @Builder
- @Column, @Id (PK), @GeneratedValue, @ManyToOne, @JoinColumn (FK)
- Repository (CRUD) - DML Operation (insert, select, update, delete)
  - JPA Methods (Java Method Pattern. i.e. Orderbyxxxx, findbyxxx, And, Or)
      - Optional<xxxx>
      - List<xxxx>
      - findAll, findById, saveAll, save, deleteAll, deleteById
      - Find by FK, i.e. PostRespository.java -> findByUserEntity
  - JPQL (Select Entity by custom query)
  - Native SQL Query (DB specific)

## Part 4: Data Transfer Object + Serialisation
- @JsonProperty (Isolate the field name between JSON and Class attribute)
- Serialisation: Java Object -> JSON
- Deserialisation: JSON -> Java Object
- /dto folder: For Controller use (request/ response)
- /model/dto/ folder: For Service use (call third party)
- Mapper (i.e. Builder Logic)
- API consumer -> controller -> select Entity -> DTO -> return API consumer
- API consumer -> controller -> DTO -> Entity -> Database
- combine two entities into one DTO
- combine two DTO into one DTO

## Part 5: AOP (@ControllerAdvice)
- Able to return a separate program flow
- return another response type
- For method caller, no longer use try-catch
- throw exception object as usual

## Part 6: 
- CommandLineRunner (Bean for AOP)
- Scheduling