# Url Hit Counter
This is a API project for counting visits to the url.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot "Spring Boot") ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white "Java") ![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white "Google Chrome")
## Frameworks and Languages
![Java v17](https://img.shields.io/badge/Java-v17-green "Java v17") ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.0.5-brightgreen "Spring Boot 3.0.5")
## Browsers / Tools
![Google Chrome](https://img.shields.io/badge/Google%20Chrome-v112.0.5615.138-yellow "Google Chrome")

---

## Model
- ### UrlHit
    - UserName
    - HitCounter
---
## Dataflow
- ### End Points / Controllers
    - `api/v1/visitor-count-app/count` 
        ```java
        @GetMapping("count")
	    public String getHitCount() {
		    return urlHitService.getIncreaseVisitor();
	    }
        ```
    - `api/v1/visitor-count-app/username/{username}/count`
        ```java
        @GetMapping("username/{username}/count")
	    public UrlHit getVisitorHitCount(@PathVariable String username) {
		    return urlHitService.getVisiterHitCount(username);
	    }
        ```
- ### Services
    - For counting visits
        ```java
        public String getIncreaseVisitor() {
		    return "visitors : " + urlHitDao.getIncreaseVisitor();
	    }
        ```
    - For counting visits for specific user
        ```java
        public UrlHit getVisiterHitCount(String username) {
		    return new UrlHit(username, urlHitDao.getVisitorHitCounter(username));
	    }
        ```
- ### Repository
    - For counting visits
        ```java
        public int getIncreaseVisitor() {
		    data.put("unknown", data.getOrDefault("unknown", 0) + 1);
		    return data.get("unknown");
	    }
        ```
    - For counting visits of a specific user
        ```java
        public Integer getVisitorHitCounter(String username) {
		    data.put(username, data.getOrDefault(username, 0) + 1);
		    return data.get(username);
	    }
        ```
- ### Database
I haven't used any **Database** in this project yet. But for data storing I have used `Collections`.

```java
private HashMap<String, Integer> data;
```
---
## Datastructures
- `HashMap<>`
---
## Summary
This API is a `Spring Boot` project that is about count the UrlHit and also for a specific user.

